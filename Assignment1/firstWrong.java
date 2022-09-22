import java.util.Scanner;
import java.util.Arrays;
public class firstWrong {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        String decisions =values.next();
        char[] array = new char[decisions.length()];
        for (int i = 0;i<decisions.length();i++) {
            array[i] = decisions.charAt(i);
        }
        char c = 'W';
        wrong1st(array, c);
    }
    public static void wrong1st(char[] array, char s){
        int start =0;
        int end = array.length-1;
        int mid = -1;
        while(end>start){
             mid = start+(end-start)/2;
            if(array[mid]==s){
                end = mid;
            }
            else{
            start = mid+1;
            }
        }
        System.out.println(mid);
    }
}

