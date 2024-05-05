// scope = you can only excess the variable inside the function
public class scope {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        String name = "abhay";
        //System.out.println(num);
        // we can not excess nums here, Its outside the scope
        {
            // block scope
           //int a = 78;  you can not initialize it again
            a =78;     //but you can change the value
            System.out.println(a);
            name = "shubham";
            System.out.println(name);
            int c =99;
            // values initialize in this block will remain in this block only
        }
        System.out.println(a);   // outside the block also work
        System.out.println(name);
        // System.out.println(c); // can not use outside the block

        // scoping in for loop
        for(int i=0;i<4;i++){
            System.out.println(i);
//            int a =89;   because a is already defined in another scope
        }
//        System.out.println(i);  // outside the scope

    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
