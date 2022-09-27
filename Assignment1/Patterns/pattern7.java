package Patterns;

public class pattern7 {
    public static void main(String[] args) {
        patter(5);
    }
 public static void patter(int n ) {
        for(int row = 1;row<=n;row++){
            int whitespace =row-1;
            for(int space =1;space<=whitespace;space++ ){
                System.out.print(" ");
            }
            for(int col =row; col<=n;col++){
                System.out.print("^"); // use space with ^ to print down ward triangle
        }
        System.out.println();
        }
    }
}
