// Object Class
//Gaines
public class BankAccount {
	
	private double amount;
	private String accountNum;
	
	public BankAccount()
	{
		amount = 200;
		accountNum = "123ABC";
	}
	public BankAccount(double a)
	{
		if (a < 200)
			a = 200;
		amount = a;
		accountNum = "123ABC";
	}
	public BankAccount(double amount, String accountNum)
	{
		if (amount < 200)
			amount = 200;
		this.amount = amount;
		this.accountNum = accountNum;
	}
	public void deposit(double a)
	{
		amount =  amount + a;
		//amount += a;
	}
	public void withdraw(double w)
	{
		if (amount - w >= 0)
		   amount = amount - w;
	}
	public String getInfo()
	{
		return "$" + amount + " in account Number ***" + accountNum.substring(3);
	}
	
	public String getAccountNum()
	{
		return accountNum;
	}
	public double getAmount()
	{
		return amount;
	}
	public void setAccountNum(String accNum)
	{
		accountNum = accNum;
	}

}
