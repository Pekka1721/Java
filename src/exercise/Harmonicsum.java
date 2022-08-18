package exercise;

import java.util.Scanner;

public class Harmonicsum {
	public static void main(String[] args) {
		System.out.print("Enter the value of n : ");
		Scanner input  = new Scanner(System.in);
		
		float limit_n = input.nextFloat();
		float sum =0.0f;
		 while(limit_n>=1){
	         sum =sum+(1/limit_n);
	         limit_n--;
	     }
		
		
		System.out.print("Output "+ sum);
	}	
	}
	
