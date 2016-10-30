import java.util.*;

public class Account {

	int id = 0;
	double balance = 0;
	static double annualInterestRate = 0;
	Date dateCreated = new Date();
	
	Account() {

	} 
	
	public Account(int newID, double newBalance){
	id = newID;
	balance = newBalance;	
	}
	
	public static double setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
		return annualInterestRate;
	}
	
	public double deposit(int i){
		balance = balance + i;
		return balance;
	}
	public double withdraw(int i) {
		balance = balance - i;
		return balance;
	}
	public Date getDateCreated() {
		Date date = dateCreated;
		return date;
	}

	public double getBalance(double i) {
		i = balance;
		return i;
	}

	public double getMonthlyInterest(double interest) {
		interest = annualInterestRate / 12;
		return interest;
	}
} 