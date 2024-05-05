public class Swap{

//    // this will not swap the values
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }
//
//        String name = "Harry brook";
//        changename(name);
//        System.out.println(name);
//    }
//
//    static void changename(String naaam){
//        naaam = "jos buttler";     // here you are not changing, you are creating a new object
         // here we are creating a new object, not modifying it
//
//    }
         // you cannot excess naam outside the function
    static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    // this change only be valid in this function scope only
//    }

    // this is not going to be swap anything
    // because no pass by reference in java, only pass by value
}
