import java.util.Scanner;

public class practise {
    public static void main(String[] args) {

        // Case Check
        // Check the given character is in lowercase or uppercase
        // ex: = 'a' is lowercase, 'A' is uppercase

        //Take Input from the user
        Scanner in = new Scanner(System.in);

        // User Input Character
        char ch = in.next().charAt(0);

        // If the character is in between "a" to "z"
        //then print Lowercase, else uppercase
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }





    }
}
