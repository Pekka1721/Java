import java.util.Scanner;

public class fib {
    public static void main(String[] args){
        System.out.print("Enter the N th fib.Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int number1 =0;
        int number2 =1;
        int counter =0;
        while(counter<number){
            int fib = number1+number2;
            System.out.print(fib+" ");
            counter++;
            number1 = number2;
            number2 = fib;
           
        }
    }
}
