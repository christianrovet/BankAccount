package models;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank christian = new Bank();
        Bank bob = new Bank();
        christian.deposit(20020,"savings");
        christian.deposit(10025,"checkings");
        christian.withdraw(1050,"savings");
        christian.withdraw(100,"checkings");
        christian.bankAccount();
        bob.withdraw(1050,"savings");
	}
}
