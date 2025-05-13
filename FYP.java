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
}

class hostingAccounts extends Accounts {
    hostingAccounts(String username, String password) {
        this.username = username;
        this.password = password;
        this.created_at = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Hosting account created for " + username + " on " + created_at);
    }
}

class adminAccount extends Accounts {
    adminAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.created_at = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Admin account created for " + username + " on " + created_at);
    }
}

public class FYP {

    public static void main(String[] args) {

        System.out.println("Hello World! This is my Java Web Hosting Management System.");
        hostingAccounts a = new hostingAccounts("zain", "100");
    }

}
