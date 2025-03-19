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


public class Basic{
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

public static void main(String[] args) {
    
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




}
}
