import java.util.Arrays;

public class a3_MergeSortInPlace {
    // Merge Sort In place
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);   // now I/m updating the array
        System.out.println(Arrays.toString(arr));

    }

    // int[] because we have to return the array
    static void  mergeSortInPlace(int[] arr,int s, int e){   // not returning anything, just modifying the original array
        if(e-s == 1){
            return;
        }
        int mid = (s+e) / 2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        // Now we have left part sorted, right part sorted
        // Now merge these two arrays and return it
        mergeInPlace(arr,s,mid,e);   // changing the original array, not returning anything
    }

    private static void mergeInPlace(int[] arr,int s, int m, int e){
        int[] mix = new int[e-s];

        int i = s;  // pointer for left array
        int j = m;  // Pointer for right array
        int k = 0;  // pointer for mix array

        // condition for not to out of bound i and j
        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            // now we add a element in mix,so move ahead in mix
            k++;
        }

        // It may be possible that one of the array is not complete
        // Copy the remaining elements
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
//        return mix;
        // Not returning anything, so I will change in the original array
        for (int l = 0; l < mix.length; l++){
            arr[s+l] = mix[l];
        } // can replace with
//        System.arraycopy(mix, 0, arr, s + 0, mix.length);
    }
}
