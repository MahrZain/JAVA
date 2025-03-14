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





public class Basic {
    public static void bin(int n){
        int total=0;
        int power=0;
        // int LD=0;
        while(n!=0){int LD = n%10;
        n =n/10;
        total = total + (LD * (int)Math.pow(2, power));
        power++;}
        System.out.println(total);
    }
public static void main(String[] args) {
    bin(9);   
}

}