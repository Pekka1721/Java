package Patterns;

public class pattern1 {
    public static void main(String[] args){
            printPatter(5);
    }
    public static void printPatter(int num){
        for(int rows =1;rows<=num;rows++){
            
                for(int col = 1;col<=rows;col++){
                    System.out.print("^ ");
                }
            System.out.println();
        }
    }
}
