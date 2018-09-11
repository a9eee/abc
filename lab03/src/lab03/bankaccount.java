package lab03;

import java.util.Scanner;

    public class bankaccount {
	private static int AccountNumber;
	private String title;
	private double balance;  
	 
	bankaccount(int AccountNumber,String title,double balance){
		
		this.AccountNumber=AccountNumber;
		this.title=title;
		this.balance=balance;
		
		
	}
	
 double withdrawal(double balance) {
	double a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the money you want to withdrawl");
	a=sc.nextDouble();
	if(a<=balance) {
		System.out.println("you have withdrawl:"+a);
		balance=balance-a;
		System.out.println("your remaining balance is:"+balance);
	}
	else {
		System.out.println("you have not enough balance");
	}
	
	return balance;
	
	
}
	
}
