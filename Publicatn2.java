package Prac2;
import java.util.*;
class Driver{
	String title;
	int  price;
	int copies;
	Scanner sc=new Scanner(System.in);
	static int totalBookssold,totalMagsold,booksWorth,magWorth;
	Driver(){
		totalBookssold=0;
		totalMagsold=0;
		booksWorth=0;
		magWorth=0;
	}
	void sellcopy() {
		System.out.println("No. of publication sold"+(totalBookssold+totalMagsold));
		System.out.println("Total Cost of Publication sold"+(booksWorth+magWorth));
		System.out.println("No. of Books sold"+totalBookssold);
		System.out.println("Total Cost of Books sold"+booksWorth);
		System.out.println("No. of Magazines sold"+totalMagsold);
		System.out.println("Total Cost of Magazines sold"+magWorth);
	}
};
class Books extends Driver{
	String author;
	int totalSold=0;
	Books(){}
	Books(String a,int b,int c){
		title=a;
		price=b;
		copies=c;
	}
	void getauthor(String a) {
		author=a;
	}
	void ordercopies(int n) {
		if(n>copies) {
			System.out.println(copies+"copies left!!!..Restock");
		}
		else {
			copies-=n;
			totalSold+=n;
			totalBookssold+=totalSold;
			booksWorth=n*price;
			System.out.println("Total copies ordered:"+n);
			System.out.println("total price:"+n*price);
			System.out.println("--Order Placed Successfully--");
		}
	}
	void Restock(int n) {
		copies+=n;
		System.out.println(n+"copie added to the stock");
		System.out.println("Total copies in stock:"+copies);
	}
	void sellCopy() {
		System.out.println("Total Books sold"+totalSold);
		System.out.println("Books sold Worth"+totalSold*price);
	}
};

class Mag extends Driver{
	String currentIssue;
	int totalSold=0;
	Mag(){}
	Mag(String a,int b,int c){
		title=a;
		price=b;
		copies=c;
	}
	void getcurrentIssue(String a) {
		currentIssue=a;
	}
	void ordercopies(int n) {
		if(n>copies) {
			System.out.println(copies+"copies left!!!..Restock");
		}
		else {
			copies-=n;
			totalSold+=n;
			totalMagsold+=totalSold;
			magWorth=n*price;
			System.out.println("Total copies ordered:"+n);
			System.out.println("total price:"+n*price);
			System.out.println("--Order Placed Successfully--");
		}
	}
	void Restock(int n) {
		copies+=n;
		System.out.println(n+"copie added to the stock");
		System.out.println("Total copies in stock:"+copies);
	}
	void sellCopy() {
		System.out.println("Total Magzines sold"+totalSold);
		System.out.println("Magzines sold Worth"+totalSold*price);
	}
};
public class Publicatn {
	public static void main(String[] args) {
		Driver p= new Driver();
		Books b= new Books();
		Mag m=new Mag();
		Scanner sc=new Scanner(System.in);
		String title;
		int price;
		int copies;
		String author;
		String currentIssue;
		int ord,res;
    while(true){
    	System.out.println("---PUBLICATION---");
    	System.out.println("1.ADD Book");
    	System.out.println("2.ADD Magazine");
    	System.out.println("3.Order Book");
    	System.out.println("4.Order Magazine");
    	System.out.println("5.Restock Book");
    	System.out.println("6.Restock Magazines");
    	System.out.println("7.Sale of Books");
    	System.out.println("8.Sale of Magazines");
    	System.out.println("9.Sale of Publication");
    	int choice;
    	choice=sc.nextInt();
    	switch(choice) {
    	case 1:
    		System.out.println("Enter Title");
    		title=sc.next();
    		System.out.println("Enter Price");
    		price=sc.nextInt();
    		System.out.println("Enter Copies");
    		copies=sc.nextInt();
    		System.out.println("Enter author");
    		author=sc.next();
    		b= new Books(title,price,copies);
    		b.getauthor(author);
    		break;
    	case 2:
    		System.out.println("Enter Title");
    		title=sc.next();
    		System.out.println("Enter Price");
    		price=sc.nextInt();
    		System.out.println("Enter Copies");
    		copies=sc.nextInt();
    		System.out.println("Enter CurrentIssue");
    		currentIssue=sc.next();
    		m= new Mag(title,price,copies);
    		m.getcurrentIssue(currentIssue);
    		break;
    	case 3:
    		System.out.println("Enter the no. of books you want to order");
    		ord=sc.nextInt();
    		b.ordercopies(ord);
    		break;
    	case 4:
    		System.out.println("Enter the no. of magazines you want to order");
    		ord=sc.nextInt();
    		m.ordercopies(ord);
    		break;	
    	case 5:
    		System.out.println("Enter the no. of books you want to restock");
    		res=sc.nextInt();
    		b.Restock(res);
    		break;
    	case 6:
    		System.out.println("Enter the no. of magazines you want to restock");
    		res=sc.nextInt();
    		m.Restock(res);
    		break;	
    	case 7:
    		b.sellCopy();
    		break;
    	case 8:
    		m.sellCopy();
    		break;
    	case 9:
    		p.sellcopy();
    		break;
    	default:
    		System.out.println("Invalid Input");
    	}
	}
}
}