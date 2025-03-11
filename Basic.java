public class Basic {
    public static boolean isPrime(int a){
        boolean b=true;
        for(int i=2;i<=a-1;i++){
            if(a%i==0){
                    b=false;
            }
        }
        return b;
    }
    public static void range(int b){
        for(int i=2;i<=b;i++){
            if(isPrime(i)){
                System.out.println("Prime: "+ i);
            }
        }

    }
public static void main(String[] args) {
    
int a=30;
range(a);



}
}

