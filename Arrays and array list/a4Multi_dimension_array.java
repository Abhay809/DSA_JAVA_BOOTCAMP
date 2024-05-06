import java.util.Arrays;
import java.util.Scanner;

public class a4Multi_dimension_array {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        // int[][] arr = new int[3][];
        // no. of rows given is mandatory
        // column size is not necessary

//        int[][] arr2D = {
//                {1,2,3}, // oth index
//                {4,5},   // 1st index
//                {6,7,8,9} //2nd index // arr2D[2] = {6,7,8,9}  // arr2D[2][0] = 6;
//                // each array is a different object so size can vary
//        };

        int[][] arr = new int[3][2];
        System.out.println(arr.length); // print no of rows = 3
        // input
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {  // because each row has different column size
                arr[row][col] = in.nextInt();
            }
        }
        // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // or the output
//        for(int row =0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // using enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
