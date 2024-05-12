public class a2_order_agnostic_binary_search {
    public static void main(String[] args) {
//        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr = {75,22,11,10,5,2,99,80,-3};
        int target = 22;
        System.out.println(orderBS(arr,target));

    }
    static int orderBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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


        // my approach
//        int mid = start+(end -start)/2;
//        if(arr[start]>arr[end]){
//            while(start<=end){
//                if(target>arr[mid]){
//                    end = mid-1;
//                }else if(target<arr[mid]){
//                    start  = mid+1;
//                }else{
//                    return mid;
//                }
//            }
//        }else{
//            while(start<=end){
//                if(target>arr[mid])
//                    start = mid +1;
//                else if (target<arr[mid])
//                    end = mid-1;
//                else
//                    return mid;
//            }
//        }

