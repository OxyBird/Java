package BankAccountApp;

public class Savings {

private double balance;
	
	public Savings() {
		balance = 1; //присваиваем балансу 1 доллар от счастья
		
	}
	public void deposit(double x) {
		balance = balance + x;
		System.out.println("Your current balance is : " + balance);		
		}
	
	public boolean withdraw(double y){
		boolean result;
		
		if(balance >= y) 
		{				
		balance = balance - y;
		System.out.println("Your withdrawal is succsessful. Your current balance is : " + balance);
		result = true;
		}
		else 
		{
			System.out.println("Not enought money on your account");
			result = false;
				
		}
		
		return result;
	}
}
