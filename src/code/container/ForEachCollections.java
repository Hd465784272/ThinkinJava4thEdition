package code.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ForEachCollections {
	public static void main(String args[]){
		Collection<String> collection = new ArrayList<String>();
		Collections.addAll(collection, ("Can I help you ?")
				.split(" ") );
		for (String s : collection) {
			System.out.println(s);
		}
	}
}
