package lab2;

import java.util.Random;

public class Student {
	
	private String name;
	private String ssn;
	private static int ID = 100;
	private String email;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private Double ballance = 0.00;
	
	private final static String emaiExt = "@student.edu";
	
	public Student() {
	}
	
	public Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public void enroll	() {
		setEmail();
		setUserID(ID++);
	}
	
	public void pay(double payment) {
		this.ballance = ballance + payment; 
	}
	
	public double checkBalance() {
		return ballance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public static int getID() {
		return ID;
	}
	public static void setID(int iD) {
		ID = iD;
		
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		this.email = name + emaiExt;
	}
	public String getUserID() {
		return "" + userID;
	}
	
	public void setUserID(int ID) {
		userID = String.valueOf(ID);
		Random rand = new Random();
		int value = 1000 + rand.nextInt(8000);
		userID = userID + "-" + value + "-"+ this.ssn.substring(7);
	
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
