package code.classInfo;

public class GenericToyTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy ft = ftClass.newInstance();
		
		//某个类是 FancyToy的超类
 		Class<? super FancyToy> fToy = Toy.class;
 		Object object = fToy.newInstance();
		
	}
}
