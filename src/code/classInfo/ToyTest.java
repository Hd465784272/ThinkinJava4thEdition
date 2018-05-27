package code.classInfo;

import static net.mindview.util.Print.*;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	Toy() {}

	Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		//获取全类名     
		//判断是否为接口
		print("getName: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		//获取简单类名
		print("getSimpleName: " + cc.getSimpleName());
		//获取 基础类的规范化名称
		print("getCanonicalName : " + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			//new FancyToy();
			//c = Class.forName(new FancyToy().getClass().getName());
			c = Class.forName("study.thinkinjava._14.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			print("Can't find FancyToy");
			
			//system.exit（0）:正常退出，程序正常执行结束退出
			//system.exit(1):是非正常退出，就是说无论程序正在执行与否，都退出，
			System.exit(1);
		}
		printInfo(c);
		//getInterfaces():获取此对象所表示的类或接口实现的接口。
		for (Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			//创建此 Class 对象所表示的类的一个新实例。
			obj = up.newInstance();
		} catch (InstantiationException e) {
			print("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			print("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
} 
