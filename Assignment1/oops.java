public class oops {
    class rectangle{
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
}
