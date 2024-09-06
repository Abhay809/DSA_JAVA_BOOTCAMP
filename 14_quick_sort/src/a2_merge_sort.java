import java.util.Arrays;

// In divide and conquer :- we divide bigger problems into smaller problems
// merge sort: - Divide array into two parts and sort them and then merge them
public class a2_merge_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);   // now I/m updating the array
        System.out.println(Arrays.toString(arr));

    }

    // int[] because we have to return the array
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        // now we have left and right array
        // copyOfRange - copies the specified range of the specified array into new array, creating a new object
        // It is actually creating a new object, not changing the original one
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));   //not mid+1,  mid because it is exclusive

        // Now we have left part sorted, right part sorted
        // Now merge these two arrays and return it
        return merge(left,right);   // return merge that take left and right
    }

    private static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;  // pointer for left array
        int j = 0;  // Pointer for right array
        int k = 0;  // pointer for mix array

        // condition for not to out of bound i and j
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            // now we add a element in mix,so move ahead in mix
            k++;
        }

        // It may be possible that one of the array is not complete
        // Copy the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < first.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
// Using Binary Search (complexity is log N)
// Total number of levels are log N
// And each level we have N comparisons
// Total complexity of merge sort is total level * work at every level
// Merge sort complexity is O(N * logN)

// Space complexity / Auxiliary space in recursion - height of the tree
// O(N)

// In place : - Instead of making new copy, I'll change the value of pointer

