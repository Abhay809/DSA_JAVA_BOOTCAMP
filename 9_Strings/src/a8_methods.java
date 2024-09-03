import java.util.Arrays;

public class a8_methods {
    public static void main(String[] args) {
        String name = "Abhay Mittal";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);  // lowercase is not changing the original object
        System.out.println(name.indexOf('a'));

        System.out.println("    Abhay    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
