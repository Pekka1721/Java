import java.util.Arrays;

public class RunninSumArray {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    System.out.println(Arrays.toString(sumArray(nums)));
    }
    static int[] sumArray(int[] nums){
        for(int i =1;i<nums.length;i++){
           nums[i]+=nums[i-1];
        }
        return nums;
        
    }
}
