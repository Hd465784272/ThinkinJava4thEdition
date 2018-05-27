package code.classInfo;

import java.util.HashMap;

import typeinfo.pets.Dog;
import typeinfo.pets.EgyptianMau;
import typeinfo.pets.ForNameCreator;
import typeinfo.pets.Hamster;
import typeinfo.pets.Manx;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.PetCreator;
import typeinfo.pets.Rat;
/*
 * instanceof 来对pet 进行计数
 */
public class PetCount {
	static class PetCounter extends HashMap<String, Integer>{
		public void count(String type){
			Integer quantity = get(type);
			if(quantity == null){
				put(type, 0);
			}else{
				put(type, quantity+1);
			}
			
		}
	}
	public static void countPets(PetCreator petCreator){
		PetCounter petCounter = new PetCounter();
		for (Pet pet : petCreator.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName()+" ");
			if (pet instanceof Pet) {
				petCounter.count("Mutt");;
			}
			if (pet instanceof Dog) {
				petCounter.count("Pug");;
			}
			if (pet instanceof EgyptianMau) {
				petCounter.count("EgyptianMau");;
			}
			if (pet instanceof Manx) {
				petCounter.count("Manx");;
			}
			if (pet instanceof Rat) {
				petCounter.count("Rat");;
			}
			if (pet instanceof Mouse) {
				petCounter.count("Mouse");;
			}
			if (pet instanceof Hamster) {
				petCounter.count("Hamster");;
			}
		}
		System.out.println("");
		System.out.println(petCounter);
	}
	public static void main(String[] args) {
		countPets(new ForNameCreator());
	}
}
