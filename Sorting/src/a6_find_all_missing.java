import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class a6_find_all_missing {
//    public static void main(String[] args) {
//        // Google Question
//        //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//        int[] arr = {4,3,2,7,8,2,3,1};
//        System.out.println(cyclic(arr));
//    }
//
//    static boolean cyclic(int[] arr){
//        int i= 0;
//        while(i<arr.length){
//            int correct = arr[i]-1;
//            if(arr[i] != arr[correct]){
//                swap(arr,i,correct);
//            }else{
//                i++;
//            }
//        }
//        return false;
//    }
//
//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
            int i =0;
            while(i < nums.length){
                int correct = nums[i] - 1;  // this will find the correct index of 1st number
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    i++;   // otherwise move ahead
                }
            }

            // just find missing number
        List<Integer> ans = new ArrayList<>();
            for(int index = 0; index < nums.length; index++){
                if(nums[index] != index+1){
                    ans.add(index+1);
                }
            }
            return ans;
    }



    void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


//import java.util.*;
//public class a6_find_all_missing{
//    public static void main(String[] args) {
//        int[] arr = {4,2,3,7,3,2,8,1};
//        List<Integer> myList = allMissing(arr);
//        System.out.println(myList);
//    }
//    public static List<Integer>allMissing(int[] arr){
//        int i =0;
//        while(i<arr.length){
//            int correct = arr[i];
//            if(arr[i]<arr.length && arr[i]!=arr[correct]){
//                swap(arr,i,correct);
//            }else{
//                i++;
//            }
//        }
//
//        List<Integer>ans = new ArrayList<>();
//        for(int index = 0;index<arr.length;index++){
//            if(arr[index]!=index+1){
//                ans.add(index+1);
//            }
//        }
//        return ans;
//    }
//
//    static void swap(int[] arr,int first,int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}

// output - [1,2,3,4,5,6,7,8]
