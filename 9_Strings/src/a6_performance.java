public class a6_performance {
    public static void main(String[] args) {
        String series = "";
        for(int i =0; i<26; i++){
            char ch = (char)('a'+i);
//            System.out.println(ch);
            series = series + ch;  //series += ch
//            System.out.println(series);
        }
        System.out.println(series);
    }
}

// in this we are creating a new object again and again and it is increasing the time complexity
// time complexity : o(N^2);
