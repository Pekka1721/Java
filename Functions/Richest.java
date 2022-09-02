import java.util.Arrays;

public class Richest {
    public static void main(String[] args){
       int[] accounts={1,2,3};
       int sum = 0;         
       for(int i = 0 ;i<accounts.length;i++){
        sum=sum+accounts[i];
       }
       System.out.print(sum);
    }
}
