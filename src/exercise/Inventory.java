package exercise;
import java.util.Scanner;
import java.lang.Math;
public class Inventory {
/* In inventory management, the economic order quantity for a single product is given by 
 * EOQ = Squareroot(2*demand rate *setup costs/holding cost per unit time
 * and the optimal time between order
 * TBO = Squareroot(2*setupcosts/demand rate *holding cost per item per unit time
 * Write a prog. to computer EOQ and TBO. given demand rate (items per unit time)setup cost(perorder) and the holding costs(per order) and the holding cost (per item per unit time).
 * 
 * */
	public  static void main(String[] args) {
		

	double given_demand_rate, setup_cost,holding_cost,EOQ,TBO;
	
	Scanner values = new Scanner(System.in);
	
	System.out.println("Enter the values: ");
	
	given_demand_rate = values.nextDouble();
	setup_cost = values.nextDouble();
	holding_cost = values.nextDouble();
	
	EOQ= Math.sqrt((2*given_demand_rate*setup_cost)/holding_cost);
	TBO= Math.sqrt((2*setup_cost)/given_demand_rate*holding_cost);
	 System.out.println("EOQ"+ EOQ + "TBO"+TBO);
	
	
	
	
	
	
	
}
}

