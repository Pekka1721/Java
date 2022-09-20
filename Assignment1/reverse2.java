import java.util.Scanner;
public class reverse2{
    //Question from Unstop [Good Pudding]
    public static void main(String[] args){
       Scanner scanVal =new Scanner(System.in);
       System.out.println("Enter no TestCase: ");
        int testCase = scanVal.nextInt();
        int Num ;
        if(testCase==0){                    //if testcases = 0 exit and print Exit
           System.out.println("Exit");
        }
        else{
            for(int i =1;i<=testCase;i++){          //looping to run no of test cases 
                Num = scanVal.nextInt();
                int swap1= swap(Num);               //Swapping for the first time
                int swap2 = swap(swap1);            //swapping for the second time
                if(swap2==Num){                     //checking for the swap2 and original is same
                        System.out.println(1);      //if same printing 1 = challenge accepted or 0 to challenge no accepted
                    }
                    else{
                        System.out.println(0);
                    }
        }
            }
                                                       
        }
        
    
        public static int swap(int num){
            int temp = num;
            int rem;
            int revNum = 0;
            while(temp>0){
                rem = temp%10;
                revNum = (revNum*10)+rem;
                temp = temp/10;
            }
            return revNum;
        }
      

}