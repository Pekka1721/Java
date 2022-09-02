import java.util.Arrays;
public class selection {
    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};
        selectionsort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selectionsort(int[] array){
    //swap the maxelement with the last index with max index
    for(int i=0;i<array.length;i++){
        int last = array.length-i-1;
        int maxIndex = findMaxIndex(array,0,last);
        swapNow(array,maxIndex,last);
        
    }
}

    public static int  findMaxIndex(int[] array,int start, int end){
        int max =start;
        for(int i =0;i<=end;i++){
            if(array[max]<array[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swapNow(int[] array,int firstIndex, int secondIndex){
        int temp= array[firstIndex];
        array[firstIndex]= array[secondIndex];
        array[secondIndex]= temp;
    }
}
