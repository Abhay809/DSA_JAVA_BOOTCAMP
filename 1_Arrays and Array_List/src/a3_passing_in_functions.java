import java.util.Arrays;
// Strings are immutable in java and
// Arrays are mutable in java
// mutable means = you can change the object

public class a3_passing_in_functions {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
