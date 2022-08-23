import java.util.Scanner;

public class elseif {
    public static  void main(String[] args) {
        //grading system
        System.out.println("Enter your marks: ");
        Scanner input = new Scanner(System.in);
        String grade;
        int marks = input.nextInt();
        if(marks<=100&&marks>79){
                grade="Honours";
        }
        else if(marks>59){
            grade = "First Division";
        }
        else if(marks>49){
            grade ="Second Division";
        }
        else if(marks>39){
            grade ="Third Division";
        }
        else{
            grade = "Fail";
        }
        System.out.println(marks+" Marks "+ grade+" grade");
    }
}
