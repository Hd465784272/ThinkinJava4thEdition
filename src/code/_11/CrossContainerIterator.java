package code._11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CrossContainerIterator {

	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet p = it.next();
			System.out.println(p.id()+" "+p);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pet> pets = Pets.arrayList(8);
		System.out.println("pets: "+pets);
		LinkedList<Pet> petLL = new LinkedList<Pet>(pets);
		System.out.println("petLL: "+petLL);
		HashSet<Pet> petHS = new HashSet<Pet>(pets);
		System.out.println("petHS: "+petHS);
		TreeSet<Pet> petTS = new TreeSet<Pet>(pets);
		System.out.println("petTS: "+petTS);
		System.out.println("-----分割线-----");
		display(pets.iterator());
		display(petLL.iterator());
		display(petHS.iterator());
		display(petTS.iterator());
		
	}

}
