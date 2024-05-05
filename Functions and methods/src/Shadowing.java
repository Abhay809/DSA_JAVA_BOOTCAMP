// shadowing in java basically means a practise of using two variables with the same name within the scope that overlaps
public class Shadowing {
    static int x = 90;   // this will be shadow at line 9
    // you can not use object dependent things in object independent thing
    // x will be available for all the class
    // the variable with higher level scope
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x=40;  // the class variable at line 3 
        System.out.println(x);  //40
        fun();                  //90
    }

    static void fun(){
        System.out.println(x);
        // not giving the error
    }
}
//int x;    // declaring
//x = 40;   // Initializing