package exercise;
import java.util.Scanner;
public class Distance {
	public static void main(String[] args) {
		//problem statement:
		//Total distance traveled by a cehicle in t sec is given by 
		// ut+atsquare/2;
		// where u is initial vel(m/s), a is acceleration (m/s2)
		//Write a prog. to evaluate dist.travelled at regular intervals of time, given the
		// flexibility to user to select his own time interval and repeat the calculations for different values of u and a
		//
		double speed,distance,time;
        
		Scanner sc=new Scanner(System.in);
	 
		System.out.println("enter speed in kmph ");
	 
		speed=sc.nextDouble();	
	 
		System.out.println("enter time in hours ");
		
		time=sc.nextDouble();	
	 
		distance=speed*time;
		
		System.out.println("Distance in kilometers= "+distance+"km");
	 
		System.out.println("Distance in meters= "+distance*1000+"m");
	 
	 
	}
}
