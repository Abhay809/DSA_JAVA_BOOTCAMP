//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class a1_pattern {
    public static void main(String[] args) {
//        pattern2(4);
//        pattern1(4);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern28(5);
//          pattern30(5);
        patten17(5);
    }



    static void pattern1(int n){
        for(int row = 0; row <= n; row++){
            // for every row run the column
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 0; row <= n; row++){
            // for every row run the column
            for(int col = 1; col < row; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = 0; row <= n; row++){
            // for every row run the column
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 0; row <= n; row++){
            // for every row run the column
            for(int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row = 0; row < 2*n; row++){
            int totalColsInRow = row>n ? 2*n-row : row;
            for(int col = 1; col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row = 0;row<2*n;row++){
            int noOfCols = row>n? 2*n-row : row;
            int noOfSpaces = n-noOfCols;
            for(int s = 0; s< noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col = 0;col<noOfCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int row=1;row<=n;row++){
            for(int spaces = 0; spaces<n-row;spaces++){
                System.out.print("  ");
            }
            for(int col = row; col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }

    static void patten17(int n){
        for(int row=1;row<=2*n;row++){
            int c= row>n? 2*n-row : row;
            for(int spaces = 1; spaces<=n-c;spaces++){
                System.out.print("  ");
            }
            for(int col = c;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col = 2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }




}