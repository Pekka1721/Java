<<<<<<< HEAD
import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args){
        Scanner reading = new Scanner(System.in);
        System.out.println("PrevReading");
        int prevReading = reading.nextInt();
        System.out.println("CurrentReading");    
        int curReading = reading.nextInt();
        int Eunits=0;
        if(curReading>prevReading){
            Eunits = curReading-prevReading;
        }else{
            System.out.println("Enter value > PrevReading");
            curReading = reading.nextInt();
        }
        
        System.out.println("Units:- "+Eunits);
        float Uprice = 2.50f;
        float bill = 100; 
        if(Eunits<=50){ 
            System.out.println("Your Electricity Bill is: "+ bill); //upto 50 units average bill 100
        }
        else if(Eunits>50&&Eunits<=100){
                Uprice = 3.45f;
                bill = Eunits*Uprice;
                System.out.println("Your Electricity Bill is: "+bill);
                
        }
        else if(Eunits>100&&Eunits<=200){
            Uprice = 4.5f;
            bill = Eunits*Uprice;
            System.out.println("Your Electricity Bill is: "+bill);
        }
        else if(Eunits>200&&Eunits<=400){
            Uprice = 6.5f;
            bill = Eunits*Uprice;
            System.out.println("Your Electricity Bill is: "+bill);
        }
        else if(Eunits>400&&Eunits<=600){
                Uprice = 7;
                bill = Eunits*Uprice;
                System.out.println("Your Electricity Bill is:"+bill);
        }
        else{
            System.out.println("Your billing Catogery is higher ");
        }
}
}
=======
import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args){
        Scanner reading = new Scanner(System.in);
        System.out.println("PrevReading");
        int prevReading = reading.nextInt();
        System.out.println("CurrentReading");    
        int curReading = reading.nextInt();
        int Eunits=0;
        if(curReading>prevReading){
            Eunits = curReading-prevReading;
        }else{
            System.out.println("Enter value > PrevReading");
            curReading = reading.nextInt();
        }
        
        System.out.println("Units:- "+Eunits);
        float Uprice = 2.50f;
        float bill = 100; 
        if(Eunits<=50){ 
            System.out.println("Your Electricity Bill is: "+ bill); //upto 50 units average bill 100
        }
        else if(Eunits>50&&Eunits<=100){
                Uprice = 3.45f;
                bill = Eunits*Uprice;
                System.out.println("Your Electricity Bill is: "+bill);
                
        }
        else if(Eunits>100&&Eunits<=200){
            Uprice = 4.5f;
            bill = Eunits*Uprice;
            System.out.println("Your Electricity Bill is: "+bill);
        }
        else if(Eunits>200&&Eunits<=400){
            Uprice = 6.5f;
            bill = Eunits*Uprice;
            System.out.println("Your Electricity Bill is: "+bill);
        }
        else if(Eunits>400&&Eunits<=600){
                Uprice = 7;
                bill = Eunits*Uprice;
                System.out.println("Your Electricity Bill is:"+bill);
        }
        else{
            System.out.println("Your billing Catogery is higher ");
        }
}
}
>>>>>>> f3bb43f5d70bdc30b8417c6059cefc14d7fadae0
