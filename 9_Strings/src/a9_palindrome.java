public class a9_palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0; i< str.length()/2; i++) {       // In array there is arr.length and it is a variable
                                                     // In String there is str.length() and it is a method or function
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
