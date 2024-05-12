//**
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isprime(n));
//        System.out.println(isArmstrong(n));

        // if I want to print all three digits armstrong numbers then
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }


    static boolean isArmstrong(int n){
        int original = n;
        int sum =0;

        while(n>0){
            int rem = n %10;
            n /= 10;
            sum = sum + rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }

    static boolean isprime(int n) {   // boolean return type will give true or false for the output
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c*c >n;
        // or we can write
        // if(c*c>n){
        // return true;
        // }
        // return false;
    }
}


