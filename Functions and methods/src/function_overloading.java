import java.lang.reflect.Array;
import java.util.Arrays;

// Also known as method overloading
// If two or more function can have same name but different arguments
public class function_overloading {
    public static void main(String[] args) {
//        fun(56,67);
//        fun("abhay Mittal",89);
       int ans =  sum(5,6);
        System.out.println(ans);

        int ans2 = sum(4,5,6);
        System.out.println(ans2);

        demo(1,3,4,5,6,7);
        demo("harry brrok");
//        demo();  // it will give an error because it don't know which function to run


    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum(int x,int y){
        return x+y;
    }
    static int sum(int x,int y, int z){
        return x+y+z;
    }
    static void fun(int a , int b){
        System.out.println(a);
    }
    static void fun(String c,int d){
        System.out.println(c);

    }
}



