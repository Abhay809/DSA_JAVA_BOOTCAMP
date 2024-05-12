// leetcode problem = find numbers with even number of digits
public class a7_even_digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(find_numbers(nums));  // there are two even digits number so it return 2
        System.out.println(digits(45678));  // 5 digits are in 45678
        System.out.println(digits2(567892));

    }
    static int find_numbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        /*
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */
        return numberOfDigits % 2 == 0;
    }

    // second way to find number of digits
    static int digits2(int num){
        return (int)(Math.log10(num)) +1;
    }

    // count number of digits in a number
    static int digits(int num){
        if(num<0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num = num/10; //num /= 10
        }
        return count;
    }
}
