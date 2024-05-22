import java.util.Arrays;

public class a13_RowColMatrix {
    public static void main(String[] args) {
        // whenever given a big matrix, try to reduce the search space
        // that's why we are eliminating the rows and columns
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        System.out.println(Arrays.toString(search(arr,49)));
        System.out.println(Arrays.toString(search(arr,39)));

    }
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;
        while(row< matrix.length-1 && col>=0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col]< target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}
