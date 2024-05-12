import java.util.ArrayList;
import java.util.Scanner;

public class a7_multiple_array_list {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialisation
        // if you do not initialize it, it will give an error
        // because by default the every single index value is null
        for(int i =0; i<3; i++){
            list.add(new ArrayList<>());
        }  // if I comment this for loop it will give an error because list.get(i) means get the list at index number 0 and if I comment this

        //add elements
        for(int i =0 ;i<3; i++){
            for(int j= 0; j<3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
