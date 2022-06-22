import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args){
        System.out.println("Enter the Principle , Rate , Time period ");
        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter Your Principle Amount");
        int principle = inputs.nextInt();

        System.out.println("Enter the Rate of intrest ");
        float rate = inputs.nextFloat();

        System.out.println(" Enter the Time period in Months ");
        float time = inputs.nextFloat();

        float simpI = (principle*rate*time)/100;
        System.out.println(simpI);
    }
}
