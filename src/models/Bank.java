package models;
import java.util.Random;

public class Bank {
	private String accountNumber;
	private double checkings;
	private double savings;
	private static int numOfAccounts;
	
	private static String createAccount() {
		StringBuilder account = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			account.append(random.nextInt(10));
		}
		return account.toString();
	}
	public Bank() {
		// TODO Auto-generated constructor stub
		numOfAccounts += 1;
		this.accountNumber = Bank.createAccount();
		this.savings = 0;
		this.checkings = 0;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getCheckings() {
		return checkings;
	}
	public void setCheckings(double checkings) {
		this.checkings = checkings;
	}
	public double getSavings() {
		return savings;
	}
	public void setSavings(double savings) {
		this.savings = savings;
	}
    public void deposit(double money, String account) {
        if (account.equals("savings")) {
            savings += money;
        }
        if (account.equals("checkings")) {
            checkings += money;
        }
    }
    public String withdraw(double money, String account) {

        if ((account.equals("savings")) && (this.getSavings() > money)) {
            this.savings -= money;
        }
        if ((account.equals("savings")) && (this.getSavings() < money)){
            System.out.println( "Not enough available to withdraw");}
         if ((account.equals("checkings")) && (this.getCheckings() > money)) {
            this.checkings -= money;
        }
        if ((account.equals("checkings")) && (this.getCheckings() < money)) {
            System.out.println("Not enough available to withdraw");
        }
        return "Withdrawl Successful!";
    }
        
	public void bankAccount() {
		System.out.println("Total Checkings : " + this.getCheckings());
		System.out.println("Total Savings : " + this.getSavings());
	}
	public static int howManyAccounts() {
		System.out.println(numOfAccounts);
		return numOfAccounts;
	}
}
