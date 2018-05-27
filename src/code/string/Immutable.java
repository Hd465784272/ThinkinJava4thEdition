package code.string;

import org.omg.CORBA.IMP_LIMIT;

public class Immutable {
	public String upCase(String string){
		return string.toUpperCase();
	}
	public static void main(String args[]){
		String demo = "Konsen";
		Immutable immutable = new Immutable();
		System.out.println(demo);
		
		//参数是为了该方法提供信息的， 而不是想让该方法改变自己。
		String demoCase = immutable.upCase(demo);
		System.out.println(demoCase);
		
		System.out.println(demo);
	}
}
