public class leetcode1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int [] nums2 = {1,1,1,1};
        int[] nums3 = {1,2,3};
        System.out.println(numIdenticalPairs(nums3));

    
}
public static int numIdenticalPairs(int[] nums){
    int output =0;
    int i=0;
    while (i<nums.length) {
        int j =i+1;
        while(j<nums.length){
            if(nums[i]==nums[j] & i<j){
                output++;
            }  
            j++;            
        }
        i++;
    }
    return output;
}
}