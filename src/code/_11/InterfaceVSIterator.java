package code._11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class InterfaceVSIterator {
	
	public static void display(Iterator<Pet> iPet){
		while (iPet.hasNext()) {
			Pet pet = (Pet) iPet.next();
			System.out.println(pet.id()+" :"+pet);
		}
		System.out.println();
	}
	
	public static void display(Collection<Pet> cPet){
		for (Pet pet : cPet) {
			System.out.println(pet.id()+" :"+pet);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> lPets = Pets.arrayList(8);
		Set<Pet> sPets = new HashSet<Pet>(lPets);
		System.out.println("sPets :"+sPets);
		Map<String, Pet> mPets = new LinkedHashMap<String, Pet>();
		String[] names = ("Ralph, eric, robin, Lacey, Birteny, Sam, "
				+ "Spot, Fluffy").split(",");
		for(int i =0; i<names.length; i++){
			mPets.put(names[i], lPets.get(i));
		}
		System.out.println("mPets :"+mPets);
		display(lPets);
		display(sPets);
		display(lPets.iterator());
		display(mPets.values());
		display(mPets.values().iterator());
		
	}

}
