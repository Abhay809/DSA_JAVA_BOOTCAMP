public class a1_Linear_search {
    public static void main(String[] args) {
        int[] nums = {12,13,14,-11,-14,45};
        int target = -14;
        int ans = linear_search(nums,target);
        System.out.println(ans);

    }

    static int linear_search(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }

    // search the target and return true or false
    static boolean linear_search3(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        //run a enhanced for loop
        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}


