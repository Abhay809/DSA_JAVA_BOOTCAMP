public class a1_array {
    public static void main(String[] args) {

        // syntax
        // datatype[] variable_name = new data_type[size];
        // store 5 roll numbers
        // int[] rnos = new int[5];
        // or directory
        // int[] rnos2 = {1,2,3,4,5};
        // int[] roll_no // declaration of array
        // roll_no = new int[5];  // Initialisation: Actually here object is being created in the memory(heap)
        int[] roll_no = new int[5];
        System.out.println(roll_no[1]);
        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for(String element: arr){
//            System.out.println(element);
//        }

        // null a = something;  // not  possible
        // String str = null;  // possible because String is a non primitive data type and null can be assigned
        // int num = null;     // Not possible because int is a primitive data type

        // In python there are no primitives
        // In java
        // primitives are stored in the stack memory
        // all the objects , array type, string type or whatever , they are stored in heap memory
        // primitives are (that cannot be broken down) int,char,float, boolean
        // Non primitives (that can be broken down) String, arrays, other complex data types
    }
}
