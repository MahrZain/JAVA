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


import java.util.*;
public class Main{
    public static void main(String arg[]){
        float num1=(float) 10.5;
        float num2= (float) 2.0;
        float sum = num1+num2;
        float subtraction = num1- num2;
        float multiplication = num1* num2;
        float divion = num1/num2;
        if(num2 <= 0){
System.out.println("Impossible to Perform Operations");
        }
        else{

            System.out.println("Sum : "+sum);
            System.out.println("Subtraction: "+subtraction);
            System.out.println("Multiplication: "+multiplication);
            System.out.println("Divion: "+divion);
        }




    }
}