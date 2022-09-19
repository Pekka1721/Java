import java.util.Scanner;

public class App {
    public static void main(String[] args){
        BankAccount customer1 = new BankAccount();
        customer1.bankAccount("Suresh","6544654");
        customer1.showMenu();
    }
}
class BankAccount{
    int bal;
    int prevTransacation;
    String custName;
    String custID;
    void bankAccount(String cname, String cid){
        custName = cname;
        custID = cid;

    }
    void deposit(int amount){                   //method-1
        if(amount!=0){
            bal = bal+amount;
            prevTransacation= amount;
        }
    }
    void withDraw( int amount){                 //method-2
        if(amount!=0){
            bal =bal-amount;
            prevTransacation = -amount;
        }
    }
    void getPrevTransactions(){             //method-3
        if(prevTransacation>0){
            System.out.println("Deposited: " + prevTransacation);
        }else if(prevTransacation<0){
            System.out.println("WithDrawn: "+ Math.abs(prevTransacation));
        }
        else {
            System.out.println("No Transaction Occured");
        }
    }
    void showMenu(){                        //mehtod-4
        char option ='\0';
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome "+ custName);
        System.out.println("Your ID is "+custID);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. WithDraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");
        do{
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter an Option ");
            System.out.println("------------------------------------------------------------------------------------------------------------");
            option = scan.next().charAt(0);
            System.out.println("\n");

            switch(option){
                case 'A':
                    System.out.println("---------------------------------------");
                    System.out.println("Balance ="+bal);
                    System.out.println("---------------------------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("---------------------------------------");
                    System.out.println("Enter an amount to Deposit: ");
                    System.out.println("---------------------------------------");
                    int amount = scan.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("---------------------------------------");
                    System.out.println("Enter an amount to WithDraw");
                    System.out.println("---------------------------------------");
                    int amount2 = scan.nextInt();
                    withDraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("---------------------------------------");
                    getPrevTransactions();
                    System.out.println("---------------------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    break;
                default:
                        System.out.println("Invalid Option! !.Please enter again");
                        break;
            }
        }while(option!='E');
        System.out.println("ThankYou for Using Our Services");
    }
}