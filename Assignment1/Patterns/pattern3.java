package Patterns;

public class pattern3 {
    public static void main(String[] args){
pattern(5);
    }
public static void pattern(int num){
    for(int rows = 1;rows<=num;rows++){
        for(int col = 5;col>=rows;col--){
            System.out.print("<>");
        }
        System.out.println();
    }

    for(int rows = 1;rows<=num;rows++){
    for(int col = 5;col>=rows;col--){
        System.out.print("<");
    }
    System.out.println();
}
}        
}
