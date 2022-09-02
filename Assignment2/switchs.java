package Assignment2;
import java.util.Scanner;
public class switchs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch(fruit){
            case"Mango":
                 System.out.pritnln("King of Fruits");
                break;
            case"Apple";
                System.out.println("Sweet Red Fruit");
                break;
            case"Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
    }  
}
