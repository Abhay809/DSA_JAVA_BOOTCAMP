public class a11_RotationCount {
    // Find the Rotation Count in Rotated Sorted array == Pivot+1
    // https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};  // here pivot is 7, index is 3, count is pivot+1=4
//        int[] arr = {1,2,3,4,5,6,7};  // already sorted, pivot = -1 ,pivot+1= 0, ans = 0;
//        int[] arr = {4,5,6,7,7,7,1,2,3}; // ouput is 6
        System.out.println(count_rotation(arr));
    }

    public static int count_rotation(int[] arr) {
        int pivot = findpivot(arr);
        return pivot+1;

    }

    // use this for non duplicates
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

    // use this for duplicates
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
