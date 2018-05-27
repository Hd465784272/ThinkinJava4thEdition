package code.classInfo;

import java.util.LinkedHashMap;
import java.util.Map;

import net.mindview.util.MapData;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
/*
 * Class.isInstance 方法提供了一种动态的测试对象 的途径。
 */
public class PetCount3 {
	@SuppressWarnings("serial")
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{
		public PetCounter(){
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		//重写toString()方法，格式化输出。
		public String toString() {
			// TODO Auto-generated method stub
			StringBuffer sBuffer = new StringBuffer("{");
			for(Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()){
				sBuffer.append(pair.getKey().getSimpleName());
				sBuffer.append("=");
				sBuffer.append(pair.getValue());
				sBuffer.append(", ");
			}
			sBuffer.delete(sBuffer.length()-2, sBuffer.length());
			sBuffer.append("}");
			return sBuffer.toString();
		}
		public void count(Pet pet){
			//entrySet():回此映射所包含的映射关系的 collection 视图。
			for (Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()) {
				if(pair.getKey().isInstance(pet)){
					put(pair.getKey(), pair.getValue()+1);
				}
			}
		}
		public static void main(String[] args) {
			PetCounter petCounter = new PetCounter();
			for(Pet pet : Pets.createArray(20)){//创建长度为20的Pets类型的数组
				System.out.print(pet.getClass().getSimpleName()+" || ");
				petCounter.count(pet);
			}
			System.out.println();
			System.out.println(petCounter);
		}
		
	}
}
