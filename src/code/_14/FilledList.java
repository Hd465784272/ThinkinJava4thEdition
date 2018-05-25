package code._14;

import java.util.ArrayList;
import java.util.List;

class CountedInteger{
	private static long counter;
	private final long id =counter++;
	public String toString(){
		return Long.toString(id);
	}
	
}
public class FilledList<T> {
	 
	private Class<T> type;
	
	public FilledList(Class<T> t) {
		this.type = t;
	}
	public List<T> createList(int num) throws InstantiationException, IllegalAccessException{
		List<T> result = new ArrayList<T>();
		int i = 0;
		while (i < num) {
			result.add(type.newInstance());
			i++;
		}
		return result;
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		FilledList<CountedInteger> filledList = new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(filledList.createList(10));
	}

}
