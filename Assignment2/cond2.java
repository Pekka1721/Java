package Assignment2;

public class cond2 {
    public static void main(String[] args) {
        
    
    //count nums 
    // int n = 1385757897;
    // int count = 0;
    // while(n>0){
    //     int rem = n%10;
    //     if(rem==7){
    //         count++;   
    //     }
    //     n =n/10;
        
    // }
    // System.out.println(count);
    int n = 79532;
    int rev = 0;
    while(n>0){
        int rem = n%10;
        rev = (rev*10)+rem;
        n =n/10;
    }
    System.out.println(rev);
}
}
