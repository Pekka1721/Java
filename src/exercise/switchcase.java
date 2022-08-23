import java.util.Scanner;

public class switchcase
 {
    public static void main(String[] args){
        System.out.println("Enter your marks: ");
        Scanner input = new Scanner(System.in);
        String grade;
        int marks= input.nextInt();
        
        switch(marks/10){
            case 10:
            case 9:
            case 8:
                grade = "Honours";
                break;
            case 7:
            case 6:
                grade="First Division";
                break;
            case 5:
                grade = "Second Division";
                break;
            case 4:
                grade = "Third Division";
                break;
            default:
                grade ="Fail";
                break;
        }
        System.out.println("Marks: "+ marks+" "+ grade );

    }
}
