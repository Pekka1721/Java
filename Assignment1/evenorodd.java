import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args){
        System.out.println("Enter a Number: ");
        Scanner num = new Scanner(System.in);
        int input = num.nextInt();
        if(input%2==0){
            System.out.println(input + "is even number");
        }
        else{
            System.out.print(input+" is odd number");
        }
    }
}
