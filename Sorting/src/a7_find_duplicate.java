public class a7_find_duplicate {
    // amazon question
    // microsoft question
    //https://leetcode.com/problems/find-the-duplicate-number/description/
//    public static void main(String[] args) {
//
//    }
//
//    void cyclic(int[] arr){
//        int i= 0;
//        while(i<arr.length){
//            int correct = arr[i]-1;
//            if(arr[i] != arr[correct]){
//                swap(arr,i,correct);
//            }else{
//                i++;
//            }
//        }
//        for(int index = 0; index<arr.length;index++){
//            if(arr[index] != index+1){
//                return index;
//            }
//        }
//
//    }
//
//    void swap(int[] arr,int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

    public int findDuplicate(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    // otherwise I found my answer
                    return arr[i];
                }
            }else{
                i++;  // move ahead
            }
        }
        // if there are no duplicate you can return -1
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// can also be solved with the help of cycle detection - linked List topic
