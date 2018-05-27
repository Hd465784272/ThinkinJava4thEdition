package code.holdingYourObj;

import java.util.HashMap;
import java.util.Map;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

public class PetMap {
	public static void main(String argsp[]){
		Map<String, Pet> pet = new HashMap<String, Pet>();
		pet.put("my dog", new Dog("Molly"));
		pet.put("my cat", new Cat("Ginger"));
		System.out.println(pet);
		Pet xx = pet.get("my dog");
		System.out.println(xx);
		
		System.out.println(pet.containsKey("my dog"));
		System.out.println(pet.containsValue(xx));
	}
}
