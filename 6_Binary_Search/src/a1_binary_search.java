public class a1_binary_search{
    public static void main(String[] args) {
        int[] arr = {-90,-18,4,5,6,23,37,879};  // the array should be in ascending order
        int target = 37;
        int ans = binary_Search(arr,target);
        System.out.println(ans);

    }
    static int binary_Search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
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
// giving error for searching -90,37
// result = the array should be sorted
