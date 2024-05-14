//Find First and Last Position of Element in Sorted Array
public class a5_first_and_last_index {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

    }
    public int[] searchrange(int [] nums,int target){
        int[] ans = {-1,-1};
        // Check for first occurrence of target first
//        int start = search(nums,target,true);
//        int end = search(nums,target,false);
//        ans[0] = start;
//        ans[1] = end;
        ans[0] = search(nums,target,true);
        if(ans[0]!=-1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }
    // this function just returns the index value of target
    int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            //find the middle element
//            int mid = (start+end)/2;  // might be possible that (start+end) exceeds the int size in java
            int mid = start+(end-start)/2;  // so we use this
            if(target<nums[mid]){
                end = mid -1;    // In descending order = start = mid+1;
            }else if(target>nums[mid]){
                start = mid+1;   // In descending order = end = mid-1;
            }else{
                //Potential ans found
                ans = mid;
                if(findStartIndex){  // boolean expression itself have true or false value
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
