package mortgage_calculator;

public class Calculator {

	public static void main(String[] args) {
		Account.Deposit(23000);
		Account.Withdraw(2500);
		
		Account.GetAnnualIntrest();
		Account.GetAnnualInterestRate();
		
		Account.GetMonthlyInterest();
		Account.GetMonthlyInterestRate();
		
		
		Account.printBalance();
		Account.printDate();
		Account.printID();
		
		
		
	}

}
