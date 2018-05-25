package code._11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReversibleArrayList(Collection<T> c){super(c);}
	
	public Iterable<T> reversed(){
		
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<T>() {
					
					int current = size()-1;
					
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1;
					}

					@Override
					public T next() {
						// TODO Auto-generated method stub
						return get(current--);
					}
				};
			}
		
			
		};
		
	}

}
