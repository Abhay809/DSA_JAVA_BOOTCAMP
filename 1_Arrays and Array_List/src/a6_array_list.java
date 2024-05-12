import java.util.ArrayList;
import java.util.Scanner;

// In array list not every single element can be primitive because It doesn't allows it.
// Array List = when you don't know how much size you want
// Amortised time complexity it has 0(1)
// [1,2,3] it will double the size [1,2,3,4, , ]
public class a6_array_list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        // <Integer> is a rapper class, you cannot pass primitives here
        // not matter initial capacity

//        list.add(10);
//        list.add(90);
//        list.add(456);
//        list.add(4545);
//        list.add(10);
//        list.add(90);
//        list.add(456);
//        list.add(4545);
//        list.add(10);
//        list.add(90);
//        list.add(456);
//        list.add(4545);
//        list.add(10);
//        list.add(90);
//        list.add(456);
//        list.add(4545);
//        System.out.println(list.contains(90));  // give true
//        System.out.println(list.contains(384545)); // give false
//        System.out.println(list);
//        list.set(0 ,99);  // change 0th index with the 99 value
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        // Input
        for(int i=0; i<5;i++){
            list.add(in.nextInt());   // taking input in the list
        }
        for(int i=0; i<5; i++){
            System.out.println(list.get(i)); // pass index here,list[index]syntax will not work
        }
        System.out.println(list);
    }

}
