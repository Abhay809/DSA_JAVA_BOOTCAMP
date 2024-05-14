// search in infinite array
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class a6_infinite_array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,
                    100,130,140,160,170};   // here we didn't use arr.length, hence we don't know the size of the array
        int target = 10;
        System.out.println(ans(arr,target));

    }

    static int ans(int[] arr, int target){
        // first find the range
        //first start with a box of size 2 (because infinite array)
        int start =0;
        int end = 1;
        // condition for the target to lie in the range( if my target>end then keep doubling the size and check again)
        while(target>arr[end]) {  //then keep doubling the size to search
            int newStart = end + 1;  // or int temp = end+1;
            // double the box value
            // end= previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;  // (end-start+1)*2 this is double the box or index size
            start = newStart;  // then start = temp;
        }
        return binarysearch(arr,target,start,end);
    }


    // binary search code with some changes
    static int binarysearch(int[] arr, int target, int start, int end){
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
}

