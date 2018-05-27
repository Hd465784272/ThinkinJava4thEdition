package code.holdingYourObj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typeinfo.pets.Cat;
import typeinfo.pets.Cymric;
import typeinfo.pets.Dog;
import typeinfo.pets.Mutt;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;
import typeinfo.pets.Pug;

public class MapOfList {

	public static Map<Person, List<? extends Pet>>  
		petPerson =new HashMap<Person, List<? extends Pet>>();
	
	static{
		petPerson.put(new Person("Dawn"), 
				Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petPerson.put(new Person("Kate"), 
				Arrays.asList(new Cymric("ShackLecton"),
						new Cat("Cat1"), new Dog("ErHa")));
		petPerson.put(new Person("Marin"), 
				Arrays.asList(new Pug("Pug1"),
						new Cat("Cat_M"), new Cat("Cat_Ma")));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(petPerson.keySet());
		System.out.println(petPerson.values());
		for(Person person : petPerson.keySet()){
			System.out.println(person+" has");
			for(Pet pet : petPerson.get(person)){
				System.out.println("  "+pet);
			}
		}
	}

}
