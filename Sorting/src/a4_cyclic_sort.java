// Cyclic sort:-  USE cyclic sort always when numbers given from 1 to n
// use:- when you want to sort the array in single one pass
// use only one for loop, so complexity reduced to O(N)
// questions can be solved with the help of cyclic sort are:
// 1.You are given numbers from 1 to n. find the missing number
// 2. you are given an unsorted array, find the positive missing number
// 3. you are given numbers from 1 to n, find the duplicate number
// CYCLIC SORT: Index = value-1
// swap a number with its correct index
//time complexity : O(N) - in worst case
// space complexity = O(1)

import java.lang.reflect.Array;
import java.util.Arrays;

public class a4_cyclic_sort {
    public static void main(String[] args) {
        int [] arr = {3,4,2,1,5};  // not work for negative number (only numbers 1 to N)
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
       int i =0;
       while(i < arr.length){
           int correct = arr[i] - 1;  // this will find the correct index of 1st number
           if(arr[i] != arr[correct]){
               swap(arr,i,correct);
           }else{
               i++;   // otherwise move ahead
           }
       }
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
