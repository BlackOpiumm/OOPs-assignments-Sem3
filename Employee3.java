package Prac3;
import java.util.*;
class Driver{
	String emp_name;
	String emp_id;
	String emp_address;
	String emp_mail;
	String emp_mobileno;
	Scanner sc=new Scanner(System.in);
	Driver(){}
	void accept() {
		System.out.println("Enter Employee Name");
		emp_name=sc.next();
		System.out.println("Enter Employee ID");
		emp_id=sc.next();
		System.out.println("Enter Employee Address");
		emp_address=sc.next();
		System.out.println("Enter Employee Mail ID");
		emp_mail=sc.next();
		System.out.println("Enter Employee Mobile No");
		emp_mobileno=sc.next();
	}
	double grossSalary(double bp) {
		double da=97*bp;da/=100;
		double hra=10*bp;hra/=100;
		double pf=12*bp;pf/=100;
		double cf=0.1*bp;cf/=100;
		double gro=da+hra+bp;	
		return (gro);
		}
	double netSalary(double bp) {
		double da=97*bp;da/=100;
		double hra=10*bp;hra/=100;
		double pf=12*bp;pf/=100;
		double cf=0.1*bp;cf/=100;
		double gros=da+hra+bp-cf-pf;	
		return (gros);
		}
	void display() {
		System.out.println("1.Name"+emp_name);
		System.out.println("2.ID"+emp_id);
		System.out.println("3.Address"+emp_address);
		System.out.println("4.Email ID"+emp_mail);
		System.out.println("5.Mobile No"+emp_mobileno);
	}
}
class prg extends Driver{
	double bp;
	void prge() {
		accept();
		System.out.println("Enter Basic Pay");
		bp=sc.nextDouble();
		double gs=grossSalary(bp);
		double ns=netSalary(bp);
		System.out.println("-----Personal Information of programmer-----");
		display();
		double da=97*bp;da/=100;
		double hra=10*bp;hra/=100;
		double pf=12*bp;pf/=100;
		double cf=0.1*bp;cf/=100;
		System.out.println("--------SALARY STRUCTURE--------");
		System.out.println("BASIC PAY:"+bp);
		System.out.println("DEARNESS ALLOWANCE"+da);
		System.out.println("HUMAN RESOURCE ALLOWANCE:"+hra);
		System.out.println("PROVIDENT FUND:"+pf);
		System.out.println("CLUB FUND:"+cf);
		System.out.println("GROSS SALARY:"+gs);
		System.out.println("NET SALARY:"+ns);
		System.out.println("--------------------END-------------------");
	}
}
class tl extends Driver{
	double bp;
	void tle() {
		accept();
		System.out.println("Enter Basic Pay");
		bp=sc.nextDouble();
		double gs=grossSalary(bp);
		double ns=netSalary(bp);
		System.out.println("-----Personal Information of programmer-----");
		display();
		double da=97*bp;da/=100;
		double hra=10*bp;hra/=100;
		double pf=12*bp;pf/=100;
		double cf=0.1*bp;cf/=100;
		System.out.println("--------SALARY STRUCTURE--------");
		System.out.println("BASIC PAY:"+bp);
		System.out.println("DEARNESS ALLOWANCE"+da);
		System.out.println("HUMAN RESOURCE ALLOWANCE:"+hra);
		System.out.println("PROVIDENT FUND:"+pf);
		System.out.println("CLUB FUND:"+cf);
		System.out.println("GROSS SALARY:"+gs);
		System.out.println("NET SALARY:"+ns);
		System.out.println("--------------------END-------------------");
	}
}
class apm extends Driver{
	double bp;
	void apme() {
		accept();
		System.out.println("Enter Basic Pay");
		bp=sc.nextDouble();
		double gs=grossSalary(bp);
		double ns=netSalary(bp);
		System.out.println("-----Personal Information of programmer-----");
		display();
		double da=97*bp;da/=100;
		double hra=10*bp;hra/=100;
		double pf=12*bp;pf/=100;
		double cf=0.1*bp;cf/=100;
		System.out.println("--------SALARY STRUCTURE--------");
		System.out.println("BASIC PAY:"+bp);
		System.out.println("DEARNESS ALLOWANCE"+da);
		System.out.println("HUMAN RESOURCE ALLOWANCE:"+hra);
		System.out.println("PROVIDENT FUND:"+pf);
		System.out.println("CLUB FUND:"+cf);
		System.out.println("GROSS SALARY:"+gs);
		System.out.println("NET SALARY:"+ns);
		System.out.println("--------------------END-------------------");
	}
}
class pm extends Driver{
	double bp;
	void pme() {
		accept();
		System.out.println("Enter Basic Pay");
		bp=sc.nextDouble();
		double gs=grossSalary(bp);
		double ns=netSalary(bp);
		System.out.println("-----Personal Information of programmer-----");
		display();
		double da=97*bp;da/=100;
		double hra=10*bp;hra/=100;
		double pf=12*bp;pf/=100;
		double cf=0.1*bp;cf/=100;
		System.out.println("--------SALARY STRUCTURE--------");
		System.out.println("BASIC PAY:"+bp);
		System.out.println("DEARNESS ALLOWANCE"+da);
		System.out.println("HUMAN RESOURCE ALLOWANCE:"+hra);
		System.out.println("PROVIDENT FUND:"+pf);
		System.out.println("CLUB FUND:"+cf);
		System.out.println("GROSS SALARY:"+gs);
		System.out.println("NET SALARY:"+ns);
		System.out.println("--------------------END-------------------");
	}
}
public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		prg p=new prg();
		tl t=new tl();
		apm a=new apm();
		pm pro=new pm();
		while(true) {
			System.out.println("Press 1 for Programmer");
			System.out.println("Press 2 for Team Leader");
			System.out.println("Press 3 for Assistant Project Manager");
			System.out.println("Press 4 for Project Manager");
			System.out.println("Press 5 for Exit");
			int ch=sc.nextInt();
			switch(ch){
				case 1:
				{	
					p.prge();
					break;
					
				}
				
				case 2:
				{	
					t.tle();
					break;
				}
				case 3:
				{	
					a.apme();
					break;
					
				}
				case 4:
				{	
					pro.pme();
					break;
					
				}
				case 5:
				{
					System.out.println("-------EXIT-------");
					break;
				}
				
				
			}
			
		}
}

}