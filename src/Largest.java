import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q: Find the largest of three numbers

        // Wrong approach
//        if(a>b>c){
//            System.out.println(a);
//        }else if (b>a>c){
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }

        // Correct approach
//        int max = a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }

        // Another approach
//        int max=0;
//        if(a>b){
//            max=a;
//        }else{
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);

        // another approach
//        int max = Math.max(c, Math.max(a,b));
//        System.out.println(max);

    }
}
