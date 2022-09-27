package Patterns;

public class pattern1 {
    public static void main(String[] args){
            printPatter1(5);
            System.out.println();
            pattern2(5);
    }
    public static void printPatter1(int num){
        for(int rows =1;rows<=num;rows++){          //for the no of rows to be printing
                for(int col = 1;col<=rows;col++){       //for no of colomms to prnt;
                    System.out.print("^ ");
                }
            System.out.println();
        }
    }
    public static void pattern2(int num){
        for(int rows =1;rows<=num;rows++){          //for the no of rows to be printing
            for(int col = 1;col<=num;col++){       //for no of colomms to prnt;
                System.out.print("^ ");
            }
        System.out.println();
    }
    }
}
