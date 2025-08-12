package com.hansin;
abstract class BankAccount{
	abstract void calculateInterest();	
	void showBalance() {
		System.out.println("Showing Balance");
	}
}
class SavingAccount extends BankAccount{
	public void calculateInterest() {
		System.out.println("Interest For Savings Account Is 4%");
	}	
}
   class FixedDepositAccount extends BankAccount{
    public void calculateInterest() {
   	 System.out.println("Interest For Fixes Deposit  Account Is 6.5%"); 
    }
   }
class Abstract_Class_Methods {
	public static void main(String[] args) {
		BankAccount acc1=new SavingAccount();
		BankAccount acc2=new FixedDepositAccount();
		acc1.showBalance();
		acc1.calculateInterest();	
		acc2.showBalance();
		acc2.calculateInterest();
	}
}
