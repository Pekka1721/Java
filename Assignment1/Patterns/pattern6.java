package Patterns;



public class pattern6 {
    public static void main(String[] args){
            pattern(5);
            name(5);
    }
    public static void pattern(int n ){
        for(int row = 1;row<=n;row++){  //rows
            int whitespaces = n-row;
            for(int col = 1;col<=whitespaces;col++){
                System.out.print(" ");
            }
            for(int remCol = whitespaces+1;remCol<=n;remCol++){
                System.out.print("^"); // use space to print a mid triangle
            }
            System.out.println();
        }

    }
    public static void name(int n ) {
       
              // size of the triangle
              int size = 5;
              // loop to print the pattern
              for (int i = 0; i < size; i++) {
                // print spaces
                for (int j = 1; j < size - i; j++) {
                  System.out.print(" ");
                }
                // print stars
                for (int k = 0; k <= i; k++) {
                  System.out.print("*");   
                }
                System.out.println();
              }
            }
          

}        