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
// class Patient {

//     private String name;
//     private int age;
//     private String disease;

//     public void setDetail() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Patient Name: ");
//         name = sc.nextLine();
//         System.out.print("Enter Patient Age: ");
//         age = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Enter Patient Disease: ");
//         disease = sc.nextLine();

//     }

//     public void showDetail() {
//         System.out.println("Patient Name: " + name);
//         System.out.println("Patient AGE: " + age);
//         System.out.println("Patient Disease: " + disease);
//     }

//     public void menu() {
//         System.out.println();
//         System.out.println("1 ==> Add Patient record");
//         System.out.println("2 ==> Display All Patient record");
//         System.out.println("3 ==> Patient with Higest Age");
//         System.out.println("4 ==> Exit");
//         System.out.println();
//     }

//     public void high_age(Patient[] arr) {
//         if (arr == null || arr.length == 0) {
//             System.out.println("No patient records available.");
//             return;
//         }
//         int max = arr[0].age;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] != null && arr[i].age > max) {
//                 max = arr[i].age;
//             }
//         }
//         System.out.println("Highest Age of Patient is: " + max);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int i = 0;
//         Patient p = new Patient();
//         Scanner sc = new Scanner(System.in);
//         Patient[] arr = new Patient[5];

//         int choice;
//         do {
//             p.menu();
//             choice = sc.nextInt();
//             if (choice == 1) {
//                 arr[i] = new Patient();
//                 arr[i].setDetail();
//                 i++;
//             } else if (choice == 2) {
//                 for (int j = 0; j < i; j++) {
//                     arr[j].showDetail();
//                     System.out.println("------------------------------------");
//                 }
//             } else if (choice == 3) {
//                 p.high_age(arr);
//             } else if (choice == 4) {
//                 System.out.println("Exit!");
//             } else {
//                 System.out.println("Invalid!");
//             }

//         } while (choice != 3);
//     }
// }

// class Employee{
//     private String name;
//     private int salary;
//     private int age;

//     Employee(){
//         name = "Ali";
//         age=19;
//         salary=100000;

//     }
//     public  void display_info(){
//         System.out.println("Employee Name: "+name);
//         System.out.println("Employee Salary: "+salary);
//         System.out.println("Employee age: "+age);
//     }

//     public  void cal_bonus(){
//         int b_salary = (int)(salary+(salary*0.1));
//         System.out.println("Salary with 10% Bonus: "+b_salary);
//     }
// }

// public class Main{
//     public static void main(String[] args) {

//         Employee e = new Employee();
//         e.display_info();
//         e.cal_bonus();
//     }
// }
// class arrayOperation {

//     public static int[] min_max(int array[]) {
//         int min_max [] = new int[2];
//         int min = array[0];
//         int max = array[0];

//         for (int i = 0; i < array.length; i++) {
//             if (array[i] < min) {
//                 min = array[i];
//             }
//             if (array[i] > max) {
//                 max = array[i];
//             }
//         }
//         min_max[0] = min;
//         min_max[1] = max;

//         return min_max;
//     }

//     public static void odd(int array[]) {
//         System.out.print("Odd Values Are: ");
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] % 2 != 0) {
//                 System.out.print(array[i] + " , " + " ");
//             }
//         }
//     }

//     public static void even(int array[]) {
//         System.out.print("Even Values Are: ");
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] % 2 == 0) {
//                 System.out.print(array[i] + " , " + " ");
//             }
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int b[] = new int[2];
//         int a[] = { 1, 2, 6, 7, 5, 8, 9, 10, 4, 7, 8, 3, 5, 2, 0, 6, 1, 4, 64, 6 };
//         b = arrayOperation.min_max(a);
//         System.out.println();
//         System.out.println("Minimum: "+b[0]);
//         System.out.println("Maximum: "+b[1]);
//         System.out.println();
//         arrayOperation.even(a);
//         System.out.println();
//         arrayOperation.odd(a);
//         System.out.println();
//     }
// }
// class Clothes {
//     private String Type_Shirt;
//     private String Type_Size;
//     private String Tyoe_Color;

//     public String get_size() {
//         int return_value;
//         System.out.print("Select The Size of Shirts\n1 ==> small\n2 ==> medium\3 ==> large");
//         int size_choice = sc.nextInt();
//         if (size_choice == 1) {
//             return_value = "Small";
//         } else if (size_choice == 2) {
//             return_value = "Medium";

//         } else if (size_choice == 3) {

//             return_value = "Large";
//         }
//         return return_value;

//     }

//     public void get_color() {
//         int return_value;
//         System.out.println("Select Color\n1 ==> Red\n2 ==> Green\n3 ==> Blue");
//         int color_choice = sc.nextInt();
//         if (color_choice == 1) {
//             return_value = "Red";
//         } else if (color_choice == 2) {
//             return_value = "Green";

//         } else if (color_choice == 3) {

//             return_value = "Blue";
//         }
//         return return_value;

//     }

//     public void get_type(){
//         int return_value;
//         System.out.print("Select Shirt Type\n1 ==> T-Shirt\n2 ==> Shirt ");
//         int type_choice = sc.nextInt();
//         if(type_choice ==1){
//             return_value = "Red";
//         }
//         else if(type_choice == 2){
//             return_value = "Green";

//         }
//         else if(type_choice == 3){

//             return_value = "Blue";
//         }
//         return return_value;

//     }

//     public void add_cloth() {
//         Scanner sc = new Scanner(System.in);
//         if (cloth_count <= 10) {
//             System.out.println("Welcome To The Clother Shop");

//         } else {
//             System.out.println("You have Reaced The maximum Limited of adding Clothes!");
//         }

//     }

//     public void menu() {
//         System.out.println("1 ==> Add CLothes");
//         System.out.println("2 ==> View Only Green Clothes");
//         System.out.println("3 ==> Exit");
//         System.out.print("Enter Your Choice: ");
//     }

//     class Main {
//         public static void main(String[] args) {
//             int count = 0;
//             String size, color, type;
//             Scanner sc = new Scanner(System.in);
//             Clothes c = new Clothes();
//             while (count <= 10) {
//                 c[count].menu();
//                 int choice = sc.nextInt();
//                 switch (choice) {
//                     case 1: {
//                         c[count].get_type();
//                         c[count].get_color();
//                         c[count].get_size();
//                         break;
//                     }
//                     case 2: {

//                         break;
//                     }
//                     case 3: {
//                         System.out.println("Exiting....");
//                         break;
//                     }
//                 }

//             }

//         }
//     }

// }

// public class Main{
//     public static void main(String []a){
//         for(int i=0;i<=15;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("-");
//             }
//             System.out.println();
//         }

//     }
// }

// class Person {
//     protected String name;
//     protected int age;

//     Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }

// class Student extends Person {
//     int roll_no;
//     String section;

//     Student(String name, int age, int roll_no, String section) {
//         super(name, age);
//         this.roll_no = roll_no;
//         this.section = section;
//     }

//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Roll No: " + roll_no);
//         System.out.println("Section: " + section);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student("Zain", 19, 1, "A");
//         s.display();
//     }
// }

// class person{

//     protected String name;
//     protected int age;

//     person(String name, int age){     
//         System.out.println(this.name = name);
//         System.out.println(this.age = age);
//     }
// }
// class student extends person{
//     student(String name, int age){
//         super(name,age);
//     }
// }

// public class Main {
// public static void main(String[] args) {
//     student s = new student("Zain", 19);
// }

// }

// class Test {
//     protected String name;
//     public Test(String name){
//         this.name = name;
//     }
// }

// class Student extends Test {
//     Student(String name){
//         super(name);
//         System.out.println("Student Name: "+name);
//     }
// }

// public class Main {
//     public static void main(String[] a) {

//         Student t = new Student("Zain");
//         }
// }

// class Person{
//     String name; 
//     int age;
//     Person(String name, int age){

//         this.name=name;
//         this.age=age;
//         System.out.println("Public constructor Called: "+name+" and Age: "+age);
//     }
// }
// class Employee extends Person{

//     Employee(String name , int age){
//         super(name , age);
//         this.age=age;
//         System.out.println("Employee Constructor Called!"+age);
//     }
//     public void work(){
//         System.out.println(age+" is Working");
//     }
// }

// public class Main{
//     public static void main(String[]a){
//         Employee e = new Employee("Ali",19);
//         e.work();
//     }
// }

// class Bank {
//     String bankName;
//     String branch;

//     Bank(String bankName, String branch) {
//         this.bankName = bankName;
//         this.branch = branch;
//     }

//     public void displayinfo() {
//         System.out.println("Bank Name: " + bankName);
//         System.out.println("Branch Name: " + branch);
//     }
// }

// class Account extends Bank {
//     int accountNumber = 10;
//     String accountHolder = "Ali";
//     double balance = 1000.0;

//     Account(String bankName, String branch) {
//         super(bankName, branch);
//         super.displayinfo();
//     }

//     public void displayinfo() {
//         // super.displayinfo();
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Account Balance: " + balance);
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         Account a = new Account("Bank Alfalah", "Islamabad");
//         a.displayinfo();
//     }
// }

// class Staff {
//     String name;
//     int staff_id;

//     public void displayDetails() {
//         System.out.println("Staff Name: " + name);
//         System.out.println("Staff ID: " + staff_id);
//     }
// }

// class TeachingStaff extends Staff {
//     String department;

//     public void displayTeachingDetails() {
//         System.out.println("Department: " + department);
//     }
// }

// class Professor extends TeachingStaff {
//     String specialization;

//     public void displayProfessoinfo() {
//         System.out.println("Specialization: " + specialization);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Professor p = new Professor();
//         p.name = "Ali";
//         p.staff_id = 1;
//         p.department = "Computer Science";
//         p.specialization = "Data Science";

//         p.displayDetails();
//         p.displayTeachingDetails();
//         p.displayProfessoinfo();
//         System.out.println("-------------------------------------------------");

//     }
// }

// class Animal{
//     void sound(){
//         System.out.println("Animal Sounds");
//     }
// }
// class Dog extends Animal{
//     @Override void sound(){
//         System.out.println("Dog Sounds");

//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Animal a = new Animal();
//         Dog d = new Dog();
//         a.sound();
//         d.sound();
//     }
// }

// class Course {
//     protected String coursename;
//     protected int duration;
//     protected int fee;

//     Course(String coursename, int duration, int fee) {
//         this.coursename = coursename;
//         this.duration = duration;
//         this.fee = fee;
//     }

//     void showDetails() {
//         System.out.println("Course Name: " + coursename);
//         System.out.println("Duration Months: " + duration);
//         System.out.println("Fee: " + fee);
//     }

// }

// class programmingCourse extends Course {
//     private String languageUsed;

//     programmingCourse(String name, int duration, int fee, String languageUsed) {
//         super(name, duration, fee);
//         this.languageUsed = languageUsed;
//     }

//     void showDetails() {
//         super.showDetails();
//         System.out.println("Programming Course: " + languageUsed);
//     }

// }

// class designCourse extends Course {
//     String softwareUsed;

//     designCourse(String name, int duration, int fee, String softwareUsed) {
//         super(name, duration, fee);
//         this.softwareUsed = softwareUsed;
//     }

//     void showDetails() {
//         super.showDetails();
//         System.out.println("Designe Course: " + softwareUsed);
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         Course c = new programmingCourse("Python", 4, 20000, "Java");
//         Course d = new designCourse("Graphics Design", 3, 56000, "Figma Express");
//         c.showDetails();
//         System.out.println("------------------------------------------------------");
//         d.showDetails();
//     }

// }

// abstract class Employee {
//     protected int id;
//     protected String name;

//     Employee(String name, int id) {
//         this.id = id;
//         this.name = name;
//     }

//     void showDetail() {
//         System.out.println("Name: " + name);
//         System.out.println("ID: " + id);
//     }
// }

// class fullTimeEmployee extends Employee {
//     private int salary;

//     fullTimeEmployee(String name, int id, int Salary) {
//         super(name, id);
//         this.salary = Salary;
//     }

//     void calculateSalary() {
//         System.out.println("Salary: " + salary);
//     }

// }

// class partTimeEmployee extends Employee {
//     private int salary;

//     partTimeEmployee(String name, int id, int Salary) {
//         super(name, id);
//         this.salary = Salary;
//     }

//     void calculateSalary() {
//         System.out.println("Salary: " + salary);
//     }
// }

// class contractEmployee extends Employee {
//     private int salary;

//     contractEmployee(String name, int id, int Salary) {
//         super(name, id);
//         this.salary = Salary;
//     }

//     void calculateSalary() {
//         System.out.println("Salary: " + salary);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Employee e1 = new fullTimeEmployee("Ali", 1, 10000);
//         Employee e2 = new partTimeEmployee("Zain", 2, 5000);
//         Employee e3 = new contractEmployee("Sara", 3, 20000);
//         e1.showDetail();
//         e1.calculateSalary();
//         System.out.println("-------------------------------------------------");   
//         e2.showDetail();
//         e2.calculateSalary();
//         System.out.println("-------------------------------------------------");
//         e3.showDetail();
//         e3.calculateSalary();
//         System.out.println("-------------------------------------------------");
//     }

// }

// abstract class Payment {
//     abstract double pay(double pay);
// }

// abstract class cardPayment extends Payment {
//     String Holder;
//     long cardHolder;

//     cardPayment(int Holder, long c_N){
//         this.Holder = Holder;
//     }
//     void validateCard(long c_N){
//         if(c_N.length == 16)
//             cardHolder = c_N;
//         else
//         System.out.println("Invalid card Number!");
//     }
// }

// class creditCardPayment extends cardPayment{

// }
// class debitCardPayment extends cardPayment{

// }
// class walletPayment extends Payment{
//     int walletID;
//     walletPayment(int w){
//         walletID =w;
//     }
//     void pay(double pay){
//         System.out.println("Payment Wallet Called!");
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         Payment p1 = new cardPayment("Ali" , 123450);
//     }
// }

interface Character{
    void attack();
    void defend();
}

class player1 implements Character{
    public void attack(){
        System.out.println("Player1 Attack!");
    }
    public void defend(){
        System.out.println("Player1 Depend!");
    }
}

class player2 implements Character{
    public void attack(){
        System.out.println("Player2 Attack!");
    }
    public void defend(){
        System.out.println("Player2 Depend!");
    }
}


public class Main {
    public static void main(String[] args) {
        Character c1 = new player1();
        Character c2 = new player2();
        c1.attack();
        c1.defend();
        c2.attack();
        c2.defend();
    }
}