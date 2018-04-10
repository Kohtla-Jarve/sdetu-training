package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		new BankAccount();
		new BankAccount();
		new BankAccount();	
	}

}


class BankAccount {
	private static int ID = 1000;
	
	
 public BankAccount() {
	 ID ++;
	 setAccount();
	 
 }
 
 public void setAccount() {
	 System.out.println(ID);
 }
 
}