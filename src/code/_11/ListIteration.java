package code._11;

import java.util.ArrayList;
import java.util.ListIterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pet> pets = Pets.arrayList(8);
		System.out.print("pets: "+pets);
		System.out.println("");
		ListIterator<Pet> listIterator = pets.listIterator();
		while(listIterator.hasNext()){
			System.out.print(listIterator.nextIndex()+":"
					+listIterator.next()+" ");
		}
		System.out.println("-----");
		
		while(listIterator.hasPrevious()){
			Pet p = listIterator.previous();
			System.out.print(p.id()+":"+p+"  ");
		}
		System.out.println("-----");
		
		listIterator = pets.listIterator(0);
		while(listIterator.hasNext()){
			listIterator.next();
			listIterator.set(Pets.randomPet());
		}
		System.out.println(pets);
	}

}
