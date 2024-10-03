// *
// Find Smallest Letter Greater Than Target
public class a3_smallest_letter {
    public static void main(String[] args) {
//        https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextletter(letters,target));
    }
     static char nextletter(char[] letters,char target){
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if(target<letters[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return letters[start%letters.length];
     }
}
