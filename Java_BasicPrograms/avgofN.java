import java.util.Scanner;

public class avgofN {
    public static void main(String[] args){
        System.out.println("Print value of N");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();
        float sum =0f;
        float avg =0f;
        int i=1;
        for(i=1;i<=n;++i){
            sum = i+sum;
        }
        avg =sum/n;
        System.out.println(avg);
    }
}
