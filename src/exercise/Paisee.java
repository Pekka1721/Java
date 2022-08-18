package exercise;
import java.util.Scanner;
public class Paisee {
	public static void main(String[] args ) {
		//Read the price of item in decimal form and convert to paise ex: 75.95 to 7595
		
		
		Scanner price = new Scanner(System.in);
		float rupees = price.nextFloat();
		int paise = (int)(rupees * 100);
		System.out.print("Rupees "+ rupees + " Paise "+ paise);
	}
}
