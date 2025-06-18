// import java.util.ArrayList;
// import java.util.Scanner;
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

// // Represents a hosting package with name, price, and features
// class WebHostingPackage {
//     protected String packageName;
//     protected double price;
//     protected String features;

//     public WebHostingPackage(String name, double price, String features) {
//         this.packageName = name;
//         this.price = price;
//         this.features = features;
//     }

//     public void displayPackageDetails() {
//         System.out.println("Package: " + packageName);
//         System.out.println("Price: $" + price);
//         System.out.println("Features: " + features);
//     }

//     public String getPackageName() {
//         return packageName;
//     }

//     public double getPrice() {
//         return price;
//     }
// }

// // Basic hosting plan
// class BasicHosting extends WebHostingPackage {
//     public BasicHosting() {
//         super("Basic Hosting", 5.99, "10GB Storage, 1 Website, Basic Support");
//     }
// }

// // Premium hosting plan
// class PremiumHosting extends WebHostingPackage {
//     public PremiumHosting() {
//         super("Premium Hosting", 12.99, "Unlimited Storage, Unlimited Websites, 24/7 Support");
//     }
// }

// // Represents a support ticket entry
// class TicketEntry {
//     public String username;
//     public String ticketText;
//     public String response;
//     public boolean responded;

//     public TicketEntry(String username, String ticketText) {
//         this.username = username;
//         this.ticketText = ticketText;
//         this.response = "";
//         this.responded = false;
//     }
// }

// // The main hosting‐management system, handling package catalog and support
// // tickets
// class WebHostingManagementSystem {
//     private static ArrayList<WebHostingPackage> packages = new ArrayList<>();
//     private static ArrayList<TicketEntry> tickets = new ArrayList<>();
//     private String ownerUsername;

//     // Per‐user fields
//     public String hostingAccount;
//     public String domainName;
//     public String databaseName;
//     public String emailAccount;
//     public String selectedPlan;
//     public String paymentMethod;
//     public String paymentStatus;

//     // Constructor: sets owner and initializes default packages if needed
//     public WebHostingManagementSystem(String ownerUsername) {
//         this.ownerUsername = ownerUsername;
//         if (packages.isEmpty()) {
//             // Initialize default packages only once
//             packages.add(new BasicHosting());
//             packages.add(new PremiumHosting());
//         }
//     }

//     // Static: add a new hosting package (admin use)
//     public static void addPackage(String name, double price, String features) {
//         packages.add(new WebHostingPackage(name, price, features));
//         System.out.println("New hosting package \"" + name + "\" added successfully.");
//     }

//     // Static: display all available packages
//     public static void displayAvailablePackages() {
//         System.out.println("\nAvailable Hosting Packages:");
//         for (int i = 0; i < packages.size(); i++) {
//             System.out.println((i + 1) + ". ");
//             packages.get(i).displayPackageDetails();
//             System.out.println();
//         }
//     }

//     // Static: display all support tickets (admin use)
//     public static void displayAllTickets() {
//         if (tickets.isEmpty()) {
//             System.out.println("\nNo support tickets found.");
//             return;
//         }
//         System.out.println("\nSupport Tickets:");
//         for (int i = 0; i < tickets.size(); i++) {
//             TicketEntry t = tickets.get(i);
//             System.out.println((i + 1) + ". User: " + t.username);
//             System.out.println("   Ticket: " + t.ticketText);
//             if (t.responded) {
//                 System.out.println("   Response: " + t.response);
//             } else {
//                 System.out.println("   No response yet.");
//             }
//             System.out.println();
//         }
//     }

//     // Static: respond to a specific ticket (admin use)
//     public static void respondToTicket(int ticketNumber, String response) {
//         if (ticketNumber < 1 || ticketNumber > tickets.size()) {
//             System.out.println("Invalid ticket number.");
//             return;
//         }
//         TicketEntry t = tickets.get(ticketNumber - 1);
//         t.response = response;
//         t.responded = true;
//         System.out.println("Response to ticket " + ticketNumber + " recorded.");
//     }

//     // Static: display all tickets for a given user
//     public static void displayUserTickets(String username) {
//         boolean found = false;
//         for (TicketEntry t : tickets) {
//             if (t.username.equals(username)) {
//                 if (!found) {
//                     System.out.println("\nYour Support Tickets:");
//                     found = true;
//                 }
//                 System.out.println("- Ticket: " + t.ticketText);
//                 if (t.responded) {
//                     System.out.println("  Response: " + t.response);
//                 } else {
//                     System.out.println("  No response yet.");
//                 }
//                 System.out.println();
//             }
//         }
//         if (!found) {
//             System.out.println("\nYou have not submitted any support tickets.");
//         }
//     }

//     // Instance: create a hosting account for this user
//     public void createHostingAccount(String acc) {
//         hostingAccount = acc;
//         System.out.println("Hosting Account Created: " + acc);
//     }

//     // Instance: create domain name for this user
//     public void createDomainName(String domain) {
//         domainName = domain;
//         System.out.println("Domain Name Created: " + domain);
//     }

//     // Instance: create database name for this user
//     public void createDatabaseName(String db) {
//         databaseName = db;
//         System.out.println("Database Name Created: " + db);
//     }

//     // Instance: create email account for this user
//     public void createEmailAccount(String email) {
//         emailAccount = email;
//         System.out.println("Email Account Created: " + email);
//     }

//     // Instance: select a hosting plan by index
//     public void selectHostingPlan(int packageIndex) {
//         if (packageIndex < 1 || packageIndex > packages.size()) {
//             System.out.println("Invalid package selection.");
//             return;
//         }
//         WebHostingPackage pkg = packages.get(packageIndex - 1);
//         selectedPlan = pkg.getPackageName();
//         System.out.println("You have selected: " + selectedPlan + " at $" + pkg.getPrice());
//     }

//     // Instance: choose a payment method from predefined menu
//     public void choosePaymentMethod(int methodChoice) {
//         switch (methodChoice) {
//             case 1:
//                 paymentMethod = "Credit Card";
//                 break;
//             case 2:
//                 paymentMethod = "PayPal";
//                 break;
//             case 3:
//                 paymentMethod = "Bank Transfer";
//                 break;
//             default:
//                 System.out.println("Invalid payment method selection.");
//                 paymentMethod = null;
//                 return;
//         }
//         System.out.println("Payment Method Set: " + paymentMethod);
//     }

//     // Instance: simulate making a payment
//     public void makePayment() {
//         if (selectedPlan == null) {
//             System.out.println("Please select a hosting plan before making payment.");
//             return;
//         }
//         if (paymentMethod == null) {
//             System.out.println("Please choose a valid payment method before making payment.");
//             return;
//         }
//         paymentStatus = "Paid";
//         System.out.println("Payment of $" + getSelectedPlanPrice() + " for " + selectedPlan + " completed via "
//                 + paymentMethod + ".");
//         System.out.println("Payment Status: " + paymentStatus);
//     }

//     // Changed to public so FYP can call it
//     public double getSelectedPlanPrice() {
//         for (WebHostingPackage pkg : packages) {
//             if (pkg.getPackageName().equals(selectedPlan)) {
//                 return pkg.getPrice();
//             }
//         }
//         return 0.0;
//     }

//     // Instance: submit a support ticket
//     public void createSupportTicket(String ticket) {
//         tickets.add(new TicketEntry(ownerUsername, ticket));
//         System.out.println("Support Ticket Submitted: " + ticket);
//     }
// }

// // Base “Accounts” class: holds username, password, and creation date if
// // applicable
// class Accounts {
//     protected String username;
//     protected String password;
//     protected String created_at;

//     // Initial (landing) menu
//     public static void intialDisplay() {
//         System.out.println("\n!! Welcome To NULLxCODER HOSTING !!");
//         System.out.println("1 ==> Enter as an Admin");
//         System.out.println("2 ==> Enter as a User");
//         System.out.println("3 ==> Exit");
//     }

//     // Admin menu
//     public static void adminDisplay() {
//         System.out.println("\n!! Admin Menu !!");
//         System.out.println("1 ==> Create a new Admin");
//         System.out.println("2 ==> Create a new User");
//         System.out.println("3 ==> View Hosting Packages");
//         System.out.println("4 ==> Add Hosting Package");
//         System.out.println("5 ==> View All Support Tickets");
//         System.out.println("6 ==> Respond to Support Ticket");
//         System.out.println("7 ==> Exit Admin Menu");
//     }

//     // User menu after onboarding
//     public static void userDisplayPostOnboard() {
//         System.out.println("\nUser Menu:");
//         System.out.println("1. Submit Support Ticket");
//         System.out.println("2. View My Support Tickets/Responses");
//         System.out.println("3. View Hosting Packages");
//         System.out.println("4. Exit User Menu");
//     }

//     // Simple “loading” animation for a few seconds
//     public static void loadingAnimation() {
//         try {
//             for (int i = 0; i < 4; i++) {
//                 System.out.print("\rLoading.");
//                 Thread.sleep(500);
//                 System.out.print("\rLoading..");
//                 Thread.sleep(500);
//                 System.out.print("\rLoading...");
//                 Thread.sleep(500);
//             }
//             System.out.println("\rDone!        ");
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }

//     // Pause for a short time (3 seconds)
//     public static void delay() {
//         try {
//             Thread.sleep(3000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// // Represents a user account; when constructed, prints creation details and
// // initializes hosting data
// class HostingAccounts extends Accounts {
//     public WebHostingManagementSystem hostingData;

//     public HostingAccounts(String username, String password) {
//         this.username = username;
//         this.password = password;
//         this.created_at = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//         System.out.println("\nPlease wait while we create your hosting account...");
//         Accounts.loadingAnimation();
//         System.out.println("Hosting account created for \"" + username + "\" on " + created_at);
//         Accounts.delay();
//         // Initialize per-user hosting data, passing the username
//         this.hostingData = new WebHostingManagementSystem(username);
//     }
// }

// // Represents an admin account
// class AdminAccount extends Accounts {
//     public AdminAccount(String username, String password) {
//         this.username = username;
//         this.password = password;
//     }
// }

// public class FYP {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // 1) Initialize default packages once (triggered by passing empty username)
//         new WebHostingManagementSystem("");

//         // 2) Admin and user lists
//         ArrayList<AdminAccount> adminList = new ArrayList<>();
//         adminList.add(new AdminAccount("admin", "123")); // default admin

//         ArrayList<HostingAccounts> userList = new ArrayList<>();

//         int initialOption = 0;

//         do {
//             Accounts.intialDisplay();
//             System.out.print("Enter Your Choice: ");
//             while (!scanner.hasNextInt()) {
//                 System.out.print("Please enter a valid number: ");
//                 scanner.next();
//             }
//             initialOption = scanner.nextInt();
//             scanner.nextLine();

//             switch (initialOption) {
//                 case 1:
//                     // --- Admin Login / Admin Menu ---
//                     System.out.print("Enter username for admin account: ");
//                     String adminUsername = scanner.nextLine();
//                     System.out.print("Enter password for admin account: ");
//                     String adminPassword = scanner.nextLine();

//                     System.out.println("Please Wait While We Are Checking Your Credentials");
//                     Accounts.loadingAnimation();
//                     Accounts.delay();

//                     boolean adminFound = false;
//                     for (AdminAccount a : adminList) {
//                         if (a.username.equals(adminUsername) && a.password.equals(adminPassword)) {
//                             adminFound = true;
//                             break;
//                         }
//                     }

//                     if (adminFound) {
//                         System.out.println("Admin Login Successful!");
//                         Accounts.delay();

//                         int adminChoice;
//                         do {
//                             Accounts.adminDisplay();
//                             System.out.print("Enter Your Choice: ");
//                             while (!scanner.hasNextInt()) {
//                                 System.out.print("Please enter a valid number: ");
//                                 scanner.next();
//                             }
//                             adminChoice = scanner.nextInt();
//                             scanner.nextLine();

//                             switch (adminChoice) {
//                                 case 1:
//                                     // Create a new Admin
//                                     System.out.print("Enter new admin username: ");
//                                     String newAdminUser = scanner.nextLine();
//                                     System.out.print("Enter new admin password: ");
//                                     String newAdminPass = scanner.nextLine();

//                                     // Check for duplicate username
//                                     boolean duplicateAdmin = false;
//                                     for (AdminAccount a : adminList) {
//                                         if (a.username.equals(newAdminUser)) {
//                                             duplicateAdmin = true;
//                                             break;
//                                         }
//                                     }
//                                     if (duplicateAdmin) {
//                                         System.out.println("An admin with that username already exists.");
//                                     } else {
//                                         adminList.add(new AdminAccount(newAdminUser, newAdminPass));
//                                         System.out.println("New admin \"" + newAdminUser + "\" created successfully.");
//                                     }
//                                     break;

//                                 case 2:
//                                     // Create a new User
//                                     System.out.print("Enter new user username: ");
//                                     String newUser = scanner.nextLine();
//                                     System.out.print("Enter new user password: ");
//                                     String newUserPass = scanner.nextLine();

//                                     // Check for duplicate username
//                                     boolean duplicateUser = false;
//                                     for (HostingAccounts u : userList) {
//                                         if (u.username.equals(newUser)) {
//                                             duplicateUser = true;
//                                             break;
//                                         }
//                                     }
//                                     if (duplicateUser) {
//                                         System.out.println("A user with that username already exists.");
//                                     } else {
//                                         HostingAccounts createdUser = new HostingAccounts(newUser, newUserPass);
//                                         userList.add(createdUser);
//                                         System.out.println("New user \"" + newUser + "\" created successfully.");
//                                     }
//                                     break;

//                                 case 3:
//                                     // View Hosting Packages
//                                     WebHostingManagementSystem.displayAvailablePackages();
//                                     break;

//                                 case 4:
//                                     // Add Hosting Package
//                                     System.out.print("Enter package name: ");
//                                     String pkgName = scanner.nextLine();
//                                     System.out.print("Enter package price: ");
//                                     while (!scanner.hasNextDouble()) {
//                                         System.out.print("Please enter a valid price (number): ");
//                                         scanner.next();
//                                     }
//                                     double pkgPrice = scanner.nextDouble();
//                                     scanner.nextLine();
//                                     System.out.print("Enter package features (comma-separated): ");
//                                     String pkgFeatures = scanner.nextLine();
//                                     WebHostingManagementSystem.addPackage(pkgName, pkgPrice, pkgFeatures);
//                                     break;

//                                 case 5:
//                                     // View All Support Tickets
//                                     WebHostingManagementSystem.displayAllTickets();
//                                     break;

//                                 case 6:
//                                     // Respond to Support Ticket
//                                     WebHostingManagementSystem.displayAllTickets();
//                                     System.out.print("Enter ticket number to respond: ");
//                                     while (!scanner.hasNextInt()) {
//                                         System.out.print("Please enter a valid ticket number: ");
//                                         scanner.next();
//                                     }
//                                     int ticketNum = scanner.nextInt();
//                                     scanner.nextLine();
//                                     System.out.print("Enter your response: ");
//                                     String response = scanner.nextLine();
//                                     WebHostingManagementSystem.respondToTicket(ticketNum, response);
//                                     break;

//                                 case 7:
//                                     System.out.println("Exiting Admin Menu...");
//                                     break;

//                                 default:
//                                     System.out.println("Invalid option. Please try again.");
//                             }
//                         } while (adminChoice != 7);

//                     } else {
//                         System.out.println("Invalid Admin Username or Password!");
//                         Accounts.delay();
//                     }
//                     break;

//                 case 2:
//                     // --- User Login / Onboarding Flow ---
//                     System.out.print("Enter username for user account: ");
//                     String userUsername = scanner.nextLine();
//                     System.out.print("Enter password for user account: ");
//                     String userPassword = scanner.nextLine();

//                     boolean userFound = false;
//                     HostingAccounts currentUser = null;
//                     for (HostingAccounts u : userList) {
//                         if (u.username.equals(userUsername) && u.password.equals(userPassword)) {
//                             userFound = true;
//                             currentUser = u;
//                             break;
//                         }
//                     }

//                     if (userFound) {
//                         System.out.println("User Login Successful!");
//                         Accounts.delay();

//                         // Check if onboarding is needed (no plan selected yet)
//                         if (currentUser.hostingData.selectedPlan == null) {
//                             // --- Onboarding Wizard ---
//                             System.out.println("\n=== Hosting Setup Wizard ===");

//                             // Step 1: Select Hosting Plan
//                             WebHostingManagementSystem.displayAvailablePackages();
//                             System.out.print("Select a hosting package by number: ");
//                             while (!scanner.hasNextInt()) {
//                                 System.out.print("Please enter a valid package number: ");
//                                 scanner.next();
//                             }
//                             int pkgChoice = scanner.nextInt();
//                             scanner.nextLine();
//                             currentUser.hostingData.selectHostingPlan(pkgChoice);

//                             // Step 2: Create Domain Name
//                             System.out.print("Enter Domain Name (e.g. mysite.com): ");
//                             String domainInput = scanner.nextLine();
//                             currentUser.hostingData.createDomainName(domainInput);

//                             // Step 3: Create Database Name
//                             System.out.print("Enter Database Name: ");
//                             String dbInput = scanner.nextLine();
//                             currentUser.hostingData.createDatabaseName(dbInput);

//                             // Step 4: Create Email Account
//                             System.out.print("Enter Email Account (e.g. you@mysite.com): ");
//                             String emailInput = scanner.nextLine();
//                             currentUser.hostingData.createEmailAccount(emailInput);

//                             // Summary and Billing
//                             double planPrice = currentUser.hostingData.getSelectedPlanPrice();
//                             System.out.println("\n=== Summary of Your Selections ===");
//                             System.out.println("Username: " + currentUser.username);
//                             System.out.println(
//                                     "Hosting Plan: " + currentUser.hostingData.selectedPlan + " ($" + planPrice + ")");
//                             System.out.println("Domain Name: " + currentUser.hostingData.domainName);
//                             System.out.println("Database Name: " + currentUser.hostingData.databaseName);
//                             System.out.println("Email Account: " + currentUser.hostingData.emailAccount);
//                             System.out.println("Total Due: $" + planPrice);

//                             // Step 5: Choose Payment Method
//                             System.out.println("\nSelect Payment Method:");
//                             System.out.println("1. Credit Card");
//                             System.out.println("2. PayPal");
//                             System.out.println("3. Bank Transfer");
//                             System.out.print("Enter choice: ");
//                             while (!scanner.hasNextInt()) {
//                                 System.out.print("Please enter a valid number (1-3): ");
//                                 scanner.next();
//                             }
//                             int payChoice = scanner.nextInt();
//                             scanner.nextLine();
//                             currentUser.hostingData.choosePaymentMethod(payChoice);

//                             // Step 6: Make Payment
//                             currentUser.hostingData.makePayment();
//                             System.out.println("=== Onboarding Complete! ===\n");
//                         }

//                         // --- Post-Onboarding Menu ---
//                         int userOption = 0;
//                         do {
//                             Accounts.userDisplayPostOnboard();
//                             System.out.print("Enter Your Choice: ");
//                             while (!scanner.hasNextInt()) {
//                                 System.out.print("Please enter a valid number: ");
//                                 scanner.next();
//                             }
//                             userOption = scanner.nextInt();
//                             scanner.nextLine();

//                             switch (userOption) {
//                                 case 1:
//                                     // Submit Support Ticket
//                                     System.out.print("Enter Support Ticket Text: ");
//                                     String ticketText = scanner.nextLine();
//                                     currentUser.hostingData.createSupportTicket(ticketText);
//                                     break;
//                                 case 2:
//                                     // View My Support Tickets/Responses
//                                     WebHostingManagementSystem.displayUserTickets(currentUser.username);
//                                     break;
//                                 case 3:
//                                     // View Hosting Packages
//                                     WebHostingManagementSystem.displayAvailablePackages();
//                                     break;
//                                 case 4:
//                                     System.out.println("Exiting User Menu...");
//                                     break;
//                                 default:
//                                     System.out.println("Invalid option. Please try again.");
//                             }
//                         } while (userOption != 4);

//                     } else {
//                         System.out.println(
//                                 "Invalid User Username or Password! Please ask an admin to create your account first.");
//                         Accounts.delay();
//                     }
//                     break;

//                 case 3:
//                     System.out.println("Exiting the program. Goodbye!");
//                     break;

//                 default:
//                     System.out.println("Invalid Option. Try Again.");
//             }

//         } while (initialOption != 3);

//         scanner.close();
//     }
// }


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// =================================================================================
// 1. ABSTRACTION and INTERFACE IMPLEMENTATION
// =================================================================================
// 'Displayable' is an interface that enforces a contract for any class that can be displayed.
// Any class implementing this interface MUST provide an implementation for the displayDetails() method.
interface Displayable {
    void displayDetails();
}

// 'Account' is an abstract class representing the core concept of an account.
// It cannot be instantiated directly. It provides common attributes (username, password)
// and abstract methods that subclasses must implement. This is a core example of ABSTRACTION.
abstract class Account {
    // =================================================================================
    // 2. ENCAPSULATION and ACCESS MODIFIERS
    // =================================================================================
    // Fields are 'protected', meaning they are accessible only within this package and by subclasses.
    // This hides the internal state from unrelated classes.
    protected String username;
    protected String password;

    // Abstract method to be implemented by subclasses. This is part of the abstraction.
    public abstract String getUsername();

    // Abstract method to represent the object's data as a string for file storage.
    public abstract String toDataString();


    // Common utility methods can be placed in the abstract base class.
    public static void loadingAnimation() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print("\rLoading.");
                Thread.sleep(300);
                System.out.print("\rLoading..");
                Thread.sleep(300);
                System.out.print("\rLoading...");
                Thread.sleep(300);
            }
            System.out.println("\rDone!        ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


// =================================================================================
// 3. INHERITANCE and METHOD OVERRIDING
// =================================================================================
// 'WebHostingPackage' is the base class for different hosting plans. It demonstrates inheritance.
// It also implements Displayable, enforcing it must have a displayDetails method.
class WebHostingPackage implements Displayable {
    // ENCAPSULATION: Fields are private, accessed via public getter methods.
    private String packageName;
    private double price;
    private String features;

    // =================================================================================
    // 4. CONSTRUCTOR OVERLOADING
    // =================================================================================
    // Main constructor with all details.
    public WebHostingPackage(String name, double price, String features) {
        this.packageName = name;
        this.price = price;
        this.features = features;
    }

    // Overloaded constructor for loading from a file.
    public WebHostingPackage(String[] data) {
        this.packageName = data[0];
        this.price = Double.parseDouble(data[1]);
        this.features = data[2];
    }


    // METHOD OVERRIDING: This method is from the Displayable interface.
    @Override
    public void displayDetails() {
        System.out.println("Package: " + packageName);
        System.out.println("Price: $" + price);
        System.out.println("Features: " + features);
    }

    // --- Getters for Encapsulated Fields ---
    public String getPackageName() { return packageName; }
    public double getPrice() { return price; }
    public String getFeatures() { return features; }
    
    // Method to convert package data to a savable string format.
    public String toDataString() {
        // Use a pipe '|' delimiter to avoid issues with commas in features.
        return packageName + "|" + price + "|" + features.replace("\n", " ").replace("|", "/");
    }
}

// INHERITANCE: 'BasicHosting' inherits from 'WebHostingPackage'.
class BasicHosting extends WebHostingPackage {
    public BasicHosting() {
        super("Basic Hosting", 5.99, "10GB Storage, 1 Website, Basic Support");
    }
}

// INHERITANCE: 'PremiumHosting' inherits from 'WebHostingPackage'.
class PremiumHosting extends WebHostingPackage {
    public PremiumHosting() {
        super("Premium Hosting", 12.99, "Unlimited Storage, Unlimited Websites, 24/7 Support");
    }
}

// 'TicketEntry' is a simple data class (POJO).
class TicketEntry {
    // ENCAPSULATION: Fields are private.
    private String username;
    private String ticketText;
    private String response;
    private boolean responded;

    public TicketEntry(String username, String ticketText) {
        this.username = username;
        this.ticketText = ticketText;
        this.response = "No response yet.";
        this.responded = false;
    }

    // Constructor for loading from a file.
    public TicketEntry(String[] data) {
        this.username = data[0];
        this.ticketText = data[1];
        this.response = data[2];
        this.responded = Boolean.parseBoolean(data[3]);
    }

    // --- Getters and Setters for Encapsulated Fields ---
    public String getUsername() { return username; }
    public String getTicketText() { return ticketText; }
    public String getResponse() { return response; }
    public boolean hasResponded() { return responded; }
    public void setResponse(String response) {
        this.response = response;
        this.responded = true;
    }
    
    // Method to convert ticket data to a savable string format.
    public String toDataString() {
        return username + "|" + ticketText.replace("\n", " ").replace("|", "/") + "|" + response.replace("\n", " ").replace("|", "/") + "|" + responded;
    }
}


// =================================================================================
// 5. COMPOSITION and AGGREGATION
// =================================================================================
// The 'WebHostingManagementSystem' class manages packages and tickets.
// It is a key part of the system's logic.
class WebHostingManagementSystem {
    // AGGREGATION: The system 'has-a' list of packages. The packages can exist
    // independently. The list is static, shared by all instances.
    private static ArrayList<WebHostingPackage> packages = new ArrayList<>();
    
    // AGGREGATION: The system also 'has-a' list of tickets.
    private static ArrayList<TicketEntry> tickets = new ArrayList<>();

    // COMPOSITION: The HostingAccount HAS-A WebHostingManagementSystem instance.
    // The lifecycle of these fields is tied to the lifecycle of the user's account object.
    private String domainName;
    private String databaseName;
    private String emailAccount;
    private String selectedPlan;
    private String paymentMethod;
    private String paymentStatus;

    // --- Static methods to manage shared data (Packages and Tickets) ---

    // CREATE (for Packages)
    public static void addPackage(String name, double price, String features) {
        packages.add(new WebHostingPackage(name, price, features));
        System.out.println("New hosting package added successfully.");
    }
    
    // READ (for Packages)
    public static void displayAvailablePackages() {
        if (packages.isEmpty()) {
            System.out.println("\nNo hosting packages configured.");
            return;
        }
        System.out.println("\nAvailable Hosting Packages:");
        for (int i = 0; i < packages.size(); i++) {
            System.out.println("\n--- " + (i + 1) + " ---");
            packages.get(i).displayDetails(); // POLYMORPHISM: Calling displayDetails()
        }
    }

    // DELETE (for Packages)
    public static void deletePackage(int index) {
        if (index >= 0 && index < packages.size()) {
            System.out.println("Package \"" + packages.get(index).getPackageName() + "\" has been deleted.");
            packages.remove(index);
        } else {
            System.out.println("Invalid package number.");
        }
    }

    // CREATE (for Tickets)
    public void createSupportTicket(String ownerUsername, String ticketText) {
        tickets.add(new TicketEntry(ownerUsername, ticketText));
        System.out.println("Support ticket submitted successfully.");
    }
    
    // READ (for Tickets)
    public static void displayAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("\nNo support tickets found.");
            return;
        }
        System.out.println("\n--- All Support Tickets ---");
        for (int i = 0; i < tickets.size(); i++) {
            TicketEntry t = tickets.get(i);
            System.out.printf("%d. User: %s | Status: %s\n   Ticket: %s\n   Response: %s\n\n",
                (i + 1), t.getUsername(), (t.hasResponded() ? "Responded" : "Pending"),
                t.getTicketText(), t.getResponse());
        }
    }

    // UPDATE (for Tickets)
    public static void respondToTicket(int ticketNumber, String response) {
        if (ticketNumber >= 1 && ticketNumber <= tickets.size()) {
            tickets.get(ticketNumber - 1).setResponse(response);
            System.out.println("Response to ticket " + ticketNumber + " recorded.");
        } else {
            System.out.println("Invalid ticket number.");
        }
    }

    // DELETE (for Tickets)
    public static void deleteTicket(int index) {
        if (index >= 0 && index < tickets.size()) {
            System.out.println("Ticket #" + (index+1) + " has been deleted.");
            tickets.remove(index);
        } else {
            System.out.println("Invalid ticket number.");
        }
    }
    
    // --- Getters/Setters for managing static collections, used by DataManager ---
    public static ArrayList<WebHostingPackage> getPackages() { return packages; }
    public static void setPackages(ArrayList<WebHostingPackage> loadedPackages) { packages = loadedPackages; }
    public static ArrayList<TicketEntry> getTickets() { return tickets; }
    public static void setTickets(ArrayList<TicketEntry> loadedTickets) { tickets = loadedTickets; }

    // --- Instance methods for managing user-specific data ---
    public void selectHostingPlan(int packageIndex) {
        if (packageIndex >= 0 && packageIndex < packages.size()) {
            WebHostingPackage pkg = packages.get(packageIndex);
            this.selectedPlan = pkg.getPackageName();
            System.out.println("You have selected: " + selectedPlan);
        } else {
            System.out.println("Invalid package selection.");
        }
    }
    
    public double getSelectedPlanPrice() {
        for (WebHostingPackage pkg : packages) {
            if (pkg.getPackageName().equals(this.selectedPlan)) {
                return pkg.getPrice();
            }
        }
        return 0.0;
    }

    // --- Other getters and setters for instance fields ---
    public String getDomainName() { return domainName; }
    public String getDatabaseName() { return databaseName; }
    public String getEmailAccount() { return emailAccount; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentStatus() { return paymentStatus; }
    public void setDomainName(String domain) { this.domainName = domain; }
    public void setDatabaseName(String db) { this.databaseName = db; }
    public void setEmailAccount(String email) { this.emailAccount = email; }
    public void setPaymentMethod(String method) { this.paymentMethod = method; }
    public void setPaymentStatus(String status) { this.paymentStatus = status; }
    public String getSelectedPlan() { return selectedPlan; }
    public void setSelectedPlan(String plan) { this.selectedPlan = plan; }
}


// INHERITANCE: 'AdminAccount' is a type of 'Account'.
class AdminAccount extends Account implements Displayable {
    public AdminAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Constructor for loading from file data
    public AdminAccount(String[] data) {
        this.username = data[0];
        this.password = data[1];
    }

    @Override
    public String getUsername() {
        return this.username;
    }
    
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
    
    @Override
    public String toDataString() {
        return username + "|" + password;
    }
    
    // METHOD OVERRIDING: Implements the method from the Displayable interface.
    @Override
    public void displayDetails() {
        System.out.println("Admin Account: " + this.username);
    }
}


// INHERITANCE: 'HostingAccount' is a type of 'Account'.
class HostingAccount extends Account implements Displayable {
    private String createdAt;
    
    // COMPOSITION: A HostingAccount 'has-a' WebHostingManagementSystem.
    public WebHostingManagementSystem hostingData;

    public HostingAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.createdAt = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.hostingData = new WebHostingManagementSystem(); // The composed object is created here.
    }
    
    // Constructor for loading from file data
    public HostingAccount(String[] data) {
        this.hostingData = new WebHostingManagementSystem();
        this.username = data[0];
        this.password = data[1];
        this.createdAt = data[2];
        // The ternary operator `(condition ? value_if_true : value_if_false)` handles nulls gracefully.
        this.hostingData.setSelectedPlan(data[3].equals("null") ? null : data[3]);
        this.hostingData.setDomainName(data[4].equals("null") ? null : data[4]);
        this.hostingData.setDatabaseName(data[5].equals("null") ? null : data[5]);
        this.hostingData.setEmailAccount(data[6].equals("null") ? null : data[6]);
        this.hostingData.setPaymentMethod(data[7].equals("null") ? null : data[7]);
        this.hostingData.setPaymentStatus(data[8].equals("null") ? null : data[8]);
    }
    
    @Override
    public String getUsername() { return this.username; }
    public boolean checkPassword(String password) { return this.password.equals(password); }

    @Override
    public String toDataString() {
        // Flatten the composed object's data into the string
        return username + "|" + password + "|" + createdAt + "|" + 
               hostingData.getSelectedPlan() + "|" + hostingData.getDomainName() + "|" + 
               hostingData.getDatabaseName() + "|" + hostingData.getEmailAccount() + "|" + 
               hostingData.getPaymentMethod() + "|" + hostingData.getPaymentStatus();
    }
    
    @Override
    public void displayDetails() {
        System.out.println("User Account: " + this.username + " (Created: " + this.createdAt + ")");
    }
}


// =================================================================================
// 6. FILE HANDLING (CRUD OPERATIONS IN .TXT FILES)
// =================================================================================
class DataManager {
    private static final String ADMINS_FILE = "admins.txt";
    private static final String USERS_FILE = "users.txt";
    private static final String PACKAGES_FILE = "packages.txt";
    private static final String TICKETS_FILE = "tickets.txt";
    private static final String DELIMITER = "\\|"; // Regex for the pipe character

    // --- Admin Data ---
    public static void saveAdmins(ArrayList<AdminAccount> admins) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ADMINS_FILE))) {
            for (AdminAccount admin : admins) {
                writer.println(admin.toDataString());
            }
        } catch (IOException e) {
            System.err.println("Error saving admins: " + e.getMessage());
        }
    }

    public static ArrayList<AdminAccount> loadAdmins() {
        ArrayList<AdminAccount> admins = new ArrayList<>();
        File file = new File(ADMINS_FILE);
        if (!file.exists()) return admins;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(DELIMITER);
                if (data.length >= 2) {
                    admins.add(new AdminAccount(data));
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading admins: " + e.getMessage());
        }
        return admins;
    }

    // --- User Data ---
    public static void saveUsers(ArrayList<HostingAccount> users) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(USERS_FILE))) {
            for (HostingAccount user : users) {
                writer.println(user.toDataString());
            }
        } catch (IOException e) {
            System.err.println("Error saving users: " + e.getMessage());
        }
    }

    public static ArrayList<HostingAccount> loadUsers() {
        ArrayList<HostingAccount> users = new ArrayList<>();
        File file = new File(USERS_FILE);
        if (!file.exists()) return users;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(DELIMITER, -1); // -1 limit to include trailing empty strings
                if (data.length >= 9) {
                    users.add(new HostingAccount(data));
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading users: " + e.getMessage());
        }
        return users;
    }
    
    // --- Package Data ---
    public static void savePackages() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PACKAGES_FILE))) {
            for (WebHostingPackage pkg : WebHostingManagementSystem.getPackages()) {
                writer.println(pkg.toDataString());
            }
        } catch (IOException e) {
            System.err.println("Error saving packages: " + e.getMessage());
        }
    }
    
    public static void loadPackages() {
        ArrayList<WebHostingPackage> packages = new ArrayList<>();
        File file = new File(PACKAGES_FILE);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(DELIMITER);
                if (data.length >= 3) {
                    packages.add(new WebHostingPackage(data));
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading packages: " + e.getMessage());
        }
        if (!packages.isEmpty()) {
            WebHostingManagementSystem.setPackages(packages);
        }
    }
    
    // --- Ticket Data ---
    public static void saveTickets() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(TICKETS_FILE))) {
            for (TicketEntry ticket : WebHostingManagementSystem.getTickets()) {
                writer.println(ticket.toDataString());
            }
        } catch (IOException e) {
            System.err.println("Error saving tickets: " + e.getMessage());
        }
    }
    
    public static void loadTickets() {
        ArrayList<TicketEntry> tickets = new ArrayList<>();
        File file = new File(TICKETS_FILE);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(DELIMITER);
                if (data.length >= 4) {
                    tickets.add(new TicketEntry(data));
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading tickets: " + e.getMessage());
        }
        if (!tickets.isEmpty()) {
            WebHostingManagementSystem.setTickets(tickets);
        }
    }
}


// =================================================================================
// 7. MAIN APPLICATION CLASS (FYP - Final Year Project)
// =================================================================================
// This class contains the main method and ties all other components together.
public class FYP {
    private static ArrayList<AdminAccount> adminList;
    private static ArrayList<HostingAccount> userList;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // --- READ: Load all data from files at startup ---
        loadAllData();

        int initialOption;
        do {
            displayInitialMenu();
            initialOption = getIntInput("Enter Your Choice: ");

            switch (initialOption) {
                case 1:
                    handleAdminLogin();
                    break;
                case 2:
                    handleUserLogin();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Option. Try Again.");
            }
        } while (initialOption != 3);

        scanner.close();
    }

    private static void loadAllData() {
        System.out.println("Loading data from files...");
        adminList = DataManager.loadAdmins();
        userList = DataManager.loadUsers();
        DataManager.loadPackages();
        DataManager.loadTickets();

        // If no admin exists, create a default one.
        if (adminList.isEmpty()) {
            System.out.println("No admin account found. Creating default admin ('admin'/'123').");
            adminList.add(new AdminAccount("admin", "123"));
            DataManager.saveAdmins(adminList);
        }
        
        // If no packages exist, create default ones.
        if (WebHostingManagementSystem.getPackages().isEmpty()) {
            System.out.println("No packages found. Creating default packages.");
            WebHostingManagementSystem.addPackage("Basic Hosting", 5.99, "10GB Storage, 1 Website");
            WebHostingManagementSystem.addPackage("Premium Hosting", 12.99, "Unlimited Storage, Unlimited Websites");
            DataManager.savePackages();
        }
        Account.loadingAnimation();
    }

    private static void handleAdminLogin() {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();
        
        AdminAccount currentAdmin = null;
        for (AdminAccount admin : adminList) {
            if (admin.getUsername().equals(username) && admin.checkPassword(password)) {
                currentAdmin = admin;
                break;
            }
        }
        
        Account.loadingAnimation();
        if (currentAdmin != null) {
            System.out.println("\nAdmin Login Successful! Welcome, " + currentAdmin.getUsername());
            adminMenu();
        } else {
            System.out.println("\nInvalid Admin Username or Password!");
        }
    }

    private static void adminMenu() {
        int choice;
        do {
            displayAdminMenu();
            choice = getIntInput("Enter Your Choice: ");
            
            switch(choice) {
                case 1: // Create Admin
                    System.out.print("Enter new admin username: ");
                    String newAdminUser = scanner.nextLine();
                    System.out.print("Enter new admin password: ");
                    String newAdminPass = scanner.nextLine();
                    adminList.add(new AdminAccount(newAdminUser, newAdminPass));
                    DataManager.saveAdmins(adminList); // CREATE/SAVE
                    System.out.println("Admin created successfully.");
                    break;
                case 2: // Create User
                    System.out.print("Enter new user username: ");
                    String newUser = scanner.nextLine();
                    System.out.print("Enter new user password: ");
                    String newUserPass = scanner.nextLine();
                    userList.add(new HostingAccount(newUser, newUserPass));
                    DataManager.saveUsers(userList); // CREATE/SAVE
                    System.out.println("User created successfully.");
                    break;
                case 3: // View/Manage Packages
                    manageHostingPackages();
                    break;
                case 4: // View/Manage Tickets
                    manageSupportTickets();
                    break;
                case 5: // View All Users
                    System.out.println("\n--- All User Accounts ---");
                    for(HostingAccount u : userList) u.displayDetails();
                    break;
                case 6: // Delete User
                    deleteUser();
                    break;
                case 7:
                    System.out.println("Exiting Admin Menu...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
    
    private static void manageHostingPackages() {
        WebHostingManagementSystem.displayAvailablePackages();
        System.out.println("\nPackage Management:");
        System.out.println("1. Add a new Package");
        System.out.println("2. Delete a Package");
        System.out.println("3. Back to Admin Menu");
        int choice = getIntInput("Choose an option: ");
        
        if (choice == 1) { // CREATE
            System.out.print("Enter package name: ");
            String name = scanner.nextLine();
            System.out.print("Enter package price: ");
            double price = getDoubleInput("");
            System.out.print("Enter package features: ");
            String features = scanner.nextLine();
            WebHostingManagementSystem.addPackage(name, price, features);
            DataManager.savePackages(); // SAVE
        } else if (choice == 2) { // DELETE
            int pkgNum = getIntInput("Enter package number to delete: ");
            WebHostingManagementSystem.deletePackage(pkgNum - 1);
            DataManager.savePackages(); // SAVE
        }
    }
    
    private static void manageSupportTickets() {
        WebHostingManagementSystem.displayAllTickets();
        System.out.println("\nTicket Management:");
        System.out.println("1. Respond to a Ticket");
        System.out.println("2. Delete a Ticket");
        System.out.println("3. Back to Admin Menu");
        int choice = getIntInput("Choose an option: ");

        if (choice == 1) { // UPDATE
            int ticketNum = getIntInput("Enter ticket number to respond to: ");
            System.out.print("Enter your response: ");
            String response = scanner.nextLine();
            WebHostingManagementSystem.respondToTicket(ticketNum, response);
            DataManager.saveTickets(); // SAVE
        } else if (choice == 2) { // DELETE
            int ticketNum = getIntInput("Enter ticket number to delete: ");
            WebHostingManagementSystem.deleteTicket(ticketNum - 1);
            DataManager.saveTickets(); // SAVE
        }
    }
    
    private static void deleteUser() {
        System.out.println("\n--- Select User to Delete ---");
        for (int i=0; i < userList.size(); i++) {
            System.out.println((i+1) + ". " + userList.get(i).getUsername());
        }
        int userNum = getIntInput("Enter user number to DELETE: ");
        if (userNum > 0 && userNum <= userList.size()) {
            String deletedUser = userList.get(userNum - 1).getUsername();
            userList.remove(userNum - 1);
            DataManager.saveUsers(userList); // DELETE/SAVE
            System.out.println("User '" + deletedUser + "' has been deleted.");
        } else {
            System.out.println("Invalid user number.");
        }
    }

    private static void handleUserLogin() {
        System.out.print("Enter user username: ");
        String username = scanner.nextLine();
        System.out.print("Enter user password: ");
        String password = scanner.nextLine();
        
        HostingAccount currentUser = null;
        for (HostingAccount user : userList) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                currentUser = user;
                break;
            }
        }
        
        Account.loadingAnimation();
        if (currentUser != null) {
            System.out.println("\nUser Login Successful! Welcome, " + currentUser.getUsername());
            // Check if user needs to complete onboarding
            if (currentUser.hostingData.getSelectedPlan() == null) {
                userOnboardingWizard(currentUser);
            }
            userMenu(currentUser);
        } else {
            System.out.println("\nInvalid User Username or Password!");
        }
    }
    
    private static void userOnboardingWizard(HostingAccount user) {
        System.out.println("\n=== Welcome! Let's set up your hosting account. ===");
        
        // Select Plan
        WebHostingManagementSystem.displayAvailablePackages();
        int pkgChoice = getIntInput("Select a hosting package by number: ");
        user.hostingData.selectHostingPlan(pkgChoice - 1);

        // Details
        System.out.print("Enter Domain Name (e.g. mysite.com): ");
        user.hostingData.setDomainName(scanner.nextLine());
        System.out.print("Enter Database Name: ");
        user.hostingData.setDatabaseName(scanner.nextLine());
        System.out.print("Enter Email Account (e.g. you@mysite.com): ");
        user.hostingData.setEmailAccount(scanner.nextLine());
        
        // Payment
        System.out.println("\nSelect Payment Method:\n1. Credit Card\n2. PayPal\n3. Bank Transfer");
        int payChoice = getIntInput("Enter choice: ");
        user.hostingData.setPaymentMethod(payChoice == 1 ? "Credit Card" : payChoice == 2 ? "PayPal" : "Bank Transfer");
        user.hostingData.setPaymentStatus("Paid");

        DataManager.saveUsers(userList); // UPDATE/SAVE user data after onboarding
        System.out.println("\nOnboarding complete! Your account is ready.");
    }
    
    private static void userMenu(HostingAccount user) {
        int choice;
        do {
            displayUserMenu();
            choice = getIntInput("Enter Your Choice: ");
            
            switch (choice) {
                case 1: // Submit Ticket
                    System.out.print("Enter your support query: ");
                    String ticketText = scanner.nextLine();
                    user.hostingData.createSupportTicket(user.getUsername(), ticketText);
                    DataManager.saveTickets(); // CREATE/SAVE
                    break;
                case 2: // View My Tickets
                    System.out.println("\n--- Your Support Tickets ---");
                    boolean found = false;
                    for(TicketEntry t : WebHostingManagementSystem.getTickets()) {
                        if (t.getUsername().equals(user.getUsername())) {
                            System.out.printf("Ticket: %s\nResponse: %s\n\n", t.getTicketText(), t.getResponse());
                            found = true;
                        }
                    }
                    if (!found) System.out.println("You have no tickets.");
                    break;
                case 3: // View Packages
                    WebHostingManagementSystem.displayAvailablePackages();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    // --- Helper methods for input and menus ---

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next(); // consume invalid input
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return value;
    }
    
    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid number (e.g., 9.99): ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    private static void displayInitialMenu() {
        System.out.println("\n!! Welcome To NULLxCODER HOSTING !!");
        System.out.println("1 ==> Enter as an Admin");
        System.out.println("2 ==> Enter as a User");
        System.out.println("3 ==> Exit");
    }

    private static void displayAdminMenu() {
        System.out.println("\n!! Admin Menu !!");
        System.out.println("1. Create a new Admin");
        System.out.println("2. Create a new User");
        System.out.println("3. View/Manage Hosting Packages");
        System.out.println("4. View/Manage All Support Tickets");
        System.out.println("5. View All Users");
        System.out.println("6. Delete a User Account");
        System.out.println("7. Exit Admin Menu");
    }

    private static void displayUserMenu() {
        System.out.println("\n-- User Menu --");
        System.out.println("1. Submit Support Ticket");
        System.out.println("2. View My Support Tickets/Responses");
        System.out.println("3. View Available Hosting Packages");
        System.out.println("4. Logout");
    }
}
