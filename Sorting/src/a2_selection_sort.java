import java.util.Arrays;

// Selection sort:- select an element and put it in its right position
// select the largest element and put it in its correct position
public class a2_selection_sort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            // find the max item in the remaining array and swap it with the correct index
            int last = arr.length-i-1;
            int maxIndex = findmaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    // now swap the elements
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // find the maximum and put it at the correct index
    private static int findmaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}

// Best case time complexity:= O(N^2)
// Worst case time complexity:= O(N^2)
// here N is the number of comparisons
// Stable = No
// use case = It performs well in small lists/ arrays
