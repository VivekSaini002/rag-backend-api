# RAG Backend API

A Spring Boot backend application implementing **Retrieval Augmented Generation (RAG)** with Google Gemini AI integration and MariaDB vector store capabilities. This project provides a REST API for AI-powered chat with context retrieval from a vector database.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Installation & Setup](#installation--setup)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Architecture](#architecture)
- [Building & Deployment](#building--deployment)
- [Troubleshooting](#troubleshooting)

## 🎯 Overview

This RAG Backend API combines:
- **Google Gemini AI** for natural language processing and embeddings
- **Spring AI** framework for RAG orchestration
- **MariaDB** with vector store capabilities for document retrieval
- **Spring Boot** (v4.1.0) for REST API development

The application enables intelligent chat interactions where responses are augmented with relevant context from stored documents.

## ✨ Features

- **Retrieval Augmented Generation (RAG)**: Combines AI models with document retrieval for contextual answers
- **Vector Store Integration**: Utilizes MariaDB with vector embeddings for semantic search
- **Chat Memory**: Maintains conversation history per user
- **Google Gemini Integration**: Uses Gemini 2.5 Flash for chat and embedding models
- **REST API**: Simple endpoints for chat interactions
- **Streaming Support**: Optional streaming responses for real-time chat
- **Document Management**: Add and manage documents in the vector store

## 📦 Prerequisites

### System Requirements
- **Java**: Version 21 or higher
- **Maven**: Version 3.6.0 or higher
- **MariaDB**: Version 10.4 or higher
- **Git**: For version control

### API Keys & Services
- **Google Gemini API Key**: Required for AI and embedding models
  - Sign up at [Google AI Studio](https://makersuite.google.com/app/apikey)

## 📁 Project Structure

```
rag-backend-api/
├── src/
│   ├── main/
│   │   ├── java/com/ai/
│   │   │   ├── RagAppApplication.java          # Spring Boot entry point
│   │   │   ├── controller/
│   │   │   │   └── AiController.java           # REST API endpoints
│   │   │   ├── service/
│   │   │   │   ├── ChatService.java            # Service interface
│   │   │   │   └── ChatServiceImpl.java         # Service implementation
│   │   │   ├── advisor/                        # RAG advisors (future expansion)
│   │   │   ├── config/                         # Spring configurations
│   │   │   └── helper/                         # Utility classes
│   │   └── resources/
│   │       ├── application.properties          # Application configuration
│   │       └── prompts/
│   │           ├── system-message.st           # System prompt template
│   │           └── user-message.st             # User prompt template
│   └── test/                                   # Test classes
├── pom.xml                                     # Maven configuration
├── mvnw & mvnw.cmd                             # Maven wrapper scripts
├── .gitignore                                  # Git ignore rules
└── README.md                                   # This file
```

## 🚀 Installation & Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/VivekSaini002/rag-backend-api.git
cd rag-backend-api
```

### Step 2: Set Up MariaDB

#### Option A: Local Installation

1. **Install MariaDB** (if not already installed)
   ```bash
   # macOS (using Homebrew)
   brew install mariadb
   
   # Ubuntu/Debian
   sudo apt-get install mariadb-server
   
   # Windows
   # Download from https://mariadb.org/download/
   ```

2. **Start MariaDB Service**
   ```bash
   # macOS
   brew services start mariadb
   
   # Ubuntu/Linux
   sudo systemctl start mariadb
   
   # Windows (if installed as service)
   net start MariaDB
   ```

3. **Create Database**
   ```bash
   mysql -u root -p
   
   # In MariaDB shell:
   CREATE DATABASE `spring-ai`;
   USE `spring-ai`;
   ```

#### Option B: Docker (Recommended)

```bash
docker run -d \
  --name mariadb-rag \
  -p 3308:3306 \
  -e MYSQL_ROOT_PASSWORD=root \
  -e MYSQL_DATABASE=spring-ai \
  mariadb:latest
```

### Step 3: Obtain Google Gemini API Key

1. Visit [Google AI Studio](https://makersuite.google.com/app/apikey)
2. Create a new API key
3. Keep this key safe - you'll need it in the next step

### Step 4: Set Environment Variables

#### Linux/macOS:
```bash
export GEMINI_API_KEY="your-api-key-here"
```

#### Windows (Command Prompt):
```cmd
set GEMINI_API_KEY=your-api-key-here
```

#### Windows (PowerShell):
```powershell
$env:GEMINI_API_KEY="your-api-key-here"
```

#### Alternative: Configure in application.properties
Edit `src/main/resources/application.properties`:
```properties
spring.ai.google.genai.api-key=your-api-key-here
```

## ⚙️ Configuration

### application.properties

The main configuration file is located at `src/main/resources/application.properties`:

```properties
# Application Name
spring.application.name=RagApp

# Google Gemini AI Configuration
spring.ai.google.genai.api-key=${GEMINI_API_KEY}
spring.ai.google.genai.chat.options.model=gemini-2.5-flash
spring.ai.google.genai.embedding.api-key=${GEMINI_API_KEY}
spring.ai.google.genai.embedding.options.model=gemini-embedding-001

# Vector Store Configuration (MariaDB)
spring.ai.vectorstore.mariadb.distance-type=COSINE
spring.ai.vectorstore.mariadb.dimensions=3072
spring.ai.vectorstore.mariadb.initialize-schema=true

# Database Configuration
spring.datasource.url=jdbc:mariadb://localhost:3308/spring-ai
spring.datasource.username=root
spring.datasource.password=root

# Logging
logging.level.org.springframework.ai.chat.client.advisor=DEBUG
```

### Key Configuration Properties:

| Property | Description | Default |
|----------|-------------|---------|
| `GEMINI_API_KEY` | Google Gemini API key | (required) |
| `chat.options.model` | Chat model to use | gemini-2.5-flash |
| `embedding.options.model` | Embedding model | gemini-embedding-001 |
| `vectorstore.mariadb.dimensions` | Vector dimension size | 3072 |
| `vectorstore.mariadb.distance-type` | Similarity metric | COSINE |
| `datasource.url` | MariaDB connection URL | jdbc:mariadb://localhost:3308/spring-ai |
| `datasource.username` | Database username | root |
| `datasource.password` | Database password | root |

## 🏃 Running the Application

### Using Maven Wrapper

```bash
# Unix/Linux/macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

### Using Maven (if installed globally)

```bash
mvn spring-boot:run
```

### Using IDE

1. Import the project into your IDE (IntelliJ IDEA, Eclipse, VS Code)
2. Right-click on `RagAppApplication.java`
3. Select "Run" or "Run As" > "Java Application"

### Build JAR and Run

```bash
# Build the JAR
./mvnw clean package

# Run the JAR
java -jar target/RagApp-0.0.1-SNAPSHOT.jar
```

### Expected Output

```
...
o.s.b.w.embedded.tomcat.TomcatWebServer   : Tomcat started on port(s): 8080 (http)
c.a.RagAppApplication                     : Started RagAppApplication in X.XXX seconds
```

The application will be available at `http://localhost:8080`

## 🔌 API Endpoints

### Chat Endpoint

**Endpoint:** `GET /chat`

**Description:** Send a query and receive an AI-generated response augmented with context from the vector store.

**Parameters:**
- `q` (query parameter, required): The user's question or prompt
- `userId` (header, required): Unique user identifier for conversation tracking

**Example Request:**
```bash
curl -X GET "http://localhost:8080/chat?q=What%20is%20machine%20learning%3F" \
  -H "userId: user123"
```

**Example Response:**
```
Machine learning is a subset of artificial intelligence that focuses on enabling computers to learn from data without being explicitly programmed. It uses statistical techniques and algorithms to improve performance on tasks through experience...
```

**Response Type:** Plain text string

**Status Codes:**
- `200 OK`: Successful response
- `400 Bad Request`: Missing required parameters
- `500 Internal Server Error`: Server error or API key issue

### Request Examples

#### Using cURL:
```bash
# Basic chat request
curl -X GET "http://localhost:8080/chat?q=Explain%20RAG" \
  -H "userId: user123"

# URL encoded query
curl -X GET "http://localhost:8080/chat?q=What%20is%20the%20weather%3F" \
  -H "userId: user123"
```

#### Using JavaScript/Fetch:
```javascript
const query = "Tell me about artificial intelligence";
const userId = "user123";

fetch(`http://localhost:8080/chat?q=${encodeURIComponent(query)}`, {
  method: 'GET',
  headers: {
    'userId': userId
  }
})
  .then(response => response.text())
  .then(data => console.log(data))
  .catch(error => console.error('Error:', error));
```

#### Using Python:
```python
import requests

query = "Explain deep learning"
user_id = "user123"

response = requests.get(
    "http://localhost:8080/chat",
    params={"q": query},
    headers={"userId": user_id}
)

print(response.text)
```

#### Using Postman:
1. Create a new GET request
2. URL: `http://localhost:8080/chat?q=Your%20Question%20Here`
3. Add Header:
   - Key: `userId`
   - Value: `user123`
4. Click "Send"

## 🏗️ Architecture

### Component Overview

```
┌─────────────────────────────────────────────────────────────┐
│                    Client Applications                      │
└──────────────────────┬──────────────────────────────────────┘
                       │
                       ▼
┌─────────────────────────────────────────────────────────────┐
│                   REST Controller                           │
│              (AiController.java)                            │
└──────────────────────┬──────────────────────────────────────┘
                       │
                       ▼
┌─────────────────────────────────────────────────────────────┐
│                   Chat Service                              │
│             (ChatServiceImpl.java)                           │
└───────┬──────────────────────────────┬──────────────────────┘
        │                              │
        ▼                              ▼
┌──────────────────┐          ┌──────────────────────┐
│  Vector Store    │          │  Google Gemini AI    │
│  (MariaDB)       │          │  - Chat Model        │
│  - Document DB   │          │  - Embedding Model   │
│  - Vector Search │          │  - Context Retrieval │
└──────────────────┘          └──────────────────────┘
```

### Data Flow

1. **Request Reception**: User sends a query via `/chat` endpoint
2. **Vector Retrieval**: RAG advisor searches the vector store for relevant documents
3. **Context Building**: Similar documents are retrieved (top-3 by default)
4. **AI Processing**: Query + context sent to Gemini AI model
5. **Memory Management**: Conversation history maintained per userId
6. **Response Generation**: AI generates augmented response
7. **Response Return**: Formatted response sent back to client

### Key Classes

- **AiController**: Handles HTTP requests and routes to services
- **ChatService**: Interface defining chat operations
- **ChatServiceImpl**: Core implementation with RAG logic
- **VectorStore**: MariaDB-backed vector database
- **RetrievalAugmentationAdvisor**: Spring AI RAG orchestrator

## 🔨 Building & Deployment

### Build the Application

```bash
# Clean build
./mvnw clean build

# Skip tests during build
./mvnw clean package -DskipTests

# Build with specific profile (if configured)
./mvnw clean package -P production
```

### Create Docker Image

Create a `Dockerfile` in the project root:

```dockerfile
FROM maven:3.8.1-openjdk-21 as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-slim
WORKDIR /app
COPY --from=builder /app/target/RagApp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENV GEMINI_API_KEY=""
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### Build and Run Docker Container

```bash
# Build image
docker build -t rag-backend-api:latest .

# Run container with MariaDB
docker run -d \
  --name rag-app \
  -p 8080:8080 \
  --link mariadb-rag:mariadb \
  -e GEMINI_API_KEY="your-api-key" \
  -e SPRING_DATASOURCE_URL="jdbc:mariadb://mariadb:3306/spring-ai" \
  rag-backend-api:latest
```

### Deploy to Cloud

#### AWS EC2:
```bash
# SSH into instance
ssh -i key.pem ec2-user@your-instance-ip

# Install Java and Maven
sudo yum install java-21-amazon-corretto-devel maven

# Clone repository
git clone https://github.com/VivekSaini002/rag-backend-api.git

# Run application with nohup
cd rag-backend-api
export GEMINI_API_KEY="your-api-key"
nohup ./mvnw spring-boot:run &
```

#### Heroku:
```bash
# Install Heroku CLI
# Login to Heroku
heroku login

# Create Heroku app
heroku create your-app-name

# Set environment variables
heroku config:set GEMINI_API_KEY="your-api-key"
heroku config:set SPRING_DATASOURCE_URL="your-mariadb-url"

# Deploy
git push heroku main
```

## 🐛 Troubleshooting

### Issue: "API key not found" or "401 Unauthorized"

**Solution:**
1. Verify `GEMINI_API_KEY` environment variable is set
2. Check the API key is valid on [Google AI Studio](https://makersuite.google.com/app/apikey)
3. Ensure API key is properly quoted if it contains special characters
4. Check `application.properties` for correct key configuration

### Issue: "Cannot connect to database"

**Solution:**
1. Verify MariaDB is running:
   ```bash
   # Check MariaDB status
   mysql -u root -p -e "SELECT 1"
   ```
2. Verify connection URL in `application.properties`:
   ```
   spring.datasource.url=jdbc:mariadb://localhost:3308/spring-ai
   ```
3. Check username/password are correct
4. Ensure database exists:
   ```bash
   mysql -u root -p -e "SHOW DATABASES LIKE 'spring-ai';"
   ```

### Issue: Vector store table not created

**Solution:**
1. Ensure `spring.ai.vectorstore.mariadb.initialize-schema=true` is set
2. Application will auto-create tables on first run
3. Check logs for schema creation errors
4. Manually create if needed:
   ```sql
   CREATE TABLE IF NOT EXISTS vector_store (
       id INT AUTO_INCREMENT PRIMARY KEY,
       content LONGTEXT,
       embedding JSON
   );
   ```

### Issue: Application starts but `/chat` returns 400 Bad Request

**Solution:**
1. Ensure `q` parameter is provided and URL-encoded
2. Verify `userId` header is included
3. Check for special characters in query - must be URL-encoded
4. Example: `What is this?` should be `What%20is%20this%3F`

### Issue: Slow responses

**Solution:**
1. Increase vector store search parameters in `ChatServiceImpl.java`:
   ```java
   topK(3)           // Increase to 5 or 10
   similarityThreshold(0.7)  // Adjust threshold
   ```
2. Optimize MariaDB indexes
3. Check network latency to API
4. Monitor Gemini API rate limits

### Issue: Out of Memory errors

**Solution:**
1. Increase JVM heap size:
   ```bash
   java -Xmx2g -Xms1g -jar target/RagApp-0.0.1-SNAPSHOT.jar
   ```
2. Or set in `application.properties`:
   ```
   -Xmx2048m -Xms1024m
   ```
3. Reduce document batch sizes when loading data

## 📊 System Requirements Summary

| Component | Requirement |
|-----------|-------------|
| Java | 21+ |
| Maven | 3.6.0+ |
| MariaDB | 10.4+ |
| RAM | 2GB minimum |
| Disk | 1GB minimum |
| Network | Required for Gemini API |

## 🔐 Security Considerations

- **API Key**: Never commit API keys to version control
- **Database Credentials**: Use environment variables
- **HTTPS**: Deploy behind HTTPS in production
- **Authentication**: Consider adding user authentication
- **Rate Limiting**: Implement rate limiting in production
- **Input Validation**: Queries are validated for length

## 📚 Additional Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring AI Documentation](https://spring.io/projects/spring-ai)
- [Google Gemini API Docs](https://ai.google.dev/docs)
- [MariaDB Documentation](https://mariadb.com/kb/en/)

## 🤝 Contributing

Contributions are welcome! Please:
1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📝 License

This project is open source and available under the MIT License.

## ✉️ Support

For issues and questions:
- Open an [Issue](https://github.com/VivekSaini002/rag-backend-api/issues)
- Check existing issues for solutions
- Provide detailed error messages and logs

---

**Happy Coding! 🚀**