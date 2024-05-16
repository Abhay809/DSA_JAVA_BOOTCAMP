public class a9_RBS {
    // Search in Rotated Sorted Array
    // https://leetcode.com/problems/search-in-rotated-sorted-array/description/
    // pivot - greatest element in the array
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }

    static int search(int[] nums,int target){
        int pivot = findpivot(nums);
        // if you didn't find the pivot, it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binary_Search(nums,target,0,nums.length-1);
        }
        // if pivot is found, you have found 2 ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target>= nums[0]){
            return binary_Search(nums,target,0,pivot-1);
        }
        return binary_Search(nums,target,pivot+1,nums.length-1);
    }
    static int binary_Search(int[] arr,int target,int start, int end){
        while(start <= end){
            //find the middle element
//            int mid = (start+end)/2;  // might be possible that (start+end) exceeds the int size in java
            int mid = start+(end-start)/2;  // so we use this
            if(target<arr[mid]){
                end = mid -1;    // In descending order = start = mid+1;
            }else if(target>arr[mid]){
                start = mid+1;   // In descending order = end = mid-1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // 4 cases over here to find pivot
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}

// we can do it by recursion by just a single method
// this code will not work for the duplicate values
// {1,2,3,6,3,2}

