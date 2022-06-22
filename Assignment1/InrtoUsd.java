import java.util.Scanner;

public class InrtoUsd {
    public static void main(String[] args) {
     System.out.println("Enter amount in INR");
     Scanner amount = new Scanner(System.in);
     int inr  = amount.nextInt();
     float dollar   = inr/77.23f;
     System.out.println("USD $ "+dollar);
    }
}
