package code.classInfo;

import java.util.HashMap;
import java.util.Map;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
public class PetCount5 extends HashMap<Class<?>, Integer>{
	private Class<?> baseType;
	public PetCount5(Class<Pet> baseType) {
		this.baseType = baseType;
	}
	public void count(Object obj){
		 Class<?> type = obj.getClass();
		 if (!baseType.isAssignableFrom(type)) {
			 System.out.println("meiyou");
		}
		 countClass(type);
	}
	private void countClass(Class<?> type) {
		// TODO Auto-generated method stub
		Integer quantity = get(type);
		put(type, quantity == null ? 0 : quantity+1);
		Class<?> superClass = type.getSuperclass();
		if(superClass != null &&
			       baseType.isAssignableFrom(superClass))
			      countClass(superClass);
	}
	@Override
	public String toString() {
	    StringBuilder result = new StringBuilder();
	    for(Map.Entry<Class<?>,Integer> pair : entrySet()) {
	      result.append(pair.getKey().getSimpleName());
	      result.append("=");
	      result.append(pair.getValue());
	      result.append(", ");
	    }
	    return result.toString();
	  }
	public static void main(String[] args) {
		PetCount5 p5 = new PetCount5(Pet.class);
		
		for (Pet pet  : Pets.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName()+", ");
			p5.count(pet);
		}
		System.out.println();
		System.out.println(p5.toString());
	}

}
