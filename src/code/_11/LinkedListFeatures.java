package code._11;

import java.util.LinkedList;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

public class LinkedListFeatures {

	public static void main(String args[]){
		LinkedList<Pet> pets  = new LinkedList<Pet>(
				Pets.arrayList(5));
		//pets.clear();
		//移除所有元素。
		System.out.println(pets);
		System.out.println(pets.getFirst());
		System.out.println(pets.element());
		System.out.println(pets.peek());
		System.out.println(pets.poll());
		System.out.println(pets);
		pets.addFirst(new Rat());
		System.out.println(pets);
		pets.add(Pets.randomPet());
		System.out.println(pets);
	}
}
