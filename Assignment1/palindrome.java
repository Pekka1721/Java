import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);String reverse = "";
        String value = input.next();
        int length = value.length();
        for( int i=length-1;i>=0;i--){
            
             reverse = reverse + value.charAt(i);
        }
        if(reverse.equals(value)){
            System.out.print(value+ " is a Palindrome");
        }
        else{System.out.println(value+" is not a palindrome ");}

          
        
    }
}
