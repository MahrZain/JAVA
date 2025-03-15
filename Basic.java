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



