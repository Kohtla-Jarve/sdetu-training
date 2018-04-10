package basics;

public abstract class Abstraction extends java.lang.Object{

	public static String abstractPrint() {
		System.out.println("Abstract talking");
		return "abstract returns"; 
	}
	
	public abstract void abstractMethod();
}
