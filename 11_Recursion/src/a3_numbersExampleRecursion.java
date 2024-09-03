// Recursion :-  A function that calls itself.
// Base Condition in recursion :- Condition where recursion stop making new calls
public class a3_numbersExampleRecursion {
    public static void main(String[] args) {
        // print numbers form 1 to 5
        print(1);
    }

    static void print(int n){

        if(n==5){                        // Base condition
            System.out.println(5);
            return;
        }
        System.out.println(n);           // Body

        // recursion call
        // If you are calling a function again and again, you can treat it as a separate call in the stack
        // This is the last statement in function call, it is known as tail recursion
        // this is the last function call
        print(n+1);                      // recursive call / recursion
    }
}
