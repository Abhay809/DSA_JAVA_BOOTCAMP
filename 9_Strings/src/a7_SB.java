// Use of StringBuilder:- building strings from many smaller strings or appending new characters to an existing string
public class a7_SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i =0; i<26; i++){
            char ch = (char)('a' +i);
            builder.append(ch);   // in it we modify the previous object not creating the new one

        }
        System.out.println(builder.toString());   // output :- abcdefghijklmnopqrstuvwxyz
        builder.deleteCharAt(0);
        System.out.println(builder);       // output :- bcdefghijklmnopqrstuvwxyz

        builder.reverse();
        System.out.println(builder);    // output:- zyxwvutsrqponmlkjihgfedcb
    }
}

// In this time complexity reduced because we are not creating the new object
// we are changing in the previous one
