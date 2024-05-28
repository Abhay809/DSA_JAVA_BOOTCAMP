import java.util.Arrays;

// Insertion sort:= we are sorting the array partially
// Idea: try sorting in parts and parts
// explanation: first sort the index no 0, then sort till index n0. 2, then till index no. 3
// put the index element at the correct index of L.H.S
public class a3_Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2,3,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            // or for(int i= 0;i<= arr.length-2; i++)
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
