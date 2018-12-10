package BankAccountApp;

public class Account {

	
	private long accountId;
	protected String AccountHolder;
	private static long account_id = 1000;
	private Checkings checkings;
	private Savings savings;
	private static String BANK = "WellsFargo";
	
		
	public Account(){
		checkings =new Checkings();
		savings = new Savings();
		account_id++;
		accountId = account_id;
		
		//System.out.println("Account");
				
	}
	
	
	public void DepositToCheckings(double a) {
		
		checkings.deposit(a);
		
	}
	public void DepositToSavings(double b) {
		savings.deposit(b);
		
	}
	public void withdrawFromCheckings(double c) {
		checkings.withdraw(c);
		
	}
	public void withdrawFromSavings(double d) {
		savings.withdraw(d);
	}
	
	public void transferToCheckings(double e) { // состоит из уже описанных методов
		//withdraw из savingd  и deposit to checkings
		
		if(savings.withdraw(e) == true)	
		
		checkings.deposit(e);	
		
		
		
	}
	
	public void transferToSavings(double f) {
		if(checkings.withdraw(e) == true)	
			
			checkings.deposit(e);	
	}
	
}
	
		
	
		
		
		
	
	
	
	
	
	
	
	
	

