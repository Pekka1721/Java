import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       System.out.println("Enter the values ");
        Scanner input  = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();

        int ans = sum1(a,b);
        System.out.println(ans);


   } 
   static int sum1(int a , int b){ // Here this function with parameters
       int sum = a+b;
       return sum;
   }
}
