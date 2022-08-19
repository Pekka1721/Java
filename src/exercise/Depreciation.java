
package exercise;
import java.util.Scanner;
public class Depreciation {
	public static void main(String[] args) {
		
		//Deprication = (purchase price - Salvage value)/years of service;
		
		//write a program to determine the salvage value of an item when the purchase price
		//years of service and the annual deprication is given
		
		Scanner values = new Scanner(System.in);
		float salvage_value;
		float Deprication = values.nextFloat();
		float purchase_value = values.nextFloat();
		float years_of_serv = values.nextFloat();
		
		
		salvage_value = Deprication*years_of_serv - purchase_value ;
		System.out.print(salvage_value);
		
	}
}
