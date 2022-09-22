public class oops {
     static class rectangle{
       int length;
       int width;       //instance variables or member variables
       
        void getValues(int x , int  y ){ //method to get values using parameters and assignin to memeber variables;
            length = x;
            width = y;
        }


        int area(){       //method inside class without parameters and performing operation on the data 
        int a =length*width;
        return a;
       }

    }
    public static void main(String[] args) {
        //creating objects for the class rectangle
        rectangle calc1 =new   rectangle();
        calc1.getValues(6, 4);
        int ans = calc1.area();
        System.out.print(ans);
    }    
}
