package code._11;

import java.util.Iterator;

public class IteratableClass implements Iterable<String>{
	protected String[] words = ("Can I help you ?").split(" ");
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < words.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}
			
		};
	}
	public static void main(String argsp[]){
		for (String s : new IteratableClass()) {
			System.out.println(s);
		}
		
	}

}
