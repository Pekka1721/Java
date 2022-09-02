package Assignment2.googleKickstart;
import java.util.Scanner;
import java.util.Scanner;
public class sample{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        byte T = in.nextByte();
        if(T==2){
            int sum=0;
            int N = in.nextInt();
            int M = in.nextInt();
            int[] C = new int[N];
            for(int i = 0;i<C.length;i++){
                C[i]=in.nextInt();
            }
            for(int j =0;j<C.length;j++){
                sum = sum+C[j];
            }
            int rem = sum%M;
            System.out.print("Case #1: "+ rem);
        }
    }
}
