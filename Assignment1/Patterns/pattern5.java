package Patterns;

public class pattern5 {
    public static void main(String[] args){
        //method call
        pattern(5);
    }
    public static void pattern(int num){
        for(int rows = 1; rows<2*num;rows++){
           int total_col = rows>num?2*num - rows: rows;
           for(int col =1;col<=total_col;col++){
            System.out.print("^ ");
           }
           System.out.println();
        }
    }
}
