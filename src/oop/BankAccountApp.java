package oop;

import basics.IRate;

public class BankAccountApp {

	public static void main(String[] args) {
		{
			BankAccount ba1 = new BankAccount();
			ba1.accountNumber = "23423423423";
		
			BankAccount ba3 = new BankAccount();
			ba1.deposit(1500);
			ba1.deposit(1500);
			ba1.deposit(1500);
			ba1.withdraw(2000);
		
			
			// System.out.println(BankAccount.routingNumber);
			// System.out.println(ba2.routingNumber);
			ba3.ballance = 1;
			System.out.println(ba3.checkBallance());
			
			CDAccount cda = new CDAccount();
			cda.ballance = 2;
			System.out.println("CDA :" + cda.checkBallance());
			
			IRate polymorphicBA = new BankAccount();
			IRate polymorphicCD = new CDAccount();
			polymorphicBA.setRate();
			polymorphicCD.setRate();
			System.out.println(polymorphicBA.decreaseRate());

			
		}

	}

}




//BankAccount emp1 = new BankAccount(23);
//System.out.println("Overridden hashCode()--->>>"+emp1.hashCode());
//int originalHashCode = System.identityHashCode(emp1);
//System.out.println("Original hashCode of Emp---->>>"+originalHashCode);
//BankAccount emp2 = new BankAccount(23);
//System.out.println("Overridden hashCode()--->>>"+emp2.hashCode());
//int originalHashCode2 = System.identityHashCode(emp2);
//System.out.println("Original hashCode of Emp2---->>>"+originalHashCode2);
//System.out.println("emp1.equals(emp2)--->>>"+emp1.equals(emp2));