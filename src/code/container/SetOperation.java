package code.container;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
	public static void main(String args[]){
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
		System.out.println(set1);
		set1.add("M");
		System.out.println("Contains 'H'?  :"+set1.contains("H"));
		System.out.println("Contains 'N'?  :"+set1.contains("N"));
		
		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set2, "H I J K L".split(" "));
		System.out.println(set2);
		System.out.println(set1.containsAll(set2));
		set1.removeAll(set2);
		System.out.println(set1);
	}
}
