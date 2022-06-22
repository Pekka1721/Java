import java.util.Arrays;

public class swap {
    public static void main(String[] args){

        int[] values = {12, 34,56,33,85,3,5,8};
        System.out.println(Arrays.toString(values)); //Checking original array

        swap(values, 1, 5);
        System.out.println(Arrays.toString(values)); //Checking swaped array

        reverse(values);
        System.out.println(Arrays.toString(values));// checking the revers array 
        
    }
     static void swap(int[] array ,int index1,int index2){
        int temp = array[index1];
        array[index1]= array[index2] ;
        array[index2]= temp;
    }
    static void reverse(int[] array){
        int start =0;
        int end = array.length-1;
        while(end>start){                           //greater than and greater than or equals to will also work;
             int temp = array[start];
             array[start]=array[end];
             array[end]= temp;
            start++;
            end--;
        }
        

    }
}
