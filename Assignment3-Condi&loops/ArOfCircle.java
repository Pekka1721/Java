import java.util.Scanner;

public class ArOfCircle {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Diamenter or Radius of Circle: ");
        char val = input.next().charAt(0);
        float pi = 3.14f;
        float area = 0f;
        if(val=='D'){
            System.out.println("Enter the diameter");
            float Dia = input.nextFloat();
            float radius = (Dia/2);
         area = pi*(radius * radius);
        }
        else if(val=='r'){
            System.out.println("Enter the Radius");
            float radius = input.nextFloat();
             area = pi*(radius*radius);

        }
        System.out.println("Radius of the Circle"+" is " + area);
    }
}
