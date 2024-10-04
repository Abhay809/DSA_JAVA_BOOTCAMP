class a1_oddEven {
    public static void main(String[] args){
//        int n = 68;
//        if((n&1) == 1) System.out.println("odd number");
//        else System.out.println("even number");

        int n = 67;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n){
        return (n&1) == 1;
    }
}