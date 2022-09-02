import java.util.Arrays;

public class bubblesort{
    public static void main(String[] args){
            int[] array = {5,4,3,2,1};
            bubble(array);
            System.out.println(Arrays.toString(array));
    }
    static void bubble(int[] array){
        boolean swapped;
        //ruh the steps n-1 times
        for(int i =0 ;i<array.length;i++){
            swapped = false;
            //for each step the max element in the array will come to the max place
            for(int j =1;j<array.length-i;j++){

                //swap if the item is smaller then the previous item
                if(array[j]<array[j-1]){
                    //swap
                    int temp =array[j];
                   array[j]=array[j-1];
                   array[j-1]=temp;
                   swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
   
}