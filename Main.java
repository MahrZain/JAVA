/*
======================================================
               ******* ===>> 8 Bit = 1Byte *******
 * 1 Byte ==> -128 to 127
 * int ==> 4 Byte
 * short ==> 16 Bit (2 Byte)
 * long ==> 64 Bit (8 Byte)
 * double ==> 
=======================================================
 */

// import java.util.Scanner;
// public class Main{
// public static void main (String [] arg){
// int a,b,c;
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Number 1 Value:");
// a = sc.nextInt();
// System.out.print("Enter Number 2 Value:");
// b = sc.nextInt();
// c = a+b ;
// System.out.println("Sum is: " + c);
// sc.close();
// }
// }

// import java.util.*;
// public class Main{
//     public static void main(String arg[]){
//         float num1=(float) 10.5;
//         float num2= (float) 2.0;
//         float sum = num1+num2;
//         float subtraction = num1- num2;
//         float multiplication = num1* num2;
//         float divion = num1/num2;
//         if(num2 <= 0){
// System.out.println("Impossible to Perform Operations");
//         }
//         else{

//             System.out.println("Sum : "+sum);
//             System.out.println("Subtraction: "+subtraction);
//             System.out.println("Multiplication: "+multiplication);
//             System.out.println("Divion: "+divion);
//         }

//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
// System.out.print("Enter Student ID: ");
// int id = sc.nextInt();
// System.out.print("Enter Student GPA: ");
// float gpa = sc.nextFloat();
// sc.nextLine();
// System.out.print("Enter Student Name: ");
// String name = sc.nextLine();
// System.out.print("Enrollement(true/false): ");
// boolean enr = sc.nextBoolean();
// System.out.print("Grade: ");
// char grade = sc.next().charAt(0);
// System.out.println("-------------------------------------------------------------");
// gpa+=0.5;
// System.out.println("GPA After 0.5 using += Operator: "+gpa);
// gpa-=0.2;
// System.out.println("GPA After 0.2 using -= Operator: "+gpa);
// id*=id;
// System.out.println("ID After Double using *= Operator: "+id);
// id/=2;
// System.out.println("ID After Divide using /= Operator: "+id);
// System.out.println("-------------------------------------------------------------");
// id++;
// System.out.println("Student ID After POST-increment Operator: "+id);
// --id;
// System.out.println("Student ID After POST-increment Operator: "+id);

// System.out.println("-------------------------------------------------------------");

// System.out.println("Input id: "+id +"\n" + "Input Name: "+ name +"\n"+ "Enrollment Status: "+ enr +"\n"+ "Grade: "+ grade +"\n"+"GPA: "+ gpa);

// sc.close();

//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Press 1 ==> For Transfer Amount");
//         System.out.println("Press 2 ==> For Paying Bill");
//         System.out.println("Press 3 ==> Default");
//         int choice = sc.nextInt();
//         if(choice == 1){
//             System.out.println("Press 1 ==> For Jazz to Jazz");
//             System.out.println("Press 2 ==> For Bank Transfer");
//             int subchoice = sc.nextInt();
//             if(subchoice == 1){
//                 System.out.println("Amount Transfered");
//             }
//             else if(subchoice == 2){
//                 System.out.println("Amount Transfered");
//             }
//         }
//         else if(choice == 2){
//             System.out.println("Press a ==> For IESCO Bill");
//             System.out.println("Press b ==> WASA");
//             char bank_choice = sc.next().charAt(0);
//             switch (bank_choice) {
//                 case 'a':
//                 System.out.println("Bill Payed");
//                 break;
//                 case 'b':
//                 System.out.println("Bill Payed");
//                 default:
//                     break;
//             }
//         }

//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         int choice,vote1=0,vote2=0,vote3=0;
//         do{
//             System.out.println("1 ==> Vote for 1st Candidate");
//             System.out.println("2 ==> Vote for 2st Candidate");
//             System.out.println("3 ==> Vote for 3st Candidate");
//             System.out.println("4 ==> Exit and Show Results");
//             System.out.print("Enter your Choice: ");
//             Scanner sc = new Scanner(System.in);
//             choice = sc.nextInt();
//             if(choice == 1){
//                 vote1++;
//             }
//             else if(choice == 2){
//                 vote2++;
//             }
//             else if(choice == 3){
//                 vote3++;
//             }
//         }while(choice != 4);
//         System.out.println("Exiting ...");
//         System.out.println("-----------------------------------------------------");
//         System.out.println("******************Results**************");
// System.out.println("Vote for 1st: "+ vote1);
// System.out.println("Vote for 2st: "+ vote2);
// System.out.println("Vote for 3st: "+ vote3);
//     }
// }

import java.util.*;

// public class Main {
//     public static int sq(int a) {
//         return (a * a);
//     }

//     public static void main(String[] args) {
//             Scanner c = new Scanner(System.in);
//             System.out.print("Enter a Number: ");
//             int result = c.nextInt();
//             result = sq(result);
//             System.out.println("Square is: "+result);

//     }
// }

// class Student{
//     String Name;
//     int age;
//     char grade;
// }
// public class Main{
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.Name="Zain";
//         s.age=18;
//         s.grade='A';
//         System.out.println(s.Name);
//         System.out.println(s.age);
//     }
// }

// class Student {
//     String name;
//     int age;
//     char grade;

//     public static void Student_Name(String sName) {
//         Student z = new Student();
//         z.name = sName;
//     }
//     public void Student_Age(int sAge) {
//         age = sAge;
//     }
//     public void Student_Grade(char sGrade) {
//         grade = sGrade;
//     }

//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Grade: " + grade);
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         Student.Student_Name("Zain");
//         s.Student_Age(19);
//         s.Student_Grade('A');
//         s.display();
//     }
class Bank {
    private int id;    
    private String Name;
    private int Age;
    private int Amount;
    public void set(int id,String name, int age, int Amount){
            Name=name;
            this.Age=age;
            this.Amount=Amount;
            this.id=id;

    }
    public void display() {
        System.out.println("ID: "+id);
        System.out.println();
        System.out.println("Name: "+Name);
        System.out.println();
        System.out.println("Age: "+Age);
        System.out.println();
        System.out.println("Amount: "+Amount);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        int id=1;
        String Name="Zain";
        int Age = 19;
        int Amount = 1000;
        Bank b = new Bank();
        b.set(id, Name, Age, Amount);
        b.display();
    }
}