package Prac4;
import java.util.*;
abstract class Driver{
	protected double height;
	protected double width;
	Scanner sc=new Scanner(System.in);
    //Constructor
	Driver(){
		height=0;
		width=0;
	}
	abstract void getDim();
	abstract void computArea();
}
//Circle
class Circle extends Driver{
	public void getDim() {
		System.out.println("Enter circle's dimensions:");
		System.out.println("Enter radius");
		height=sc.nextDouble();
	}
	void computArea() {
		System.out.println("Area of circle is:"+height*height*3.14+"sq.units");
	}
}
//Rectangle
class Rectangle extends Driver{
	public void getDim() {
		System.out.println("Enter Rectangle's dimensions:");
		System.out.println("Enter height");
		height=sc.nextDouble();
		System.out.println("Enter width");
		width=sc.nextDouble();
	}
	void computArea() {
		System.out.println("Area of Rectangle is:"+height*width+"sq.units");
	}
}
//Triangle
class Triangle extends Driver{
	public void getDim() {
		System.out.println("Enter Triangle's dimensions:");
		System.out.println("Enter height");
		height=sc.nextDouble();
		System.out.println("Enter base");
		width=sc.nextDouble();
	}
	void computArea() {
		System.out.println("Area of Triangle is:"+(width*height)/2+"sq.units");
	}
}
public class Shape {
	public static void main(String[] args) {
		Circle c=new Circle();
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		
    while(true) {
    	System.out.println("---AREA CALCULATOR---");
    	System.out.println("1.Area of Rectangle");
    	System.out.println("2.Area of Circle");
    	System.out.println("3.Area of Triangle");
    	System.out.println("--4.Invalid choice--");
    	int choice;
    	System.out.println("Enter Choices");
    	choice=sc.nextInt();
    	
    	switch(choice) {
    	case 1:
    		r.getDim();
    		r.computArea();
    		break;
    	case 2:
    		c.getDim();
    		c.computArea();
    		break;
    	case 3:
    		t.getDim();
    		t.computArea();
    		break;
    	case 4:
    		System.out.println("4.Invalid choice");
    		break;	
    	}
    	
      }
   }   

}
