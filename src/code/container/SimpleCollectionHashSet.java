package code.holdingYourObj;

import java.util.HashSet;
import java.util.Set;
public class SimpleCollectionHashSet {
	public static void main(String args[]){
		Set<Integer> coll = new HashSet<Integer>();
		for(int i=0;i<10;i++){
			coll.add(i);
		}
		coll.add(9);
		System.out.println("coll: "+coll);
		for (Integer i : coll) {
			System.out.print(i+" ");
		}
	}
}
