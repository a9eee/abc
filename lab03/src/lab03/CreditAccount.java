package lab03;

public class CreditAccount extends bankaccount {
	CreditAccount(int AccountNumber, String title, double balance) 
	{
		super(AccountNumber, title, balance);
		
	}


	int	creditLimit=10000;


	public int withdrawal(int a) {
	if (a>creditLimit)
	System.out.println("exceed limit");
	else
	{	
	creditLimit=creditLimit-a;
	}
	return(creditLimit)	;

}
	}
