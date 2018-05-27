package code.classInfo;

import java.util.ArrayList;
import java.util.List;

import typeinfo.pets.Pet;
import typeinfo.pets.PetCreator;

public class ForNameCreatorDemo extends PetCreator{
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames= {
			"typeinfo.pets.Mutt",
		    "typeinfo.pets.Pug",
		    "typeinfo.pets.EgyptianMau",
		    "typeinfo.pets.Manx",
		    "typeinfo.pets.Cymric",
		    "typeinfo.pets.Rat",
		    "typeinfo.pets.Mouse",
		    "typeinfo.pets.Hamster"
	};
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		for (String string : typeNames) {
			types.add((Class<? extends Pet>) Class.forName(string));
		}
		System.out.println(new ForNameCreatorDemo().types());
	}
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}
}
