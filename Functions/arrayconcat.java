import java.util.Arrays;

public class arrayconcat {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.print(Arrays.toString(concatArray(nums)));
        
    }
    static int[] concatArray(int[] array){
        int[] ans = new int[2*array.length];
        for(int i = 0;i<array.length;i++){
            ans[i]=ans[i+array.length]=array[i];
        }
        return ans;
    }
}
