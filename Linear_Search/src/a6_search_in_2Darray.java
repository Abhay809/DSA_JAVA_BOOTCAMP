import java.util.Arrays;

public class a6_search_in_2Darray {
    public static void main(String[] args) {
        int[][] arr  = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 34;    // 34 is in [2,2]th index
        int[] ans = search(arr,target);   // format of return value
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {   // i can be replace with row
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int max(int[][] arr){
//        int max = arr[0][0]; //or
        int max = Integer.MIN_VALUE;  // same
//        for(int i=0;i<arr.length;i++) {
//            for (int j = 0; j < arr[i].length; j++) {   // i can be replace with row // j= column
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//        }
        // enhanced for loop
        for (int[] ints : arr) {
            for (int anInt : ints) {   // i can be replace with row // j= column
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
