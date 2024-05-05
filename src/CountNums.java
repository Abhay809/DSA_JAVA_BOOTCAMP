public class CountNums {
    public static void main(String[] args) {
        // Q : Count how much times 5 is in the given number
        int num = 2355675;
        int count = 0;
        while(num>0){
            int rem = num % 10;
            if(rem == 5){
                count++;
            }
            num = num / 10;

        }
        System.out.println(count);
    }
}
