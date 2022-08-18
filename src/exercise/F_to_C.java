package exercise;
import java.util.Scanner;
public class F_to_C {
	public static void main(String[] args) {
		//Fahrenheit to Celsius 
		// Formulae C =(F-32)/1.8
		
		Scanner temp = new Scanner(System.in);
		float F =temp.nextFloat();
		float C = (float)((F-32)/1.8);
		System.out.println(F+" Fahrenheit"+ " | "+C +" Celsius");
	}
}
