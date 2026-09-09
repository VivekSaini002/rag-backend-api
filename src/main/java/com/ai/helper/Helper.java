package com.ai.helper;

import java.util.List;

public class Helper {

    public static List<String> getData() {

        return List.of(

                """
                Brand: Apple
                Support ID: APP001
                Category: Apple ID
                Issue: Apple ID Password Reset
                Common Customer Query: I forgot my Apple ID password. How can I reset it?
                Resolution: Customers can reset their Apple ID password using a trusted Apple device or through Apple's account recovery process. The customer may be required to verify their identity.
                Recommended Response: You can reset your Apple ID password from a trusted Apple device or use Apple's account recovery process. Please follow the official Apple account recovery instructions and verify your identity when requested.
                Escalation Required: No
                Escalation Reason: Standard password recovery process.
                Keywords: Apple ID, password, forgot password, reset password, account recovery
                """,

                """
                Brand: Apple
                Support ID: APP002
                Category: Apple ID
                Issue: Apple ID Locked
                Common Customer Query: My Apple ID is locked. What should I do?
                Resolution: Apple may temporarily lock an account when unusual activity or incorrect authentication attempts are detected. The customer should follow Apple's account recovery or unlocking instructions.
                Recommended Response: Your Apple ID may have been locked for security reasons. Please follow Apple's account recovery instructions to verify your identity and regain access to your account.
                Escalation Required: No
                Escalation Reason: Standard account recovery issue unless recovery fails.
                Keywords: Apple ID locked, account locked, disabled Apple ID, security
                """,

                """
                Brand: Apple
                Support ID: APP003
                Category: iPhone
                Issue: iPhone Not Turning On
                Common Customer Query: My iPhone won't turn on. What should I do?
                Resolution: The customer should first charge the iPhone and check whether the device responds. If necessary, they can try a force restart appropriate for their iPhone model.
                Recommended Response: Please connect your iPhone to a charger and allow it to charge for a while. If it still does not respond, try a force restart using the steps for your specific iPhone model.
                Escalation Required: Yes
                Escalation Reason: Escalate if the device remains completely unresponsive after basic troubleshooting.
                Keywords: iPhone, won't turn on, black screen, power problem, restart
                """,

                """
                Brand: Apple
                Support ID: APP004
                Category: iPhone
                Issue: iPhone Battery Draining Quickly
                Common Customer Query: My iPhone battery is draining very quickly.
                Resolution: Battery usage can be checked in Settings > Battery. Customers should identify applications or activities consuming significant battery power and ensure iOS is updated.
                Recommended Response: Please check Settings > Battery to see which apps or activities are using the most power. Also make sure your iPhone is running the latest supported iOS version.
                Escalation Required: No
                Escalation Reason: Common battery troubleshooting issue.
                Keywords: iPhone battery, battery drain, battery life, charging, power
                """,

                """
                Brand: Apple
                Support ID: APP005
                Category: iPhone
                Issue: iPhone Overheating
                Common Customer Query: My iPhone is getting very hot. Is something wrong?
                Resolution: Temporary heating can occur during intensive activities such as gaming, video processing, charging or setup. If the device becomes excessively hot or repeatedly overheats during normal use, further investigation may be required.
                Recommended Response: iPhone can become warm during charging or intensive activities. Please stop intensive use and allow the device to cool. If overheating continues during normal use, contact Apple Support for further assistance.
                Escalation Required: Yes
                Escalation Reason: Repeated or excessive overheating may require technical inspection.
                Keywords: iPhone hot, overheating, device temperature, battery temperature
                """,

                """
                Brand: Apple
                Support ID: APP006
                Category: iPhone
                Issue: iPhone Screen Problem
                Common Customer Query: My iPhone screen is not responding to touch.
                Resolution: Customers can restart the device and check whether the screen is clean and free from moisture or physical obstruction. Persistent touch problems may require service.
                Recommended Response: Please restart your iPhone and make sure the screen is clean and dry. If touch input still does not work correctly, Apple Support may need to diagnose the device.
                Escalation Required: Yes
                Escalation Reason: Persistent hardware-related screen problems may require service.
                Keywords: iPhone screen, touchscreen, touch not working, display problem
                """,

                """
                Brand: Apple
                Support ID: APP007
                Category: iPhone
                Issue: iPhone Camera Not Working
                Common Customer Query: My iPhone camera is not working.
                Resolution: Customers should close and reopen the Camera app, restart the iPhone and install available software updates. Persistent camera failures may indicate a hardware or software issue.
                Recommended Response: Please close the Camera app and restart your iPhone. Also check for available iOS updates. If the camera still does not work, Apple Support can help diagnose the problem.
                Escalation Required: Yes
                Escalation Reason: Persistent camera failure may require technical diagnosis.
                Keywords: camera, iPhone camera, camera not working, photo problem
                """,

                """
                Brand: Apple
                Support ID: APP008
                Category: iOS
                Issue: iOS Update Failed
                Common Customer Query: My iPhone software update failed.
                Resolution: Customers should ensure that the device has sufficient storage, a stable internet connection and adequate battery power. They can retry the update after addressing these conditions.
                Recommended Response: Please make sure your iPhone has enough available storage, a stable Wi-Fi connection and sufficient battery power. Then try the software update again.
                Escalation Required: Yes
                Escalation Reason: Escalate if repeated update failures prevent the device from updating.
                Keywords: iOS update, software update, update failed, iPhone update
                """,

                """
                Brand: Apple
                Support ID: APP009
                Category: iCloud
                Issue: iCloud Storage Full
                Common Customer Query: My iCloud storage is full. What can I do?
                Resolution: Customers can review their iCloud storage usage and remove unnecessary backups, photos or files. They can also upgrade their iCloud+ storage plan if additional storage is required.
                Recommended Response: You can check which items are using your iCloud storage and remove unnecessary data. If you need more space, you can also upgrade your iCloud+ storage plan.
                Escalation Required: No
                Escalation Reason: Standard iCloud storage management issue.
                Keywords: iCloud, storage full, iCloud storage, backup, iCloud+
                """,

                """
                Brand: Apple
                Support ID: APP010
                Category: iCloud
                Issue: iCloud Sync Problem
                Common Customer Query: My photos are not syncing to iCloud.
                Resolution: Customers should verify that iCloud Photos is enabled, the device is connected to the internet and sufficient iCloud storage is available.
                Recommended Response: Please check that iCloud Photos is enabled and that your iPhone has a stable internet connection. Also check whether your iCloud storage has enough available space.
                Escalation Required: Yes
                Escalation Reason: Escalate if synchronization remains unavailable after basic troubleshooting.
                Keywords: iCloud Photos, sync, synchronization, photos, backup
                """,

                """
                Brand: Apple
                Support ID: APP011
                Category: App Store
                Issue: App Store Download Problem
                Common Customer Query: I cannot download apps from the App Store.
                Resolution: Customers should check their internet connection, Apple ID authentication, available storage and payment/account restrictions that may prevent downloads.
                Recommended Response: Please check your internet connection, available iPhone storage and Apple ID status. If the App Store asks you to verify payment information, complete the requested verification before trying again.
                Escalation Required: No
                Escalation Reason: Common App Store troubleshooting issue.
                Keywords: App Store, app download, application, cannot download
                """,

                """
                Brand: Apple
                Support ID: APP012
                Category: App Store
                Issue: App Store Payment Problem
                Common Customer Query: My App Store payment is not working.
                Resolution: Customers should verify their payment method, billing information and account status. A valid payment method may be required for purchases or subscriptions.
                Recommended Response: Please check your payment method and billing information in your Apple Account settings. If the payment method is declined, you may need to update or replace it.
                Escalation Required: Yes
                Escalation Reason: Repeated payment failures or disputed transactions may require account investigation.
                Keywords: App Store payment, payment failed, payment method, billing
                """,

                """
                Brand: Apple
                Support ID: APP013
                Category: Subscription
                Issue: Apple Subscription Cancellation
                Common Customer Query: I want to cancel my Apple subscription.
                Resolution: Customers can manage eligible subscriptions through their Apple Account subscription settings and cancel subscriptions that they no longer want.
                Recommended Response: You can manage your subscriptions from your Apple Account subscription settings. Select the subscription you want to manage and choose the cancellation option if available.
                Escalation Required: No
                Escalation Reason: Standard subscription management request.
                Keywords: subscription, cancel subscription, Apple subscription, billing
                """,

                """
                Brand: Apple
                Support ID: APP014
                Category: Subscription
                Issue: Unexpected Subscription Charge
                Common Customer Query: I was charged for an Apple subscription that I didn't expect.
                Resolution: The customer should review their purchase history and subscription list to identify the charge. If the customer does not recognize the transaction, account security and purchase investigation may be required.
                Recommended Response: Please review your Apple purchase history and active subscriptions to identify the charge. If you do not recognize the purchase, Apple Support can help you investigate the transaction.
                Escalation Required: Yes
                Escalation Reason: Unknown or disputed financial transactions require investigation.
                Keywords: subscription charge, unexpected charge, billing, purchase, refund
                """,

                """
                Brand: Apple
                Support ID: APP015
                Category: Refund
                Issue: App Store Refund Request
                Common Customer Query: I want a refund for an App Store purchase.
                Resolution: Customers can submit eligible refund requests through Apple's official refund request process. Approval depends on Apple's policies and purchase circumstances.
                Recommended Response: You can submit a refund request through Apple's official purchase refund process. The request will be reviewed according to Apple's refund policies.
                Escalation Required: No
                Escalation Reason: Standard refund request process.
                Keywords: refund, App Store refund, purchase refund, money back
                """,

                """
                Brand: Apple
                Support ID: APP016
                Category: Apple Pay
                Issue: Apple Pay Not Working
                Common Customer Query: Apple Pay is not working on my iPhone.
                Resolution: Customers should verify that their device supports Apple Pay, the card is supported, the device is updated and authentication/security requirements are satisfied.
                Recommended Response: Please make sure your iPhone is updated and that your card is supported by Apple Pay. If the card continues to fail, your bank or card issuer may also need to be contacted.
                Escalation Required: Yes
                Escalation Reason: Payment-card issues may require bank or Apple investigation.
                Keywords: Apple Pay, payment, card, Wallet, contactless payment
                """,

                """
                Brand: Apple
                Support ID: APP017
                Category: Apple Pay
                Issue: Unknown Apple Pay Transaction
                Common Customer Query: I don't recognize an Apple Pay transaction.
                Resolution: Unknown financial transactions should be investigated promptly. The customer should review transaction details and contact the relevant financial institution or Apple Support depending on the transaction.
                Recommended Response: If you do not recognize an Apple Pay transaction, review the transaction details and contact your financial institution and Apple Support as appropriate for further investigation.
                Escalation Required: Yes
                Escalation Reason: Potential unauthorized financial transaction.
                Keywords: Apple Pay, unknown transaction, unauthorized payment, fraud
                """,

                """
                Brand: Apple
                Support ID: APP018
                Category: Mac
                Issue: MacBook Not Starting
                Common Customer Query: My MacBook won't turn on.
                Resolution: Customers should verify the power connection, charging status and attempt basic restart procedures. Persistent failures may require Apple diagnostics or service.
                Recommended Response: Please verify that your MacBook is connected to power and try restarting it. If it still does not turn on, Apple Support can help determine whether service is required.
                Escalation Required: Yes
                Escalation Reason: Persistent power or hardware failure requires technical diagnosis.
                Keywords: MacBook, Mac, won't turn on, power, startup
                """,

                """
                Brand: Apple
                Support ID: APP019
                Category: Mac
                Issue: Mac Running Slowly
                Common Customer Query: My Mac is very slow. How can I fix it?
                Resolution: Customers should check available storage, resource usage, applications running in the background and software updates.
                Recommended Response: Please check available storage and applications using significant system resources. Closing unnecessary applications and installing available macOS updates may improve performance.
                Escalation Required: No
                Escalation Reason: Standard Mac performance troubleshooting.
                Keywords: Mac slow, MacBook slow, performance, storage, macOS
                """,

                """
                Brand: Apple
                Support ID: APP020
                Category: Mac
                Issue: macOS Update Problem
                Common Customer Query: My Mac cannot install the latest macOS update.
                Resolution: Customers should verify device compatibility, available storage, internet connectivity and power before attempting the update again.
                Recommended Response: Please check whether your Mac supports the macOS version, ensure sufficient storage and use a stable internet connection while connected to power.
                Escalation Required: Yes
                Escalation Reason: Repeated update failures may require technical investigation.
                Keywords: macOS update, Mac update, software update, installation
                """,

                """
                Brand: Apple
                Support ID: APP021
                Category: AirPods
                Issue: AirPods Not Connecting
                Common Customer Query: My AirPods won't connect to my iPhone.
                Resolution: Customers can check Bluetooth settings, ensure the AirPods are charged and try reconnecting or resetting the AirPods.
                Recommended Response: Please make sure Bluetooth is enabled and your AirPods have sufficient charge. You can also try reconnecting or resetting the AirPods if the issue continues.
                Escalation Required: No
                Escalation Reason: Common Bluetooth connection issue.
                Keywords: AirPods, Bluetooth, connection, pairing
                """,

                """
                Brand: Apple
                Support ID: APP022
                Category: AirPods
                Issue: AirPods Audio Problem
                Common Customer Query: One of my AirPods has no sound.
                Resolution: Customers should verify balance settings, clean the AirPods, check charging and reconnect the AirPods.
                Recommended Response: Please check your audio balance settings and make sure both AirPods are charged and clean. Try reconnecting the AirPods to your device.
                Escalation Required: Yes
                Escalation Reason: Persistent single-ear audio failure may require hardware diagnosis.
                Keywords: AirPods, no sound, audio, left AirPod, right AirPod
                """,

                """
                Brand: Apple
                Support ID: APP023
                Category: Apple Watch
                Issue: Apple Watch Not Charging
                Common Customer Query: My Apple Watch is not charging.
                Resolution: Customers should check the charging cable, power adapter and charging surface and ensure the watch is correctly positioned on the charger.
                Recommended Response: Please make sure the charging cable and adapter are properly connected and that your Apple Watch is correctly positioned on the charger. If it still does not charge, Apple Support can help troubleshoot further.
                Escalation Required: Yes
                Escalation Reason: Persistent charging problems may indicate accessory or hardware failure.
                Keywords: Apple Watch, charging, charger, battery
                """,

                """
                Brand: Apple
                Support ID: APP024
                Category: Apple Watch
                Issue: Apple Watch Not Pairing
                Common Customer Query: I cannot pair my Apple Watch with my iPhone.
                Resolution: Customers should ensure both devices are compatible, updated, have Bluetooth enabled and are close to each other during pairing.
                Recommended Response: Please make sure your iPhone and Apple Watch are compatible and running supported software. Keep Bluetooth enabled and place the devices close together while attempting to pair them.
                Escalation Required: Yes
                Escalation Reason: Persistent pairing failures may require account or device troubleshooting.
                Keywords: Apple Watch, pairing, iPhone, Bluetooth, connection
                """,

                """
                Brand: Apple
                Support ID: APP025
                Category: Find My
                Issue: Find My iPhone
                Common Customer Query: I lost my iPhone. How can I find it?
                Resolution: Customers can use the Find My service to locate a compatible device, mark it as lost or take other available actions.
                Recommended Response: If Find My was enabled on your iPhone, use the Find My app or Find My service to check its location and activate Lost Mode if appropriate.
                Escalation Required: No
                Escalation Reason: Standard device-location procedure.
                Keywords: Find My, lost iPhone, locate iPhone, Lost Mode
                """,

                """
                Brand: Apple
                Support ID: APP026
                Category: Find My
                Issue: Stolen iPhone
                Common Customer Query: My iPhone was stolen. What should I do?
                Resolution: The customer should use Find My if available, mark the device as lost and contact the appropriate authorities or carrier when necessary. Account security should also be considered.
                Recommended Response: Use Find My to mark the iPhone as lost if the feature is available. Do not attempt to recover the device yourself if it may put you at risk. Contact the appropriate authorities and your carrier as needed.
                Escalation Required: Yes
                Escalation Reason: Stolen device and account-security situations require additional handling.
                Keywords: stolen iPhone, lost phone, Find My, Lost Mode, security
                """,

                """
                Brand: Apple
                Support ID: APP027
                Category: Security
                Issue: Apple Account Hacked
                Common Customer Query: I think someone has accessed my Apple Account.
                Resolution: Customers should secure their account, change the password, review account information and trusted devices and enable available security protections.
                Recommended Response: If you believe your Apple Account has been compromised, change your password immediately and review your account and trusted devices. If you cannot regain control of the account, contact Apple Support.
                Escalation Required: Yes
                Escalation Reason: Potential account compromise requires security-focused assistance.
                Keywords: hacked account, Apple Account, security, unauthorized access
                """,

                """
                Brand: Apple
                Support ID: APP028
                Category: Data Transfer
                Issue: Transfer Data to New iPhone
                Common Customer Query: How can I transfer everything from my old iPhone to my new iPhone?
                Resolution: Customers can use Apple's device setup and migration options to transfer data from an old iPhone to a new iPhone.
                Recommended Response: During setup of your new iPhone, you can use Apple's device-to-device transfer option to move your data from your old iPhone. Keep both devices nearby and connected to power during the transfer.
                Escalation Required: No
                Escalation Reason: Standard device setup and migration request.
                Keywords: transfer data, new iPhone, old iPhone, migration, setup
                """,

                """
                Brand: Apple
                Support ID: APP029
                Category: Backup
                Issue: iPhone Backup
                Common Customer Query: How do I back up my iPhone?
                Resolution: Customers can back up their iPhone using iCloud or a computer, depending on their preferred setup and available resources.
                Recommended Response: You can back up your iPhone using iCloud or by connecting it to a Mac or Windows computer. Make sure the backup completes successfully before relying on it for device restoration.
                Escalation Required: No
                Escalation Reason: Standard backup information request.
                Keywords: iPhone backup, iCloud backup, backup, restore
                """,

                """
                Brand: Apple
                Support ID: APP030
                Category: Warranty
                Issue: Apple Warranty
                Common Customer Query: Is my Apple device still under warranty?
                Resolution: Customers can check their device coverage through Apple's official coverage-checking service using the device's serial number or other required information.
                Recommended Response: You can check your Apple device's coverage using Apple's official coverage-checking service. You may need your device serial number to view the available coverage information.
                Escalation Required: No
                Escalation Reason: Standard warranty information request.
                Keywords: Apple warranty, coverage, warranty check, serial number
                """,

                """
                Brand: Apple
                Support ID: APP031
                Category: Repair
                Issue: iPhone Repair
                Common Customer Query: My iPhone is damaged. How can I get it repaired?
                Resolution: Customers can review available Apple repair and service options. Repair availability and cost depend on the device, issue and coverage.
                Recommended Response: Apple Support can help determine the appropriate repair option for your iPhone. Repair cost and availability depend on the device, damage and applicable coverage.
                Escalation Required: Yes
                Escalation Reason: Physical device damage requires service assessment.
                Keywords: iPhone repair, damaged iPhone, service, repair cost
                """,

                """
                Brand: Apple
                Support ID: APP032
                Category: Billing
                Issue: Duplicate Apple Charge
                Common Customer Query: I was charged twice for the same Apple purchase.
                Resolution: The customer should review purchase history and transaction details. Duplicate or disputed financial charges may require investigation.
                Recommended Response: Please review your Apple purchase history and transaction details to confirm the duplicate charge. If the charge is confirmed as incorrect, Apple Support can help investigate the transaction.
                Escalation Required: Yes
                Escalation Reason: Duplicate financial charge requires investigation.
                Keywords: duplicate charge, double charge, billing, payment, Apple purchase
                """,

                """
                Brand: Apple
                Support ID: APP033
                Category: Apple Account
                Issue: Change Apple Account Email
                Common Customer Query: I want to change the email address associated with my Apple Account.
                Resolution: Customers may be able to update their account information through Apple Account settings, subject to Apple's account requirements.
                Recommended Response: You can review and update your Apple Account information through your account settings. Some account changes may require identity verification.
                Escalation Required: No
                Escalation Reason: Standard account-management request.
                Keywords: Apple Account, email address, change email, account settings
                """,

                """
                Brand: Apple
                Support ID: APP034
                Category: Apple Music
                Issue: Apple Music Not Playing
                Common Customer Query: Apple Music songs are not playing.
                Resolution: Customers should check internet connectivity, subscription status, application state and software updates.
                Recommended Response: Please check your internet connection and Apple Music subscription status. Restart the app and make sure your device is running supported software.
                Escalation Required: No
                Escalation Reason: Standard application troubleshooting.
                Keywords: Apple Music, music not playing, subscription, streaming
                """,

                """
                Brand: Apple
                Support ID: APP035
                Category: Apple TV
                Issue: Apple TV Playback Problem
                Common Customer Query: Apple TV videos keep buffering.
                Resolution: Playback issues can be caused by network conditions, application problems or device software. Customers should check their connection and restart the application/device.
                Recommended Response: Please check your internet connection and restart the Apple TV app or device. If buffering continues, further network or device troubleshooting may be required.
                Escalation Required: No
                Escalation Reason: Common streaming troubleshooting issue.
                Keywords: Apple TV, buffering, video, streaming, playback
                """,

                """
                Brand: Apple
                Support ID: APP036
                Category: Customer Service
                Issue: Contact Apple Support
                Common Customer Query: How can I contact Apple Support?
                Resolution: Customers can use Apple's official support channels to contact support, including online support options and available service channels.
                Recommended Response: You can contact Apple Support through Apple's official support website or the Apple Support app to find the available support options for your product and issue.
                Escalation Required: No
                Escalation Reason: General support-contact request.
                Keywords: Apple Support, contact support, customer service, help
                """,

                """
                Brand: Apple
                Support ID: APP037
                Category: Escalation
                Issue: Repeated Unresolved Problem
                Common Customer Query: I have contacted support multiple times but my issue is still not fixed.
                Resolution: Customers with repeated unsuccessful troubleshooting should be escalated to a human support specialist who can review the complete history.
                Recommended Response: I'm sorry that the issue has not been resolved despite your previous attempts. This case should be reviewed by a support specialist who can look at the previous troubleshooting and determine the next step.
                Escalation Required: Yes
                Escalation Reason: Repeated unsuccessful support attempts require human review.
                Keywords: unresolved issue, repeated support, escalation, complaint
                """,

                """
                Brand: Apple
                Support ID: APP038
                Category: Complaint
                Issue: Serious Customer Complaint
                Common Customer Query: I am extremely unhappy because Apple has not resolved my problem.
                Resolution: Serious complaints should be reviewed by a human support representative who can understand the complete case history and determine an appropriate resolution.
                Recommended Response: I'm sorry you've had this experience. Because the issue has not been resolved, your case should be reviewed by a support specialist who can look into the details and determine the appropriate next step.
                Escalation Required: Yes
                Escalation Reason: Serious unresolved complaint requires human review.
                Keywords: complaint, unhappy customer, unresolved, escalation
                """,

                """
                Brand: Apple
                Support ID: APP039
                Category: Fraud
                Issue: Unauthorized Purchase
                Common Customer Query: Someone made a purchase using my Apple Account without my permission.
                Resolution: Unauthorized purchases require account-security investigation. The customer should secure the account, review transactions and contact Apple Support through official channels.
                Recommended Response: If you do not recognize a purchase, secure your Apple Account immediately and review your purchase history. Please contact Apple Support for assistance investigating the transaction.
                Escalation Required: Yes
                Escalation Reason: Potential unauthorized transaction requires human investigation.
                Keywords: unauthorized purchase, fraud, Apple Account, unknown transaction, security
                """,

                """
                Brand: Apple
                Support ID: APP040
                Category: Other
                Issue: Complex or Unknown Issue
                Common Customer Query: I have an Apple problem but I don't know what category it belongs to.
                Resolution: When the issue cannot be confidently classified or resolved using available information, the customer should be routed to a human support specialist.
                Recommended Response: I'm happy to help, but I need more information about the issue to determine the appropriate troubleshooting steps. If the problem remains unclear, Apple Support can review the case directly.
                Escalation Required: Yes
                Escalation Reason: Insufficient information or unknown issue requires human investigation.
                Keywords: unknown issue, other, unclear problem, support
                """
        );
    }
}