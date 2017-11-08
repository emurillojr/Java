
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account idOne = new Account(1122, 20000.00);
		java.util.Date dateCreated = idOne.getDateCreated();
		dateCreated = new java.util.Date();
		// dateCreated.setTime(200000); test
		idOne.setAnnualInterestRate(4.5);
		idOne.withdraw(2500.00);
		idOne.deposit(3000.00);

		System.out.println("Balance is " + idOne.getBalance()); // 20500
		System.out.println("Monthly interest is " + idOne.getMonthlyInterest());
		System.out.println("This account was created at  " + dateCreated); // now todays date, time, year
	}
}
