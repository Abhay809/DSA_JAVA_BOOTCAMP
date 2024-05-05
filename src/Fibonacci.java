import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Fibonacci number = 0,1,1,2,3,5,8,13 . . . .
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
