package code.container;

public class Apple {
	private static long counter;
	private final long id = counter++;
	public long id(){
		return id;
	}
}
