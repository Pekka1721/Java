<<<<<<< HEAD
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        System.out.println("Enter a Number");
        Scanner number = new Scanner(System.in);
        int factorial = number.nextInt(); 
        double ans1= Fact(factorial);           //taking input using scanner
        long ans =1;                                 // user may give input for a larger value
        while(factorial>1){
            ans = ans*factorial;
            --factorial;
        }
        System.out.println(ans); 
        System.out.println(ans1);                                           
    }
    //using methods
    public static long Fact(int x){   
        if(x==0 || x==1){           //this condition is not required it is same as ans =1;
            return 1;
        }                  //long will give decimal value where double  will give large integer
        long ans=1;
        while(x>1){
            ans=x*ans;
            --x;
        }
        return ans;
    }
=======
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        System.out.println("Enter a Number");
        Scanner number = new Scanner(System.in);
        int factorial = number.nextInt(); 
        double ans1= Fact(factorial);           //taking input using scanner
        long ans =1;                                 // user may give input for a larger value
        while(factorial>1){
            ans = ans*factorial;
            --factorial;
        }
        System.out.println(ans); 
        System.out.println(ans1);                                           
    }
    //using methods
    public static long Fact(int x){   
        if(x==0 || x==1){           //this condition is not required it is same as ans =1;
            return 1;
        }                  //long will give decimal value where double  will give large integer
        long ans=1;
        while(x>1){
            ans=x*ans;
            --x;
        }
        return ans;
    }
>>>>>>> f3bb43f5d70bdc30b8417c6059cefc14d7fadae0
}