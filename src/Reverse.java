public class Reverse {
    public static void main(String[] args) {
        // Q: print the reverse of a number
        int n = 12345;
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;

        }
        System.out.println(ans);

    }
}
