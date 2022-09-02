public class linearsearch {
    public static void main(String[] args) {
        int[] nums ={11,22,33,44,55,66};
        int target = 2;
        int ans = linear_search(nums, target);
        //int ans1 = linear_search2(nums, target);
        boolean ans2 = linear_search3(nums, target);

        System.out.println(ans+ " LS1");
       // System.out.println(ans1+" LS2");
        System.out.println(ans2+" LS3");
    }
    //search in the array : return the index if item found
    static int linear_search(int[] arr, int target){
        if(arr.length==0){
            return -2;                                     //if the array is empty then it will return -2//
        }
        for(int index =0;index<arr.length;index++){         //code for linear search//
            if(arr[index]==target){
                return index;                              // if the element found in the array at index it will return the index//
            }
        }
        return -1;                                         //if the search is completed and the element is not in the array the it will return -1//
    }
    static int linear_search2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index1 : arr) {
            if(arr[index1]==target){
                return target;
            }
        }
        return -1;
        
    }
    static boolean linear_search3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for (int index2 : arr) {
            if(arr[index2]==target){
                return true;
            }
        }
        return false;
    }
}
