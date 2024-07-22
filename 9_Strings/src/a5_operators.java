import java.util.ArrayList;

public class a5_operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  // output- 195
        System.out.println("a" + "b");  // output- ab
//        System.out.println("a" - "b");  // error: operator '-' can not be applied on string
        System.out.println('a'+3);      // output- 100
        System.out.println((char)('a'+3)); //output- d

        System.out.println("a"+1);  // concatenation of string and integer
        // this will same as after a few steps: "a" + "1"
        // when a integer is concatenated with a string it will be converted into its rapper class
        // Integer will be converted to Integer that will call toString()

        System.out.println("Abhay" + new ArrayList<>());
        System.out.println("Abhay" + new Integer(56)); // new Integer(56) this is an object and it is converting into string by toString() method

//        System.out.println(new Integer(56) + new ArrayList<>()); // error: the operator + cannot be applied to integer and arraylist
        // the operators + in java is only defined for Primitives and when any one of these value is String
        System.out.println(new Integer(56) + "" + new ArrayList<>()); // this will work because there is one string

        System.out.println("a" + 'b');

    }
}
