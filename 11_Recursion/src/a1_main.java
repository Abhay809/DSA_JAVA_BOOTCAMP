public class a1_main {
    public static void main(String[] args) {
        // write a function that will print hello world 5 times
        message();     // Here a Function is calling another function
    }

    static void message(){
        System.out.println("Hello World");
        message1();   // after message execute it will call message1
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
}