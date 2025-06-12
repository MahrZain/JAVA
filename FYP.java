import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Represents a hosting package with name, price, and features
class WebHostingPackage {
    protected String packageName;
    protected double price;
    protected String features;

    public WebHostingPackage(String name, double price, String features) {
        this.packageName = name;
        this.price = price;
        this.features = features;
    }

    public void displayPackageDetails() {
        System.out.println("Package: " + packageName);
        System.out.println("Price: $" + price);
        System.out.println("Features: " + features);
    }

    public String getPackageName() {
        return packageName;
    }

    public double getPrice() {
        return price;
    }
}

// Basic hosting plan
class BasicHosting extends WebHostingPackage {
    public BasicHosting() {
        super("Basic Hosting", 5.99, "10GB Storage, 1 Website, Basic Support");
    }
}

// Premium hosting plan
class PremiumHosting extends WebHostingPackage {
    public PremiumHosting() {
        super("Premium Hosting", 12.99, "Unlimited Storage, Unlimited Websites, 24/7 Support");
    }
}

// Represents a support ticket entry
class TicketEntry {
    public String username;
    public String ticketText;
    public String response;
    public boolean responded;

    public TicketEntry(String username, String ticketText) {
        this.username = username;
        this.ticketText = ticketText;
        this.response = "";
        this.responded = false;
    }
}

// The main hosting‐management system, handling package catalog and support
// tickets
class WebHostingManagementSystem {
    private static ArrayList<WebHostingPackage> packages = new ArrayList<>();
    private static ArrayList<TicketEntry> tickets = new ArrayList<>();
    private String ownerUsername;

    // Per‐user fields
    public String hostingAccount;
    public String domainName;
    public String databaseName;
    public String emailAccount;
    public String selectedPlan;
    public String paymentMethod;
    public String paymentStatus;

    // Constructor: sets owner and initializes default packages if needed
    public WebHostingManagementSystem(String ownerUsername) {
        this.ownerUsername = ownerUsername;
        if (packages.isEmpty()) {
            // Initialize default packages only once
            packages.add(new BasicHosting());
            packages.add(new PremiumHosting());
        }
    }

    // Static: add a new hosting package (admin use)
    public static void addPackage(String name, double price, String features) {
        packages.add(new WebHostingPackage(name, price, features));
        System.out.println("New hosting package \"" + name + "\" added successfully.");
    }

    // Static: display all available packages
    public static void displayAvailablePackages() {
        System.out.println("\nAvailable Hosting Packages:");
        for (int i = 0; i < packages.size(); i++) {
            System.out.println((i + 1) + ". ");
            packages.get(i).displayPackageDetails();
            System.out.println();
        }
    }

    // Static: display all support tickets (admin use)
    public static void displayAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("\nNo support tickets found.");
            return;
        }
        System.out.println("\nSupport Tickets:");
        for (int i = 0; i < tickets.size(); i++) {
            TicketEntry t = tickets.get(i);
            System.out.println((i + 1) + ". User: " + t.username);
            System.out.println("   Ticket: " + t.ticketText);
            if (t.responded) {
                System.out.println("   Response: " + t.response);
            } else {
                System.out.println("   No response yet.");
            }
            System.out.println();
        }
    }

    // Static: respond to a specific ticket (admin use)
    public static void respondToTicket(int ticketNumber, String response) {
        if (ticketNumber < 1 || ticketNumber > tickets.size()) {
            System.out.println("Invalid ticket number.");
            return;
        }
        TicketEntry t = tickets.get(ticketNumber - 1);
        t.response = response;
        t.responded = true;
        System.out.println("Response to ticket " + ticketNumber + " recorded.");
    }

    // Static: display all tickets for a given user
    public static void displayUserTickets(String username) {
        boolean found = false;
        for (TicketEntry t : tickets) {
            if (t.username.equals(username)) {
                if (!found) {
                    System.out.println("\nYour Support Tickets:");
                    found = true;
                }
                System.out.println("- Ticket: " + t.ticketText);
                if (t.responded) {
                    System.out.println("  Response: " + t.response);
                } else {
                    System.out.println("  No response yet.");
                }
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("\nYou have not submitted any support tickets.");
        }
    }

    // Instance: create a hosting account for this user
    public void createHostingAccount(String acc) {
        hostingAccount = acc;
        System.out.println("Hosting Account Created: " + acc);
    }

    // Instance: create domain name for this user
    public void createDomainName(String domain) {
        domainName = domain;
        System.out.println("Domain Name Created: " + domain);
    }

    // Instance: create database name for this user
    public void createDatabaseName(String db) {
        databaseName = db;
        System.out.println("Database Name Created: " + db);
    }

    // Instance: create email account for this user
    public void createEmailAccount(String email) {
        emailAccount = email;
        System.out.println("Email Account Created: " + email);
    }

    // Instance: select a hosting plan by index
    public void selectHostingPlan(int packageIndex) {
        if (packageIndex < 1 || packageIndex > packages.size()) {
            System.out.println("Invalid package selection.");
            return;
        }
        WebHostingPackage pkg = packages.get(packageIndex - 1);
        selectedPlan = pkg.getPackageName();
        System.out.println("You have selected: " + selectedPlan + " at $" + pkg.getPrice());
    }

    // Instance: choose a payment method from predefined menu
    public void choosePaymentMethod(int methodChoice) {
        switch (methodChoice) {
            case 1:
                paymentMethod = "Credit Card";
                break;
            case 2:
                paymentMethod = "PayPal";
                break;
            case 3:
                paymentMethod = "Bank Transfer";
                break;
            default:
                System.out.println("Invalid payment method selection.");
                paymentMethod = null;
                return;
        }
        System.out.println("Payment Method Set: " + paymentMethod);
    }

    // Instance: simulate making a payment
    public void makePayment() {
        if (selectedPlan == null) {
            System.out.println("Please select a hosting plan before making payment.");
            return;
        }
        if (paymentMethod == null) {
            System.out.println("Please choose a valid payment method before making payment.");
            return;
        }
        paymentStatus = "Paid";
        System.out.println("Payment of $" + getSelectedPlanPrice() + " for " + selectedPlan + " completed via "
                + paymentMethod + ".");
        System.out.println("Payment Status: " + paymentStatus);
    }

    // Changed to public so FYP can call it
    public double getSelectedPlanPrice() {
        for (WebHostingPackage pkg : packages) {
            if (pkg.getPackageName().equals(selectedPlan)) {
                return pkg.getPrice();
            }
        }
        return 0.0;
    }

    // Instance: submit a support ticket
    public void createSupportTicket(String ticket) {
        tickets.add(new TicketEntry(ownerUsername, ticket));
        System.out.println("Support Ticket Submitted: " + ticket);
    }
}

// Base “Accounts” class: holds username, password, and creation date if
// applicable
class Accounts {
    protected String username;
    protected String password;
    protected String created_at;

    // Initial (landing) menu
    public static void intialDisplay() {
        System.out.println("\n!! Welcome To NULLxCODER HOSTING !!");
        System.out.println("1 ==> Enter as an Admin");
        System.out.println("2 ==> Enter as a User");
        System.out.println("3 ==> Exit");
    }

    // Admin menu
    public static void adminDisplay() {
        System.out.println("\n!! Admin Menu !!");
        System.out.println("1 ==> Create a new Admin");
        System.out.println("2 ==> Create a new User");
        System.out.println("3 ==> View Hosting Packages");
        System.out.println("4 ==> Add Hosting Package");
        System.out.println("5 ==> View All Support Tickets");
        System.out.println("6 ==> Respond to Support Ticket");
        System.out.println("7 ==> Exit Admin Menu");
    }

    // User menu after onboarding
    public static void userDisplayPostOnboard() {
        System.out.println("\nUser Menu:");
        System.out.println("1. Submit Support Ticket");
        System.out.println("2. View My Support Tickets/Responses");
        System.out.println("3. View Hosting Packages");
        System.out.println("4. Exit User Menu");
    }

    // Simple “loading” animation for a few seconds
    public static void loadingAnimation() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.print("\rLoading.");
                Thread.sleep(500);
                System.out.print("\rLoading..");
                Thread.sleep(500);
                System.out.print("\rLoading...");
                Thread.sleep(500);
            }
            System.out.println("\rDone!        ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Pause for a short time (3 seconds)
    public static void delay() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Represents a user account; when constructed, prints creation details and
// initializes hosting data
class HostingAccounts extends Accounts {
    public WebHostingManagementSystem hostingData;

    public HostingAccounts(String username, String password) {
        this.username = username;
        this.password = password;
        this.created_at = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("\nPlease wait while we create your hosting account...");
        Accounts.loadingAnimation();
        System.out.println("Hosting account created for \"" + username + "\" on " + created_at);
        Accounts.delay();
        // Initialize per-user hosting data, passing the username
        this.hostingData = new WebHostingManagementSystem(username);
    }
}

// Represents an admin account
class AdminAccount extends Accounts {
    public AdminAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class FYP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Initialize default packages once (triggered by passing empty username)
        new WebHostingManagementSystem("");

        // 2) Admin and user lists
        ArrayList<AdminAccount> adminList = new ArrayList<>();
        adminList.add(new AdminAccount("admin", "123")); // default admin

        ArrayList<HostingAccounts> userList = new ArrayList<>();

        int initialOption = 0;

        do {
            Accounts.intialDisplay();
            System.out.print("Enter Your Choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            initialOption = scanner.nextInt();
            scanner.nextLine();

            switch (initialOption) {
                case 1:
                    // --- Admin Login / Admin Menu ---
                    System.out.print("Enter username for admin account: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter password for admin account: ");
                    String adminPassword = scanner.nextLine();

                    System.out.println("Please Wait While We Are Checking Your Credentials");
                    Accounts.loadingAnimation();
                    Accounts.delay();

                    boolean adminFound = false;
                    for (AdminAccount a : adminList) {
                        if (a.username.equals(adminUsername) && a.password.equals(adminPassword)) {
                            adminFound = true;
                            break;
                        }
                    }

                    if (adminFound) {
                        System.out.println("Admin Login Successful!");
                        Accounts.delay();

                        int adminChoice;
                        do {
                            Accounts.adminDisplay();
                            System.out.print("Enter Your Choice: ");
                            while (!scanner.hasNextInt()) {
                                System.out.print("Please enter a valid number: ");
                                scanner.next();
                            }
                            adminChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (adminChoice) {
                                case 1:
                                    // Create a new Admin
                                    System.out.print("Enter new admin username: ");
                                    String newAdminUser = scanner.nextLine();
                                    System.out.print("Enter new admin password: ");
                                    String newAdminPass = scanner.nextLine();

                                    // Check for duplicate username
                                    boolean duplicateAdmin = false;
                                    for (AdminAccount a : adminList) {
                                        if (a.username.equals(newAdminUser)) {
                                            duplicateAdmin = true;
                                            break;
                                        }
                                    }
                                    if (duplicateAdmin) {
                                        System.out.println("An admin with that username already exists.");
                                    } else {
                                        adminList.add(new AdminAccount(newAdminUser, newAdminPass));
                                        System.out.println("New admin \"" + newAdminUser + "\" created successfully.");
                                    }
                                    break;

                                case 2:
                                    // Create a new User
                                    System.out.print("Enter new user username: ");
                                    String newUser = scanner.nextLine();
                                    System.out.print("Enter new user password: ");
                                    String newUserPass = scanner.nextLine();

                                    // Check for duplicate username
                                    boolean duplicateUser = false;
                                    for (HostingAccounts u : userList) {
                                        if (u.username.equals(newUser)) {
                                            duplicateUser = true;
                                            break;
                                        }
                                    }
                                    if (duplicateUser) {
                                        System.out.println("A user with that username already exists.");
                                    } else {
                                        HostingAccounts createdUser = new HostingAccounts(newUser, newUserPass);
                                        userList.add(createdUser);
                                        System.out.println("New user \"" + newUser + "\" created successfully.");
                                    }
                                    break;

                                case 3:
                                    // View Hosting Packages
                                    WebHostingManagementSystem.displayAvailablePackages();
                                    break;

                                case 4:
                                    // Add Hosting Package
                                    System.out.print("Enter package name: ");
                                    String pkgName = scanner.nextLine();
                                    System.out.print("Enter package price: ");
                                    while (!scanner.hasNextDouble()) {
                                        System.out.print("Please enter a valid price (number): ");
                                        scanner.next();
                                    }
                                    double pkgPrice = scanner.nextDouble();
                                    scanner.nextLine();
                                    System.out.print("Enter package features (comma-separated): ");
                                    String pkgFeatures = scanner.nextLine();
                                    WebHostingManagementSystem.addPackage(pkgName, pkgPrice, pkgFeatures);
                                    break;

                                case 5:
                                    // View All Support Tickets
                                    WebHostingManagementSystem.displayAllTickets();
                                    break;

                                case 6:
                                    // Respond to Support Ticket
                                    WebHostingManagementSystem.displayAllTickets();
                                    System.out.print("Enter ticket number to respond: ");
                                    while (!scanner.hasNextInt()) {
                                        System.out.print("Please enter a valid ticket number: ");
                                        scanner.next();
                                    }
                                    int ticketNum = scanner.nextInt();
                                    scanner.nextLine();
                                    System.out.print("Enter your response: ");
                                    String response = scanner.nextLine();
                                    WebHostingManagementSystem.respondToTicket(ticketNum, response);
                                    break;

                                case 7:
                                    System.out.println("Exiting Admin Menu...");
                                    break;

                                default:
                                    System.out.println("Invalid option. Please try again.");
                            }
                        } while (adminChoice != 7);

                    } else {
                        System.out.println("Invalid Admin Username or Password!");
                        Accounts.delay();
                    }
                    break;

                case 2:
                    // --- User Login / Onboarding Flow ---
                    System.out.print("Enter username for user account: ");
                    String userUsername = scanner.nextLine();
                    System.out.print("Enter password for user account: ");
                    String userPassword = scanner.nextLine();

                    boolean userFound = false;
                    HostingAccounts currentUser = null;
                    for (HostingAccounts u : userList) {
                        if (u.username.equals(userUsername) && u.password.equals(userPassword)) {
                            userFound = true;
                            currentUser = u;
                            break;
                        }
                    }

                    if (userFound) {
                        System.out.println("User Login Successful!");
                        Accounts.delay();

                        // Check if onboarding is needed (no plan selected yet)
                        if (currentUser.hostingData.selectedPlan == null) {
                            // --- Onboarding Wizard ---
                            System.out.println("\n=== Hosting Setup Wizard ===");

                            // Step 1: Select Hosting Plan
                            WebHostingManagementSystem.displayAvailablePackages();
                            System.out.print("Select a hosting package by number: ");
                            while (!scanner.hasNextInt()) {
                                System.out.print("Please enter a valid package number: ");
                                scanner.next();
                            }
                            int pkgChoice = scanner.nextInt();
                            scanner.nextLine();
                            currentUser.hostingData.selectHostingPlan(pkgChoice);

                            // Step 2: Create Domain Name
                            System.out.print("Enter Domain Name (e.g. mysite.com): ");
                            String domainInput = scanner.nextLine();
                            currentUser.hostingData.createDomainName(domainInput);

                            // Step 3: Create Database Name
                            System.out.print("Enter Database Name: ");
                            String dbInput = scanner.nextLine();
                            currentUser.hostingData.createDatabaseName(dbInput);

                            // Step 4: Create Email Account
                            System.out.print("Enter Email Account (e.g. you@mysite.com): ");
                            String emailInput = scanner.nextLine();
                            currentUser.hostingData.createEmailAccount(emailInput);

                            // Summary and Billing
                            double planPrice = currentUser.hostingData.getSelectedPlanPrice();
                            System.out.println("\n=== Summary of Your Selections ===");
                            System.out.println("Username: " + currentUser.username);
                            System.out.println(
                                    "Hosting Plan: " + currentUser.hostingData.selectedPlan + " ($" + planPrice + ")");
                            System.out.println("Domain Name: " + currentUser.hostingData.domainName);
                            System.out.println("Database Name: " + currentUser.hostingData.databaseName);
                            System.out.println("Email Account: " + currentUser.hostingData.emailAccount);
                            System.out.println("Total Due: $" + planPrice);

                            // Step 5: Choose Payment Method
                            System.out.println("\nSelect Payment Method:");
                            System.out.println("1. Credit Card");
                            System.out.println("2. PayPal");
                            System.out.println("3. Bank Transfer");
                            System.out.print("Enter choice: ");
                            while (!scanner.hasNextInt()) {
                                System.out.print("Please enter a valid number (1-3): ");
                                scanner.next();
                            }
                            int payChoice = scanner.nextInt();
                            scanner.nextLine();
                            currentUser.hostingData.choosePaymentMethod(payChoice);

                            // Step 6: Make Payment
                            currentUser.hostingData.makePayment();
                            System.out.println("=== Onboarding Complete! ===\n");
                        }

                        // --- Post-Onboarding Menu ---
                        int userOption = 0;
                        do {
                            Accounts.userDisplayPostOnboard();
                            System.out.print("Enter Your Choice: ");
                            while (!scanner.hasNextInt()) {
                                System.out.print("Please enter a valid number: ");
                                scanner.next();
                            }
                            userOption = scanner.nextInt();
                            scanner.nextLine();

                            switch (userOption) {
                                case 1:
                                    // Submit Support Ticket
                                    System.out.print("Enter Support Ticket Text: ");
                                    String ticketText = scanner.nextLine();
                                    currentUser.hostingData.createSupportTicket(ticketText);
                                    break;
                                case 2:
                                    // View My Support Tickets/Responses
                                    WebHostingManagementSystem.displayUserTickets(currentUser.username);
                                    break;
                                case 3:
                                    // View Hosting Packages
                                    WebHostingManagementSystem.displayAvailablePackages();
                                    break;
                                case 4:
                                    System.out.println("Exiting User Menu...");
                                    break;
                                default:
                                    System.out.println("Invalid option. Please try again.");
                            }
                        } while (userOption != 4);

                    } else {
                        System.out.println(
                                "Invalid User Username or Password! Please ask an admin to create your account first.");
                        Accounts.delay();
                    }
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
}
