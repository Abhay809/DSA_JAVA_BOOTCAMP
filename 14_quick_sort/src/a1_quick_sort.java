// Quick sort : - Sorting Algorithm which is used to sort the array
// What it's work: find pivot element and shift them right and left side according to pivot
// In merge sort when the array is completely sorted then also it will go till end (check base condition)
// In quick sort if the array is already sorted then it will not sort it anymore

// Pivot: pivot is just a random number, it make sure that all the smaller numbers lying left hand side from it and greater
// number lying right hand side of it
// merge sort takes extra space, quick sort is also take some space of recursion, but it's prefer over merge sort
// merge sort is better in linked list, because linked list are not like continuous memory allocation, it's a random memory allocation

import java.util.Arrays;

public class a1_quick_sort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);

    }

    /* am I returning new array? No. Changing in previous one */
    /* Low and high :- basically which part of the array we are working on */
    /* start and end for swapping low and hi */
    /* In array.copy[range] we can use, but it will create an extra space*/
    static void sort(int[] nums, int low, int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            // Also a reason why if its already sorted it will not swap - quick sort, in merge sort it will happen
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            // when these condition violates then it will swap s and e

            // why we are again checking condition
            // because when we enter in while(s<=e) loop and do s++ and e-- again and again, then s may be become bigger than e
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;

            }
        }

        // now my pivot at correct index, please sort two halves now  (low,e) and (s, hi)
        sort(nums,low,e);
        sort(nums,s,hi);



    }


}