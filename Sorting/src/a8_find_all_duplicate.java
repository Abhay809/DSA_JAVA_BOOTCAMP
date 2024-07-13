import java.util.ArrayList;
import java.util.List;

public class a8_find_all_duplicate {
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i<arr.length) {
                int correct = arr[i]-1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }else{
                i++;  // move ahead
                }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
