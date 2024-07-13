// Strings = Sequence of Characters or collection of characters
// String pool = a pool inside heap memory  use case:- no need to create a string again and again, to make program more optimized
// strings are immutable for security reasons, a single object can't change a string in database
public class a1_main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};  // stack memory and heap memory
//        int  a = 10;
        String name = "Abhay Mittal";
//        System.out.println(name);

        String a  = "Abhay";
        System.out.println(a);
        a = "Mittal";
        System.out.println(a);   // Creating a new object, not changing previous one


    }
}