package oop;

import basics.IRate;

public class CDAccount extends BankAccount implements IRate{

	@Override
	public void setRate() {
		System.out.println("Setting Rate in " + this.getClass().getName());
		
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		
	}

}
