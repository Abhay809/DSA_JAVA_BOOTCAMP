public class a8_search_in_mountain {
    //https://leetcode.com/problems/find-in-mountain-array/description/
    // Find in Mountain Array
    public static void main(String[] args) {

    }

    // we have to return the index value
//    int search(int[] arr,int target){
//        int peak = peakIndexInMountainArray(arr);
//        int first_try = orderBS(arr,target,0,peak); //first try for ascending order
//        if(first_try!=-1){
//            return first_try;
//        }
//        // try to search in second half
//
//
//    }
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in the decreasing part of the array
                //this may be the ans,but look at left
                // this is why end!= mid-1
                end = mid;
            }else{
                // you are in ascending part of the array
                start = mid+1;  // because we know that mid+1 element > mid element
            }
        }
        // in the end, start==end and pointing to the largest number because of 2 checks above
        // Start and end are always trying to find max element in the above two checks
        // hence, when they are pointing to just one element, that is the max one because that is the what checks say
        // More elaboration: at every point of time for start and end, they have the best possible answer till that time
        //and if we are saying that only one item is remaining, hence because of above that is the best possible answer
        return start; // or return end , both are same
    }

    static int orderBS(int[] arr, int target,int start,int end){
        // find the array is in ascending or descending order
//        boolean isAsc;
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }else{
//            isAsc = false;
//        }
        // OR
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            // find the middle element
            int mid = start+(end-start)/2;
            // same condition for ascending and descending
            if(target == arr[mid])
                return mid;
            if(isAsc){
                if(target<arr[mid])
                    end = mid -1;
                else{
                    start = mid +1;
                }
            }else{
                if(target<arr[mid])
                    start = mid+1;
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
