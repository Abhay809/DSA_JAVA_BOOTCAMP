// *
public class a8_max_wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(MaximumWealth(accounts));

    }

    static int MaximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
//        for(int person = 0; person < accounts.length;person++){
//            // when you start a new column, take a new sum for that row
//            int rowsum = 0;
//            for (int account = 0; account<accounts[person].length; account++){
//                rowsum += accounts[person][account];
//            }
//            // now we have sum of accounts of the person
//            // check with overall answer
//            if(rowsum>ans){
//                ans = rowsum;
//            }
//        }
        for (int[] ints : accounts) {
            // when you start a new column, take a new sum for that row
            int rowsum = 0;
            for (int anInt : ints) {
                rowsum += anInt;
            }
            // now we have sum of accounts of the person
            // check with overall answer
            if (rowsum > ans) {
                ans = rowsum;
            }
        }
        return ans;
    }
}
