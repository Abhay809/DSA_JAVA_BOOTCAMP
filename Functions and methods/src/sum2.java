// function call have some value that is going to be return is called return type
// eg: void - is a return type which is used when we don't want to return anything
import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
//        int ans = sum2();   // function call
//        System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);


    }

    //static means doesn't depend on the object
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter first number");
//        int num1 = in.nextInt();
//        System.out.println("enter second number");
//        int num2 = in.nextInt();
//        int sum = num1+num2;
//        System.out.println("the sum is :" +sum);

//    static int sum2(){    // here int is the retrun type and you have to return it
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter first number");
//        int num1 = in.nextInt();
//        System.out.println("enter second number");
//        int num2 = in.nextInt();
//        int sum = num1+num2;
//        return sum;
//        //System.out.println("hey! my name is harry brook");
//        // this line never executed after returning a function

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
}
