package BankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Individual Ind = new Individual("Иванов Иван");
		
		Corporate Corp = new Corporate("OOO Microsoft");
		
		Ind.DepositToSavings(1000.0);
		//Corp.DepositToCheckings(500);
		
		//Corp.withdrawFromCheckings(1);
		
		Ind.transferToCheckings(300);
		Ind.DepositToSavings(500);
		
	}
	
	

}
