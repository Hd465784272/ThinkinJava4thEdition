package code.prepare;


public class StaticMethodDemo {
	private String str1 = "property";
	private static String str2 = "static property";
	public static void print2(){
		System.out.format("static str2: %s \n", str2);
		//Cannot make a static reference to the non-static field str1
		//静态方法不可以直接调用非静态方法和成员
//		System.out.format("str1: %s", str1);
	}
	public void print(){
		System.out.format("non-static str2: %s \n", str2);
		System.out.format("non-static str1: %s \n", str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemo staticMethodDemo= new StaticMethodDemo();
		staticMethodDemo.print();
		StaticMethodDemo.print2();
	}

}
