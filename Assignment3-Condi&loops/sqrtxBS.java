import java.util.Scanner;

public class sqrtxBS {
    public static void main(String[] args) {
        System.out.println("Enter a Integer to Find square root ");
        System.out.println("Sqrt()");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(mySqrt(num));
    }
    public static int mySqrt(int x) {
        if(x<=0){
            return 0;
        }
        int ans=0;
        int start = 1;
        int end = x;
        while(start<=end){
            int mid = (end+start)/2;
            if(mid<=x/mid){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return ans;
           }
        }

