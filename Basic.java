// import java.util.Scanner;
// public class Basic {
// public static void main(String[] args) {
//     int power=0,total=0;
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// while (num!=0){
//     int ld = num%10;
//     num =num/10;
//     total =total + (ld * (int)Math.pow(2, power));
//     power++;
// }
// System.out.println(total);
// }
// }

// import java.util.Scanner;

// public class Basic {

//     public static void main(String[] args) {
//         int z = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("================================");
//         for (int i = 0; i < 3; i++) {
//             String s1 = sc.next();
//             int x = sc.nextInt();
//             int count = 0;
//             z = x;
//             while (z > 0) {
//                 z = z / 10;
//                 count++;

//             }
//             if (count == 0) {
//                 System.out.print(s1+"\t\t\t   ");
//                 System.out.print("00" + x);

//             }
//             else if(count == 1){
//                 System.out.print(s1+"\t\t\t   ");
//                 System.out.println("00" + x);
//             }
//             else if(count == 2){
//                 System.out.print(s1+"\t\t\t   ");
//                 System.out.println("0" + x);
//             }
//             else{
//                 System.out.print(s1+"\t\t\t");
//                 System.out.print(x);

//             }
//         }
//         System.out.println();
//         System.out.println("================================");

//     }
// }

import java.util.*;
// public class Basic{
//     public static int reverse_number(int a) {
//         int rem=0;
//         while (a!=0) {
//             int digit=a%10;
//             rem = rem * 10 + digit;
//             a/=10;
//         }
//         return rem;
//     }
//     public static boolean palendrom(int a, int b) {
//         boolean check = false;
//         if(a == b){
//             return true;
//         }
//         return check;
//     }
//     public static void main(String[] args) {
//         int a,b=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         a = sc.nextInt();
//         b=a;
//         a= reverse_number(a);
//         boolean result = palendrom(a, b);
//         if(result){
//             System.out.println("Number is Palendrom");
//         }
//         else{

//             System.out.println("Number is Not a Palendrom");
//         }

//     }
// }

// public class Basic{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("================================");

//         // Reading 3 inputs
//         for (int i = 0; i < 3; i++) {
//             String s1 = sc.next();
//             int x = sc.nextInt();

//             // Using printf to format the output
//             System.out.printf("%-15s%03d\n", s1, x);
//         }

//         System.out.println("================================");
//     }
// }

// public class Basic{
// public static void hollow(int row,int col) {
//     for(int i=0;i<=row;i++){
//         for (int j=0; j <=col; j++) {
//             if (i==0|j==0|i==row|j==col) {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }
// public static void main(String []args){
// hollow(10, 10);
// }

// public static void main(String[] args) {
//     int n=50;
//     for (int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print(".");
//         }
//         System.out.println();
//     }
// }

// public static void main(String[] args) {
//     int z=1;
//     for (int i = 1; i <=5; i++) {
//         for (int j = 1; j <= i; j++) {
//         System.out.print(z+" ");
//         z++;   
//         }
//         System.out.println();
//     }
// }

// public static void main(String[] args) {
//     for (int i = 1; i <=10; i++) {
//         for (int j = 1; j <= i; j++) {
//             if((i+j)%2==0){
//                 System.out.print(1);
//             }
//             else{
//                 System.out.print(0);
//             }

//         }
//         System.out.println();
//     }
// }

// public static void main(String[] args) {
//     int n=14;
//         for (int i = 1; i <=n; i++) {
//             // star - i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             // space - 2*(n-i)
//             for(int z=1;z<=2*(n-i);z++){
//                 System.out.print(" ");
//             }
//             // star - i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n; i>=1; i--) {
//             // star - i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             // space - 2*(n-i)
//             for(int z=1;z<=2*(n-i);z++){
//                 System.out.print(" ");
//             }
//             // star - i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

// }

// public static void main(String[] args) {
//     int n=25;
//     for(int i=0;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int z=1;z<=n;z++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     for (int i = n; i >=1; i--) {
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int z=1;z<=n;z++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

// }

// public static void main(String[] args) {
//     int n=50;
//     for(int i=0;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//         }
//         for(int j=1;j<=n;j++){
//             if(j==1||j==n||i==0||i==n){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }

// }

// public static void main(String[] args) {

// int n=14;
// for(int i=1;i<=n;i++){

// //space
// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }

// for(int z=1;z<=2*i-1;z++){
//     System.out.print("*");
// }

// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }

// System.out.println();

// }

// System.out.println();
// System.out.println("     Welcome Mehar Zain");
// System.out.println();

// for(int i=n;i>=1;i--){

// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }

// for(int z=1;z<=2*i-1;z++){
//     System.out.print("*");
// }

// for(int j=1;j<=n-i;j++){
// System.out.print(" ");
// }

// System.out.println();

// }

// }
// }

// public class Basic{
//     public static int high_check(int a[]){
//         int max=Integer.MIN_VALUE;
//         for (int i = 0; i <a.length; i++) {
//             if(a[i] > max){
//                 max=a[i];
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int array[] = {12,10,1,3,2,5,6,4,8,6,9,0,22,1,4,5,6};   
//         System.out.print(high_check(array));
//         }
//     }

// ---------------------------------------------------------------------------------------------
//                                       Q#1

// class Movie {
//     private String movie_name[] = { "Ben Ten", "Zombie Nights", "3 Idiots", "Supra Man" };
//     private float ticket_price[] = { 1000, 2000, 3000, 5000 };
//     private int avail_seats[] = { 100, 500, 800, 50 };

//     public void get_display_detail() {
//         for (int i = 0; i < movie_name.length; i++) {
//             System.out.println();
//             System.out.println("--------------------------------------------------");
//             System.out.println("Movie Number: " + i);
//             System.out.println("Movie Name: " + movie_name[i]);
//             System.out.println("Movie Ticket Price: Rs." + ticket_price[i]);
//             System.out.println("Available Seats: " + avail_seats[i]);
//             System.out.println();
//             System.out.println("--------------------------------------------------");
//         }
//     }

//     public void set_book_ticket() {
//         System.out.println("** Book Your Movie Ticket **");
//         System.out.println("Choose an Movie");
//         get_display_detail();
//         System.out.println("** ** ** ** **");
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Movie Number to Book: ");
//         int booked_movie = sc.nextInt();
//         System.out.println("=============================================");
//         System.out.println(
//                 movie_name[booked_movie] + " Movie Booked SuccessFully! with Price " + ticket_price[booked_movie]);
//         System.out.println();
//     }
// }

// public class Basic {
//     public static void menu() {
//         System.out.println("**************");
//         System.out.println(" 1 ==> View Movie Details");
//         System.out.println(" 2 ==> Book a Ticket");
//         System.out.println(" 3 ==> Exit");
//         System.out.println("**************");
//     }

//     public static void main(String[] args) {
//         int while_break = 0;
//         Scanner sc = new Scanner(System.in);
//         Movie mv = new Movie();
//         do {
//             menu();
//             int choice_menu = sc.nextInt();
//             while_break = choice_menu;
//             switch (choice_menu) {
//                 case 1:
//                     mv.get_display_detail();
//                     break;
//                 case 2:
//                     mv.set_book_ticket();
//                     break;
//                 default:
//                     break;

//             }

//         } while (while_break != 3);
//     }
// }

// ---------------------------------------------------------------------------------------------
//                                       Q#2

class Book {
    int count = 0;
    String Book_name[] = new String[10];
    String Book_auther[] = new String[10];
    int Book_id[] = new int[10];

    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.println("----------------------------------------");
            System.out.println(Book_id[i]);
            System.out.println(Book_name[i]);
            System.out.println(Book_auther[i]);
            System.out.println("----------------------------------------");
        }
    }

    public void menu() {
        System.out.println();
        System.out.println("Choose an Option: ");
        System.out.println(" 1 ==>  Add a new book (Enter book title, author, and book ID)");
        System.out.println(" 2 ==>  Display all books");
        System.out.println(" 3 ==>  Search for a book by ID");
        System.out.println(" 4 ==>  Exit");
        System.out.println();
    }

    public void add_book() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        Book_name[count] = sc.nextLine();
        System.out.print("Enter Book Auther: ");
        Book_auther[count] = sc.nextLine();
        System.out.print("Enter Book ID: ");
        Book_id[count] = sc.nextInt();
        count++;
    }

    public int search(int id) {
        for (int i = 0; i < Book_id.length; i++) {
            if (Book_id[i] == id) {
                System.out.println("Book Found! ");
                System.out.println("-----------------------------------------");
                System.out.println("Book ID: " + Book_id[i]);
                System.out.println("Book Name: " + Book_name[i]);
                System.out.println("Book Auther: " + Book_auther[i]);
                System.out.println("-----------------------------------------");
                return id;
            }

        }
        System.out.println("Not Found!");
        return -1;
    }
}

public class Basic {
    public static void main(String[] args) {
        int While_Breaker = 0, choice;
        Book lb = new Book();
        Scanner sc = new Scanner(System.in);
        do {
            lb.menu();
            choice = sc.nextInt();
            While_Breaker = choice;
            switch (choice) {
                case 1: {
                    lb.add_book();
                    break;

                }
                case 2: {
                    lb.display();
                    break;

                }
                case 3: {
                    System.out.print("Enter Book ID to Search: ");
                    int id = sc.nextInt();
                    id = lb.search(id);
                    break;

                }
                case 4: {
                    break;
                }
                default: {
                    break;
                }
            }

        } while (While_Breaker != 4);
    }
}