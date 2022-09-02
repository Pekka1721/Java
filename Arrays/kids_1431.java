import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kids_1431 {
    public static void main(String[] args) {
        int[] Input_candies = {2,3,5,1,3};
        int extraCandies = 3;
        
        System.out.println(kidsWithCandies(Input_candies,extraCandies));
        
    }
     static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<Boolean>();                //to store the boolean values after the operation
            for(int kid = 0;kid<candies.length;kid++){
                if(candies[kid]+extraCandies >= maxKid(candies)){
                    ans.add(true);
                }
                else{
                    ans.add(false);
                }
            }
            return ans;
    }
    static int maxKid(int[] array){             //to get kid with max chocolates in the array
        int max =0;
        for (int i =0; i<array.length;i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;

    }
}
