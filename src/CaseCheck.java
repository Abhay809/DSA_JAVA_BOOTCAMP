import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);
//        System.out.println(ch);

//        String word = "hello";
//        System.out.println(word.charAt(0));

        // Q: to print a character in uppercase or lowercase
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }



        //System.out.println(in.next());
        //print the word as it is
        // .trim remove all the extra spaces that is starting  and the ending of these words
        //         hello will print after .trim()
        //hello
        // in.next().trim() this is the string
        //charAt(0) this means give me the character in this index of this string
    }
}
