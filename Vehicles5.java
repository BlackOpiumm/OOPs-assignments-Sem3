package Prac5;
import java.util.*;
interface Driver{
	void gearChange(int a);
	void speedUp();
	void applyBreak();
	void display();
}
//Bicycle Class
class bicycle implements Driver{
	Scanner sc=new Scanner(System.in);
	int gear,speed;
	bicycle(){
		System.out.println("Bicycle started successfully");
		gear=1;
		speed=10;
	}
	public void gearChange(int gearx) {
		if(gearx<7&&gearx>0){
			gear=gearx;
			System.out.println("gear changed to"+gear);
		}
		else {
			System.out.println("gear is out of range");
		}
	}
	public void speedUp() {
		if(speed+5<50) {
			speed+=5;
			System.out.println("speed changes to"+speed);
		}
		else {
			System.out.println("Speed cannot go above 50");
		}
	}
	@Override
	public void applyBreak() {
		System.out.println("press 1.Decrease speed\npress 2.Stop Vehicle");
		System.out.println("Enter Choice");
		int choice;
		choice=sc.nextInt();
		
		if(choice==1) {
			if(speed-5>0) {
				speed-=5;
				System.out.println("speed is reduced to"+speed);
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Bicycle Stopped");
			}
		}
		else if(choice==2) {
			speed=0;
			gear=0;
			System.out.println("Bicycle Stopped");
		}
		
	}
	public void display() {
		System.out.println("Your Bicycle speed is"+speed+"\nYour Bicycle gear is"+gear);
	}
}

//Bike Class
class bike implements Driver{
	Scanner sc=new Scanner(System.in);
	int gear,speed;
	bike(){
		System.out.println("Bike started successfully");
		gear=1;
		speed=10;
	}
	public void gearChange(int gearx) {
		if(gearx<7&&gearx>0){
			gear=gearx;
			System.out.println("gear changed to"+gear);
		}
		else {
			System.out.println("gear is out of range");
		}
	}
	public void speedUp() {
		if(speed+10<150) {
			speed+=10;
			System.out.println("speed changes to"+speed);
		}
		else {
			System.out.println("Speed cannot go above 150");
		}
	}
	@Override
	public void applyBreak() {
		System.out.println("press 1.Decrease speed\npress 2.Stop Vehicle");
		System.out.println("Enter Choice");
		int choice;
		choice=sc.nextInt();
		if(choice==1) {
			if(speed-10>0) {
				speed-=10;
				System.out.println("speed is reduced to"+speed);
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Bike Stopped");
			}
		}
		else if(choice==2) {
			speed=0;
			gear=0;
			System.out.println("Bike Stopped");
		}
		
	}
	public void display() {
		System.out.println("Your Bike speed is"+speed+"\nYour Bike gear is"+gear);
	}
}

//car Class
class car implements Driver{
	Scanner sc=new Scanner(System.in);
	int gear,speed;
	car(){
		System.out.println("car started successfully");
		gear=1;
		speed=10;
	}
	public void gearChange(int gearx) {
		if(gearx<7&&gearx>0){
			gear=gearx;
			System.out.println("gear changed to"+gear);
		}
		else {
			System.out.println("gear is out of range");
		}
	}
	public void speedUp() {
		if(speed+15<200) {
			speed+=15;
			System.out.println("speed changes to"+speed);
		}
		else {
			System.out.println("Speed cannot go above 200");
		}
	}
	@Override
	public void applyBreak() {
		System.out.println("press 1.Decrease speed\npress 2.Stop Vehicle");
		System.out.println("Enter Choice");
		int choice;
		choice=sc.nextInt();
		if(choice==1) {
			if(speed-15>0) {
				speed-=15;
				System.out.println("speed is reduced to"+speed);
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Car Stopped");
			}
		}
		else if(choice==2) {
			speed=0;
			gear=0;
			System.out.println("Car Stopped");
		}
		
	}
	public void display() {
		System.out.println("Your Car speed is"+speed+"\nYour Car gear is"+gear);
	}
}
public class Vehicle {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Driver v=null;
    int choice1,choice2;
    bb:
    	do {
    		System.out.println("press 1.Bicycle\npress 2.Bike\npress 3.Car\npress 4.EXIT");
    		choice1=sc.nextInt();
    		if(choice1==1) {
    			v=new bicycle();
    		}
    		else if(choice1==2) {
    			v= new bike();
    		}
    		else if(choice1==3) {
    			v=new car();
    		}
    		else if(choice1==4) {
    			break bb;
    		}
    		else {
    			System.out.println("Invalid Input");
    		}
    		if(choice1>0&&choice1<4)
    			aa:
    				do {
    					 System.out.println("\t\npress  1.speed up\t\n press 2.gear up \t\n press 3. apply brake\t\n 4.display vehicle \t\npress 5. change vehicle \t\npress 6.exit\t\n");    
    			           choice2=sc.nextInt();
    					switch(choice2) {
    					
    					case 1:
    						v.speedUp();
    						break;
    					case 2:
    						System.out.println("which gear to choose ");
    						int a;
    						a=sc.nextInt();
    						v.gearChange(a);
    					case 3:
    						v.applyBreak();
    						break;
    					case 4:
    						v.display();
    						break;
    						
    					case 5:
    						break aa;
    					
    					
    					 default:
    		                 System.out.println("invalid input");
    				}
    					
    					
    				}while(true);
    	}while(choice1!=4);
	}

}
