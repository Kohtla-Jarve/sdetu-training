package basics;

public interface IRate{
	
	public void setRate();
	
	public void increaseRate();
	public default String decreaseRate() {
		return "Interface returns";
		}
}

