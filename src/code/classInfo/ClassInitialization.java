package code.classInfo;

import java.util.*;

class Initable {
	//staticFinal：	
	//static final值是一个“编译期常量”，就想Initable.staticFinal那样，不需要对Initable类初始化就可以被读取。
	//staticFinal2
	//对Initable.staticFinal2访问 将强制进行类的初始化，因为staticFinal2不是“编译期常量”
  static final int staticFinal = 47;
  static final int staticFinal2 =
		  ClassInitialization.rand.nextInt(1000);
  static {
    System.out.println("Initializing Static Initable");
  }
}

class Initable2 {
  static int staticNonFinal = 147;
  static {
    System.out.println("Initializing Initable2");
  }
}

class Initable3 {
  static int staticNonFinal = 74;
  static {
    System.out.println("Initializing Initable3");
  }
}

/*
 * .class 来创建对Class对象的引用时，不会自动地初始化该Class对象。
 */
public class ClassInitialization {
  public static Random rand = new Random(47);
  public static void main(String[] args) throws Exception {
//	  注意区别 new Initable();
    Class initable = Initable.class;
//	  new Initable();
    System.out.println("After creating Initable ref");
    System.out.println(Initable.staticFinal);
    System.out.println(Initable.staticFinal2);
    System.out.println(Initable2.staticNonFinal);
    System.out.println("-----------");
    Class initable3 = Class.forName("study.thinkinjava._14.Initable3");
    System.out.println("After creating Initable3 ref");
    System.out.println(Initable3.staticNonFinal);
  }
} 
