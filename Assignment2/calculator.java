package Assignment2;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;



public class calculator {
    public static void main(String[] args) {
        int answer =0;
        Scanner in = new Scanner(System.in);
        char sym = in.next().trim().charAt(0);
        if(sym == '+'||sym=='-'||sym=='*'||sym=='/'||sym=='%'){
            while(true){
                int num1 = in.nextInt();                int num2 = in.nextInt();
                if(sym=='+'){
                    
                    answer=num1+num2;
                    System.out.println(answer);
                    break;
                }
                else if(sym=='-'){
                    
                    answer =num1-num2;
                    System.out.println(answer);
                    break;
                }
                else if (sym=='*'){
                  
                    answer = num1*num2;
                    System.out.println(answer);
                    break;
                
                }
                else if(sym=='/'&&(num1!=0&&num2!=0)){
                    
                    answer = num1/num2;
                    System.out.println(answer);
                    break;
                }
                else if(sym=='%'&&(num1!=0&&num2!=0)){
                    
                    answer = num1%num2;
                    System.out.println(answer);
                    break;
                }
                
                else if(sym=='x'||sym=='X'){
                    //System.out.println("Enter 'x' or 'X' ");
                    break;
                }
             
            }
        }
        else{System.out.println("Entered a wrong type of Operator");}
    }
}
