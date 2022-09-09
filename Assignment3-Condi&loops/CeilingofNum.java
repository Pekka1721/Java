

public class CeilingofNum {
    public static void main(String[] args){
            int[] nums = {2, 3, 5, 9, 14, 16, 18};
            int target = 12;
            int ans = Ceiling(nums, target);
            System.out.println(ans);
    }
    public static int Ceiling(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==array[mid]){
                return array[mid];
            }
            else if(target>array[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return array[start];
    }
}
