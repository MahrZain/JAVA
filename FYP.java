import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class webHostingManagementSystem {
    private String hostingAccount;
    private String domainName;
    private String databaseName;
    private String emailAccount;
    private String supportTicket;
    private String hostingPlan;
    private String paymentMethod;
    private String paymentStatus;
    private String supportStatus;
    private String supportResponseTimeDate;

}

class Accounts {
    protected String username;
    protected String password;
    protected String created_at;

    public static void intialDisplay(){
        System.out.println("!! Welcome To NULLxCODER HOSTING !!");
        System.out.println("1 ==> Enter as an Admin");
        System.out.println("2 ==> Enter as an User");
        System.out.println("3 ==> Exit");
    }
    public static void adminDisplay(){
        System.out.println("!! Welcome To Admin !!");
        System.out.println("1 ==> Create a Admin");
        System.out.println("2 ==> Create a User");
        System.out.println("3 ==> Exit");
    }


    public static void displayMenu() {
        System.out.println("1. Create Hosting Account");
        System.out.println("3. Create Domain Name");
        System.out.println("4. Create Database Name");
        System.out.println("5. Create Email Account");
        System.out.println("6. Create Support Ticket");
        System.out.println("7. Create Hosting Plan");
        System.out.println("8. Create Payment Method");
        System.out.println("9. Create Payment Status");
        System.out.println("10. Create Support Status");
        System.out.println("11. Create Support Response Time Date");
        System.out.println("12. Exit");
    }

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

    public static void delay() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class hostingAccounts extends Accounts {
    hostingAccounts(String username, String password) {
        this.username = username;
        this.password = password;
        this.created_at = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Please wait while we create your hosting account...");
        Accounts.loadingAnimation();
        System.out.println("Hosting account created for " + username + " on " + created_at);
        Accounts.delay();
    }
}

class adminAccount extends Accounts {
    adminAccount(String username, String password) {
        this.username = username;
        this.password = password;

    }
}

public class FYP {

    public static void main(String[] args) {
        int option = 0;
        int initailoption = 0;
        Scanner scanner = new Scanner(System.in);
        // List<Accounts> account = new ArrayList<>();
        // System.out.println("Hello World! This is my Java Web Hosting Management System.");
        do{
            Accounts.intialDisplay();
            System.out.print("Enter Your Choice: ");
            initailoption = scanner.nextInt();
            scanner.nextLine();
            switch (initailoption) {
                case 1:
                                System.out.print("Enter username for admin account: ");
                                String adminUsername = scanner.nextLine();
                                System.out.print("Enter password for admin account: ");
                                String adminPassword = scanner.nextLine();
                                adminAccount newAdminAccount = new adminAccount(adminUsername, adminPassword);
                                System.out.println("Please Wait While We Are Checking Your Credencials");
                                Accounts.loadingAnimation();
                                Accounts.delay();
                                if(adminUsername.equals("admin") && adminPassword.equals("123")){
                                    System.out.print("Login Succesfull!");
                                    Accounts.delay();
                                    Accounts.adminDisplay();
                                    int adminchoice = scanner.nextInt();
                                }
                                else{
                                    System.out.println("Invalid Username & Password!");
                                    Accounts.delay();
                                }
                    
                    break;
                case 2:
                do {
                        Accounts.displayMenu();
                        System.out.print("Please select an option from the menu: ");
                        option = scanner.nextInt();
                        option = option;
                        scanner.nextLine();
                        switch (option) {
                            case 1:
                                System.out.print("Enter username for hosting account: ");
                                String username = scanner.nextLine();
                                System.out.print("Enter password for hosting account: ");
                                String password = scanner.nextLine();
                                hostingAccounts newAccount = new hostingAccounts(username, password);
                                break;

                            default:
                                System.out.println("Invalid option. Please try again.");
                        }
                    } while (option != 12);
                    System.out.println("Exiting the program. Goodbye!");
                default:
                    break;
            }
        }while (initailoption != 3);
    }

}

