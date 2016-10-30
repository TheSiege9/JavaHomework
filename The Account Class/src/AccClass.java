public class AccClass {
  public static void main (String[] args) {
	Account account = new Account(1122, 20000);
    Account.setAnnualInterestRate(4.5);
    
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("Balance is " + account.getBalance(0));
    System.out.println("Monthly interest is " +
      account.getMonthlyInterest(0));
    System.out.println("This account was created at " +
      account.getDateCreated());
  }

}