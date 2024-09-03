import java.util.Arrays;

// Bubble Sort or Sinking sort or Exchange sort
// In this with every step the largest element will come at last
public class a1_Bubble_Sort{
    public static void main(String[] args) {
        int[] arr = {-1,7,-32,0,89};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    // void bcz it's not returning anything
    // space complexity is constant, bcz it's not creating any new array
    // boolean swapped bcz it check if for i=0, no swap occur then break the program, the array is already sorted
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i=0; i< arr.length; i++){
            swapped = false;
            //for each step max item will come at the last respective index
            for(int j =1; j< arr.length-i;j++){
                // or for(int j =1; j<= arr.length-i-1;j++)
                // swap it if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you didn't swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}

// time complexity - o(N)