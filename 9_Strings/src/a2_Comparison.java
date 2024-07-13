// System.out.println(); // here out is a variable of type PrintStream, which is a class.
// PrintStream has a method called println
import java.sql.SQLOutput;

public class a2_Comparison {
    public static void main(String[] args) {
        String a = "Abhay";
        String b = "Abhay";
        String c =a;
        System.out.println(c == a);  // give true
        // ==
        System.out.println(a == b);

        String name1 = new String("Abhay");  // value is same but it is explicitly mention to the new object
        String name2 = new String("Abhay");
        System.out.println(name1 == name2);  // give false
        System.out.println(name1.equals(name2));  // give true  // because .equals is a method and focusing on the value

//        System.out.println(name1[0]);  // not possible, it is not array
        System.out.println(name1.charAt(0)); // give A
    }
}
