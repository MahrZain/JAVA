import java.util.*;
public class Basic {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int a = sc.nextInt();
        if(a > 18 && a < 900){
            System.out.println("Congratulation! Your Are Eligible!");
        }
        else if(a == 18 ){
            System.out.println("Congratulation! Your Are Eligible!");
        }
        else{
            System.out.println("Sorry! Your Are Not Eligible!");

        }
    }
}
