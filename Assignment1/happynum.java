public class happynum {
    public static void main(String[] args) {
    /*
    Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
     */
        19
    }
    static boolean Happy(int num){
    if(num==0||num<0){
        return false;
    }
    int sum=0; int rem =0;
    do{
        
        rem = num%10;
        sum = sum*10+(rem*rem);
        num = num/10;

    }while(num!=1);
    
    


    return false;
    }
}