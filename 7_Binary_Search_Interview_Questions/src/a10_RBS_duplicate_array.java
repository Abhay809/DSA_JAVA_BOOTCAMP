public class a10_RBS_duplicate_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2,5,6,7};
        System.out.println(findpivotWithDuplicates(arr));
    }

    static int search(int[] nums,int target){
        int pivot = findpivotWithDuplicates(nums);
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
    static int findpivotWithDuplicates(int[] arr){
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
          //if elements at middle,start,end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[mid]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivots??
                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                // check whether the end is pivot

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
