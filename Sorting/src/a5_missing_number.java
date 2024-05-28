public class a5_missing_number {
    public static void main(String[] args) {
        // https://leetcode.com/problems/missing-number/
        // Amazon Question
        int arr[] = {4,0,2,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int i = 0;

        while(i<arr.length) {
            int correct = arr[i];    // bcz it is starting form 0
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        // case 2
        return arr.length;
    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
