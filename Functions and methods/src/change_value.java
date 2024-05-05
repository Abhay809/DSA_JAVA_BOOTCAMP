import java.util.Arrays;

public class change_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;    // If you make a change to the object via reference variable, same object will be changed
    }
}
