// Mountain Array:- Numbers first increasing and then decreasing
// It is also known as bio-tonic array
// ex- 1,2,5,18,12,10
// finding the maximum number in the array is our answer
public class a7_mountain_array {
    // Peak  index in mountain array
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
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
}
