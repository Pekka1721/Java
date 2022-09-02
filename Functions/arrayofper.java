import java.util.Arrays;

public class arrayofper{
    public static void main(String[] args) {
       int[]  nums = {0,2,1,5,3,4};

       System.out.println(Arrays.toString(nums));
       System.out.println(Arrays.toString(perm(nums)));
    }
    static int[]  perm(int[] array){
        int[] ans =new int[array.length];
            for(int a =0;a<=array.length-1;a++){
                ans[a] = array[array[a]];
            }
            return ans;
   

    }
}