public class goodPairs1512 {
public static void main(String[] args) {
    int[] nums = {1,2,3,1,1,3};
    int [] nums2 = {1,1,1,1};
    int[] nums3 = {1,2,3};
    System.out.println(numIdenticalPairs(nums3));


}
public static int numIdenticalPairs(int[] nums) {
    int output =0;
    for(int i =0;i<nums.length;i++){
        for(int j =i+1;j<nums.length;j++){
            if(nums[i]==nums[j] & i<j){
                output++;
            }                                        //ums[i] == nums[j] and i < j.
        }
    }
    return output;
}
}
