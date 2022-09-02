import java.util.Arrays;
public class Shuffle_The_Array_1470 {
    public static void main(String[] args){
       int[] nums = {2,5,1,3,4,7};
       int n = 3;
       int[] ans = shuffle(nums, n);
       System.out.print(Arrays.toString(ans));
    }
    public static int[] shuffle(int[] nums, int n){
        int[] ans= new int[2*n]; 
        for(int i =0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
            
        }
        return ans;
    }
}
