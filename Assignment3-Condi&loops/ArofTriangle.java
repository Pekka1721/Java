import java.util.Scanner;
public class ArofTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//triangle
		
//		float breadth = input.nextFloat();
//		float height = input.nextFloat();
//		float area = 0.5f*(breadth*height);
//		System.out.println(area);
		
		//area of isosceles triangle
		//same as the triangle 
		
		// area of parallelogram 
		
//		float b = input.nextFloat();
//		float h = input.nextFloat();
//		float a = b*h;
//		System.out.println(a);
//		
		// area of rhombus 
//		float d1 = input.nextFloat();
//		float d2= input.nextFloat();
//		System.out.print(d1*d2);
//	

		//area of equilateral
		 float side = input.nextFloat();
		 float area = (1.73f*(side*side))/4;
		 System.out.print(area);
	}
}
