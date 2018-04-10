package lab2;

import java.text.DecimalFormat;

public class StudentDb {

	static String courses[] = {"Math", "Literature", "Java" };
	
	public static void main(String[] args) {
	
    showCourses();
    
    Student st1 = new Student("vladimir", "111-11-1111");
    Student st2 = new Student("donald", "222-22-2222");
 
    DecimalFormat df2 = new DecimalFormat(".##");
    
     st1.enroll();
     st1.setPhone("860-111-1111");
     st1.setCity("Boston");
     st1.setState("MA");
     st1.pay(999.75);
     st1.pay(666.11);
     
     st2.enroll();
     st2.setPhone("718-333-3333");
     st2.setCity("Riga");
     st2.setState("Latvia");
     st2.pay(777.55);
  
     
     System.out.println("\n================================");
     
     System.out.println(st1.getEmail());
     System.out.println("User ID: " + st1.getUserID());
     System.out.println("StudentPhone: " + st1.getPhone());
     System.out.println(st1.getCity() + ", " +  st1.getState());
     System.out.println("The ballance is: $" + df2.format(st1.checkBalance()));
     
     System.out.println("\n================================");
     
     System.out.println(st2.getEmail());
     System.out.println("User ID: " + st2.getUserID());
     System.out.println("StudentPhone: " + st2.getPhone());
     System.out.println(st2.getCity() + ", " +  st2.getState());
     System.out.println("The ballance is: $" + df2.format(st2.checkBalance()));
	}
	
	static void showCourses() {
		System.out.print("The courses are: ");
		for( String s: courses) {
	 		System.out.print(", " + s);
	 	}
		
	}
}
