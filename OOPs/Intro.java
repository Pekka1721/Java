public class Intro{
static class Student{ 
                          //Creating student class
            int rollno;     //to assign values  one by one this part of code will be invoked
            String name;
            float marks;
            
            Student(){
                int rollno;
                String name;
                float marks;
            }

            Student(int rollno,int marks,String name){
                this.rollno = rollno;
                this.marks = marks;
                this.name = name;
            }

    }
     public static void main(String[] args) {
        
   
    Student stud1 = new Student();              //creating object   of student class (instance of class)
        stud1.rollno = 206;
        stud1.name= "Rajender";
        stud1.marks = 70.0f;

        Student one = new Student(1, 90, "Gixxer");
        System.out.println(one.name);
        Student student2 = new Student();          //default constructor
    }
     
}
