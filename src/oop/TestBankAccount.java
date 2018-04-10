package oop;

import java.util.HashSet;

public class TestBankAccount
{
	public static void main(String[] args) 
	{
		BankAccount emp1 = new BankAccount(23);
		BankAccount emp2 = new BankAccount(24);
		BankAccount emp3 = new BankAccount(25);
		BankAccount emp4 = new BankAccount(26);
		BankAccount emp5 = new BankAccount(27);
		HashSet<BankAccount> hs = new HashSet<BankAccount>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		
		System.out.println("HashSet Size--->>>"+hs.size());
		System.out.println("hs.contains( new BankAccount(25))--->>>"+hs.contains(new BankAccount(25)));
		System.out.println("hs.remove( new BankAccount(24)--->>>"+hs.remove(emp2));
		System.out.println("Now HashSet Size--->>>"+hs.size());
		System.out.println("hs.contains( new BankAccount(24))--->>>"+hs.contains(new BankAccount(24)));
	}
}
