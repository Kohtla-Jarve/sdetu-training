package oop;

import basics.IRate;

public class BankAccount implements IRate {
	String accountNumber;
	@SuppressWarnings("unused")
	private static final String routingNumber = "670877608760";
	String name;
	String ssn;
	String accountType;
	int age;
	double ballance;
	
	public BankAccount() {}
	
	public BankAccount( int age )
	{
		super();
		this.age = age;
	}
	public void deposit(double amount) {
		ballance = ballance + amount;	
		showActivity("DEPOSIT");
	}
	
	public void withdraw(double amount) {
		ballance = ballance - amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: "  + activity);
		System.out.println("Your new ballance is: "  + ballance);
	}
	
	
	public int hashCode()
	{
		return age;
	}
	
	public boolean equals( Object obj )
	{
		boolean flag = false;
		BankAccount emp = ( BankAccount )obj;
		if( emp.age == age )
			flag = true;
		return flag;
	}
	
	double checkBallance(){
		return ballance;
		
	}

	@Override
	public void setRate() {
		System.out.println("Setting Rate in Bank Account");
		
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		
	}


}
