import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        System.out.println("Original Price: ");
        float Oprice = value.nextFloat();
        System.out.println("Selling Price: ");
        float Sprice = value.nextFloat();
        float dAmount = 0f;
        float discPercnet = 0f;
        if(Oprice==Sprice){
            System.out.println("No discoutn");
        }
        else if(Oprice>Sprice){
            dAmount = Oprice-Sprice;
            discPercnet = (dAmount/Oprice)*100;
            System.out.println("Discoutn Price:- "+dAmount +" " +"Discount:- "+" "+ discPercnet+"%");
        }
       

        
    }
}
