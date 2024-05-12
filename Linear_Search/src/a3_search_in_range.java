public class a3_search_in_range {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println(linear_search(arr,target,1,4)); // here It will only search in the range 1 to 4th index
    }
    static int linear_search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index = start; index<=end; index++){
            // check for index at every element if it is == target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
