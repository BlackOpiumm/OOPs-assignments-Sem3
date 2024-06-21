package Prac1;
import java.util.*;
public class Complex {
    int real,img;
    Scanner sc= new Scanner(System.in);
    //constructor
    Complex(){
    	real=0;img=0;
    }
    //input
    public void input() {
    	System.out.println("Enter the value of real part");
    	real=sc.nextInt();
    	System.out.println("Enter the value of imaginary part");
    	img=sc.nextInt();
    }
    //Addition
    public void sum(Complex obj2) {
    	int sum_real=this.real+obj2.real;
    	int sum_img=this.img+obj2.img;
    	System.out.println("Addition of complex is"+sum_real+"+"+sum_img+"i");
    }
    //Subtraction
    public void sub(Complex obj2) {
    	int sub_real=this.real-obj2.real;
    	int sub_img=this.img-obj2.img;
    	System.out.println("Subtraction of complex is"+sub_real+"+"+sub_img+"i");
    }
    //Multiplication
    public void mul(Complex obj2) {
    	int mul_real=this.real*obj2.real-this.img*obj2.img;
    	int mul_img=this.real*obj2.real+this.img*obj2.img;
    	System.out.println("Multiplication of complex is"+mul_real+"+"+mul_img+"i");
    }
    //Division
    public void div(Complex obj2) {
    	int denom=obj2.real*obj2.real+obj2.img+obj2.img;
    	int re=this.real*obj2.real+this.img*obj2.img;
    	int im=this.real*obj2.real+this.img*obj2.img;
    	int div_real=re/denom;
    	int div_img=im/denom;
    	System.out.println("Division of complex is"+div_real+"+"+div_img+"i");
    }
    
	public static void main(String[] args) {
		Complex obj1=new Complex();
		Complex obj2=new Complex();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("---Complex Calculator---");
			System.out.println("1.INPUT");
			System.out.println("2.ADDITION");
			System.out.println("3.SUBTRACTION");
			System.out.println("4.MULTIPLICATION");
			System.out.println("5.DIVISON");
			System.out.println("6.EXIT");
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				  System.out.println("Enter Complex 1");
				  obj1.input();
				  System.out.println("Enetr Complex 2");
				  obj2.input();
				  while(obj2.real==0&&obj2.img==0) {
					  System.out.println("Reenter Complex 2");
					  obj2.input();
				  }
				  break;
			case 2:
				  obj1.sum(obj2);
				  break;
			case 3:
				  obj1.sub(obj2);
				  break;
			case 4:	
				  obj1.mul(obj2);
				  break;
			case 5:
				  obj1.div(obj2);
				  break;
			case 6:
				System.out.println("---EXIT---");
				break;
			}
		}while(choice!=6);

	}

}
