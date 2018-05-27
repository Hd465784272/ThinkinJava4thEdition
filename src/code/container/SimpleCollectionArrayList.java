package code.holdingYourObj;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollectionArrayList {
	public static void main(String args[]){
		Collection<Integer> coll = new ArrayList<Integer>();
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
