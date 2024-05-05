import java.util.Scanner;

// The Task which you want to do again and again  = Loops
public class Loops {
    public static void main(String[] args) {
         /*
    //Q: print number 1 to 5
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);
     */

    /*
    // syntax of for loop
    for(initialization; condition; increment/decrement){
        //body
        }
     */

        //Q: print numbers 1 to 5
//        for(int num =0; num<=5; num+=1){
//            System.out.println(num);
//        }

        //Q: print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num = 1; num <=n; num++) {
//            System.out.print(num +" ");
//        }

        // While Loop
//        int num =1;
//        while(num<=5){
//            System.out.println(num);
//            num +=1;
//        }

        //Why these two loops exists

        // for loop -
        // ans : when you know how many times the loop is going to be run
        // ex: print the fist n number

        // while loop
        // ans: when you don't know how many times the loop is going to be run
        // ex: keep taking input from the user till the user doesn't press x

        // do while loop
        /*
        syntax:
        do{
          //body
         }while(condition);
         */

//        int num =1;
//        do{
//            System.out.println(num);
//            num++;
//        }while(num<=5);

        // The difference between while and do while is
        // do while loop = runs at least once then condition check
        // while loop = runs with condition checking

//        int n=1;
//        do{
//            System.out.println("hello world");
//        }while(n != 1);

        // Above loop runs first then condition check
    }
}
