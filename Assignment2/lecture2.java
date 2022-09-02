package Assignment2;

import java.util.Scanner;

public class lecture2 {
    public static void main(String[] args) {
        // print numbers from 1 to 5;
        for(int num = 1;num<=5;num++){
            System.out.println(num);
        }
        for(int num = 1;num<=5;num+=2){
            System.out.println(num);
        }
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int val = 1;val<=num;val++){
            System.out.print(val);
       }
       int j =1;
       while(j<6){
           System.out.println("Hello World");
           j++;
       }
    }
}
