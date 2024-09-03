// If a bigger problem can be break down into two smaller problems then we sholud use recursion
// fibo(n) = fibo(n-1) + fibo(n-2)
// this is called recurrence relation. When you write recursion into a formula, it is known as recurrence relation
// Types of recurrence relation :
// 1. Linear recurrence relation : fibonacci numbers
// 2. Divide and conquer recurrence relation : Binary Search  (Here search space divide via a factor)
public class a4_fibonaccci_numbers {
    public static void main(String[] args) {
//        System.out.println(fibo(7));  // output: 13

        System.out.println(fiboFormula(7));

//        for(int i =1 ; i<=11; i++){
//            System.out.println(fiboFormula(i));
//        }

        System.out.println(fiboFormula(50));

    }

    static int fiboFormula(int n){
//        return (int) ((Math.pow(((1+Math.sqrt(5)) / 2),n) - Math.pow(((1-Math.sqrt(5)) / 2),n)) / Math.sqrt(5));
        // just for demo, use long instead
        return (int) (Math.pow(((1+Math.sqrt(5)) / 2),n) / Math.sqrt(5));  // same- we can remove less dominating term
    }
    static int  fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
// for n = 50 and bigger number it will not work, program get stuck
// Recursion and dynamic programming is very popular in interview problems
// Time complexity of fibonacci numbers is (golden ratio raise to power n)