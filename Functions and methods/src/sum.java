/*
return_type function_ name(argument){
//body;
return statement;  // this statement is same as the return type
}
 */

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("enter first number");
        num1 = in.nextInt();
        System.out.println("enter second number");
        num2 = in.nextInt();
        sum = num1+num2;
        System.out.println(sum);
    }
}
