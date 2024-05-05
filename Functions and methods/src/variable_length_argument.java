import java.util.Arrays;

// when you create a method that takes a variable number of argument
// when we don't know how many inputs we are giving
public class variable_length_argument {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7);
        fun();  // showing empty array
        multiple(5,6,"abhay","Mittal","harry","brook");
    }
    static void multiple(int a,int b, String ...v){   // variable length argument always comes at the end

    }
    static void fun(int ...v){  // It will take array of integers
        System.out.println(Arrays.toString(v));
    }
}
