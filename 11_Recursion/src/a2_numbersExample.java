public class a2_numbersExample {
    public static void main(String[] args) {
        // Write a function that takes in a number and prints it
        // Print first 5 numbers
        print1(1);
//        print1(2);
//        print1(3);
//        print1(4);
//        print1(5);   // we have to use recursion concept here, we can't Apply this method

    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}

// here what is happening
// Function calling another Function

