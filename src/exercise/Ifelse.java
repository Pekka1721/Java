package exercise;

public class Ifelse {
    //even odd using the  if else 
    public static void main(String[] args){
        int[] number ={50,65,56,71,81};
        int even =0;
        int odd =0;
        for(int index = 0;index<number.length;index++){
            if(index%2==0){
                    even++;
            }
            else{
                odd++;
            }
           
    } System.out.println("Even "+even+" Odd "+ odd);
        }
}
