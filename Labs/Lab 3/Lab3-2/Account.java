
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	public java.util.Date getDateCreated() {
		return dateCreated;
	}


	//default
	public Account(){
	
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		
	}

	
	public Account(int id, double initialBalance){
		this.id = id;
		balance = initialBalance;
	}
	
	public double getMonthlyInterestRate()	
	{
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;  //returns monthly interest rate
	}
	
	public double getMonthlyInterest()
	{	
		double monthlyInterest = (balance * (getMonthlyInterestRate())) / 100;
		return monthlyInterest;

	}
	
	public double withdraw(double withdrawlAmount)
	{
		balance = balance - withdrawlAmount;
		return balance;
	}
	
	public double deposit(double depositAmount)
	{
		balance = balance + depositAmount;
		return balance;
	}
	
}
