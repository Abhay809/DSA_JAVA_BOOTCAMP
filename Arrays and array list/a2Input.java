import java.util.Arrays;
import java.util.Scanner;

public class a2Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Arrays of primitives

//        int[] arr = new int[5];
//        arr[0] = 34;
//        arr[1] = 435;
//        arr[2] = 45;
//        arr[3] = 567;
//        arr[4] = 56;
        // Internally - [34,435,45,567,56]
//        System.out.println(arr[3]);  // print 567

        // Taking input using for loop
//        for (int i=0; i< arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));  // advanced way to print array, internally it is using for loop
//        for (int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        // same for printing array
//        for(int num: arr){   // for every element in the array, print the element
//            System.out.print(num + " ");  //here num represent the element in the array
//        }

//        System.out.println(arr[5]);  // Index out of bound error

        // Arrays of objects
        String[] arr1 = new String[4];
        for (int i=0; i< arr1.length; i++){
            arr1[i] = in.next();
        }
        System.out.println(Arrays.toString(arr1));

        // modify
        arr1[1] = "Abhay";
        System.out.println(Arrays.toString(arr1));

    }
}
