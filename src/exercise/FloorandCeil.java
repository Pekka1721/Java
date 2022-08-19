package exercise;
import java.util.Scanner;
import java.lang.Math;

public class FloorandCeil {
	public static void main(String[] args) {
		// Take a number as input and print 
		// smallest int not less than the number
		// the given num'
		//largest integer not greater than the number
		
		Scanner num_input = new Scanner(System.in);
		System.out.println("Enter the value : ");
		float num = num_input.nextFloat();
		int largest = (int) Math.floor(num);
		int smallest = (int) Math.ceil(num);
		System.out.print(smallest+" " + num+" "+ largest);
	}
}
