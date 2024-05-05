import java.util.Scanner;

public class String_example {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        System.out.println("enter your name");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String personalized = mygreet(name);
        System.out.println(personalized);
    }

    static String mygreet(String name) {
        String message = "hello "+name;
        return message;
        }

    static String greet(){
        String greeting = "hey! how are you?";
        return greeting;

    }
}
