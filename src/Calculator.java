import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                //check which operator is given
                if(op == '+'){
                    ans = num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if(op == '/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                        ans = num1 % num2;
                }else if(op == 'X' || op == 'x'){
                    break;
                }else{
                    System.out.println("Invalid operation!");
                }
                System.out.println(ans);
            }
        }
    }
}
