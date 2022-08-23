package exercise;

import java.util.Scanner;

public class nestedIf_else {
    public static void main(String[] args ){

        /* A commercial; bank has introduced an incentive policy of giving bonus to all its deposit holders.the policy is as follows: 
         * A bonus of 2 per cent of the balance held on 31st dec is given to every one, irrespective of their balances, and 5 percent is given to female account holders if their balance is more than RS 5000. This logic can coded as follows: 
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Are yoy a Female? Entre True or False.");
        boolean sex = input.nextBoolean();
        float balance,bonus;
        balance = input.nextInt();
        if(sex=true){
            if(balance>5000){
                bonus= (float)(0.05*balance);
            }
            else{
                bonus=(float)(0.02*balance);
            }

        }
        else{
            bonus=(float)(0.02*balance);
        }
        balance= bonus+balance;
        System.out.println("Total Balance: "+ balance+ "Bonus: "+ bonus);
    }
}
