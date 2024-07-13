// Ceiling number = smallest number in the array that is greater than or equal to the target
// ceiling = return the smallest number >= target

public class a1_ceiling_number {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,67,89};
        int target = 5;
        System.out.println(ceiling(arr,target));

    }
    static int ceiling(int[] arr, int target){
        // but what if the target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else{
                return mid;
            }
        }
        return start;
    }
}

// arr {1,2,3,4,67,89}
// target = 5;
//public class a1_ceiling_number{
//    public static void main(String[] ar){
//        int[] arr = {1,2,3,4,67,89};
//        int target = 5;
//        System.out.println(ceiling(arr,target));
//    }
//    static int ceiling(int[] arr, int target){
//        int start =0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if(target<mid){
//                end = mid-1;
//            }else if(target>mid){
//                start = mid+1;
//            }else{
//                return mid;
//            }
//        }
//        return start;
//    }
//}