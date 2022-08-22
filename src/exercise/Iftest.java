package exercise;

/*If the value of weight<50 and height is >170 the increment count by 1;
 */
public class Iftest {
    public static void main(String[] args){
        float[] weight ={45.0F,55.0F,47.0F,51.0F,54.0F};
        float[] height ={176.5f,174.2f,168.0f,170.0f,169.0f};
        int count=0;
        int count1=0;
        for(int index=0;index<weight.length;index++){
        if(weight[index]<50&&height[index]>170){
            count++;
        }
        
        count1++;
        
        
        }
        int count2 = count1-count;
        System.out.println("Students Weight and height passed in test : "+count+"  Total Students : "+ count1 +"   Not passed in the Test: "+count2);
    }
}
