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
// class Bank {
//     private int id;    
//     private String Name;
//     private int Age;
//     private int Amount;
//     public void set(int id,String name, int age, int Amount){
//             Name=name;
//             this.Age=age;
//             this.Amount=Amount;
//             this.id=id;

//         }
//         public void display() {
//             System.out.println("ID: "+id);
//             System.out.println();
//             System.out.println("Name: "+Name);
//             System.out.println();
//             System.out.println("Age: "+Age);
//             System.out.println();
//             System.out.println("Amount: "+Amount);
//             System.out.println();
//         }
// }
// public class Main {
//     public static void main(String[] args) {
//         int id=1;
//         String Name="Zain";
//         int Age = 19;
//         int Amount = 1000;
//         Bank b = new Bank();
//         b.set(id, Name, Age, Amount);
//         b.display();
//     }
// }

// class StudentRecord{

//     int StudentId;
//     String StudentName;
//     int Mark_1;
//     int Mark_2;
//     int Mark_3;
//     int Avg;
//     public void Input(){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Student Name: ");
//         StudentName = sc.nextLine();
//         System.out.print("Enter Student ID: ");
//         StudentId = sc.nextInt();
//         System.out.print("Enter Student Marks 1: ");
//         Mark_1= sc.nextInt();
//         System.out.print("Enter Student Marks 2: ");
//         Mark_2= sc.nextInt();
//         System.out.print("Enter Student Marks 3: ");
//         Mark_3= sc.nextInt();
//     }
//     public float avg(){
//         float Average = (float)(Mark_1+Mark_2+Mark_3)/3;
//         return Average;
//     }
//     public void display(){
//         System.out.println("Student ID: "+StudentId);
//         System.out.println("Student Name: "+StudentName);
//         System.out.println("Student Marks 1: "+Mark_1);
//         System.out.println("Student Marks 2: "+Mark_2);
//         System.out.println("Student Marks 3: "+Mark_3);
//         System.out.println("Student Average: "+avg());
//     }

// }
// public class Main{
// public static void main(String[] args) {
// for (int i = 0; i <=3; i++) {
//     StudentRecord s[i] = new StudentRecord();
//     s[i].Input();
//     System.out.println("-----------------------------------");
//     s[i].display();
//     System.out.println("-----------------------------------");
//     }

// StudentRecord s1 = new StudentRecord();

// StudentRecord s2 = new StudentRecord();
// StudentRecord s3 = new StudentRecord();
//     s1.Input();
//     s1.display();
//     System.out.println("--------------------------");
//     s2.Input();
//     s2.display();
//     System.out.println("--------------------------");
//     s3.Input();
//     s3.display();
//     System.out.println("--------------------------");

//     }
// }

// class Student{
//     int id;
//     String name;
//     int age;
//     public void display(int id, String name , int age) {
//         System.out.println(id);
//         System.out.println(name);
//         System.out.println(age);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         int id=1;
//         String name="Zain";
//         int age=19;
//         Student s = new Student();
//         s.display(id, name, age);
//     }
// }
import java.util.*;
// class Employee{
//     private int id;
//     private String name;
//     private int salary;

//     public void set_data(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Employee ID: ");
//         id = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Enter Employee Name: ");
//         name = sc.nextLine();
//         System.out.print("Enter Employee Salary: ");
//         salary = sc.nextInt();
//     }
//     public void get_data(){
//         System.out.println("***************************************");
//         System.out.println();
//         System.out.println("Employee Id: "+id);
//         System.out.println("Employee Name: "+name);
//         System.out.println("Employee Salary: "+salary);
//         System.out.println();
//         System.out.println("***************************************");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Employee obj = new Employee();
//         obj.set_data();
//         obj.get_data();

//     }
// }
//default constructor , null constructor , parmetrized constructor

// import java.util.*;
// class Student{
//     private String name;
//     private int roll_no;
//     private double score1;
//     private double score2;
//     private double total;

//     public void total(){
//         total = score1 + score2;
//     }
//     public void input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Student One Name:");
//         name = sc.nextLine();
//         System.out.print("Enter Student One Roll No:");
//         roll_no = sc.nextInt();
//         System.out.print("Enter Student One Score-1:");
//         score1 = sc.nextInt();
//         System.out.print("Enter Student One Score-2:");
//         score2 = sc.nextInt();
//     }
//     public void display(){

//         System.out.println("-------------------------------------------------");
//         System.out.println("Student Two Name: "+name);
//         System.out.println("Student Two Roll No: "+roll_no);
//         System.out.println("Student Two Total Marks: "+total);
//         System.out.println("-------------------------------------------------");
//     }
//     public void max(Student s1){
//         if (this.total > s1.total){
//             System.out.println(this.name+" have Maximum Marks");
//             System.out.println(s1.name+" have Minimum Marks");

//         } else{
//             System.out.println(s1.name+"have Maximum Marks");
//             System.out.println(this.name+"have Minimum Marks");
//         }
//     }
// }
// public class Main {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.input();
//         s1.total();
//         s1.display();
//         Student s2 = new Student();
//         s2.input();
//         s2.total();
//         s2.display();
//         s1.max(s2);

//     }
// }
import java.util.*;
class Patient {

    private String name;
    private int age;
    private String disease;

    public void setDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        name = sc.nextLine();
        System.out.print("Enter Patient Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient Disease: ");
        disease = sc.nextLine();

    }

    public void showDetail() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient AGE: " + age);
        System.out.println("Patient Disease: " + disease);
    }

    public void menu() {
        System.out.println();
        System.out.println("1 ==> Add Patient record");
        System.out.println("2 ==> Display All Patient record");
        System.out.println("3 ==> Patient with Higest Age");
        System.out.println("4 ==> Exit");
        System.out.println();
    }

    public void high_age(Patient[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("No patient records available.");
            return;
        }
        int max = arr[0].age;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != null && arr[i].age > max) {
                max = arr[i].age;
            }
        }
        System.out.println("Highest Age of Patient is: " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Patient p = new Patient();
        Scanner sc = new Scanner(System.in);
        Patient[] arr = new Patient[5];

        int choice;
        do {
            p.menu();
            choice = sc.nextInt();
            if (choice == 1) {
                arr[i] = new Patient();
                arr[i].setDetail();
                i++;
            } else if (choice == 2) {
                for (int j = 0; j < i; j++) {
                    arr[j].showDetail();
                    System.out.println("------------------------------------");
                }
            } else if (choice == 3) {
                p.high_age(arr);
            } else if (choice == 4) {
                System.out.println("Exit!");
            } else {
                System.out.println("Invalid!");
            }

        } while (choice != 3);
    }
}