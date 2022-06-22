import java.util.Scanner;
public class largerorsmall {
    public static void main(String[] args){
        System .out.println("Enter a Number: ");
        Scanner num  = new Scanner(System.in);
        int number1 = num.nextInt();
        int number2 =  num.nextInt();
        if(number1>number2){
            System.out.println(number1+" is larger number");
        }
        else{
            System.out.print(number2+" is larger number");
        }
    }
}

