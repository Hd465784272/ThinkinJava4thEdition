package code.container;

import java.util.ArrayList;
/*
 * ArrayList<E>
 */
public class Main_GenericsArraylist_E {
	public static void main(String args[]){
		ArrayList<Apple> alist = new ArrayList<Apple>();
		for(int i = 0;i<3;i++){
			alist.add(new Apple());
		}
		//Compile-time error
		//alist.add(new Orange());
		for(int i=0;i<alist.size();i++){
			System.out.println(alist.get(i).id());
			//System.out.println(((Apple)alist.get(i)).id());
		}
		//using foreach
		for(Apple c :alist){
			System.out.println(c.id());
		}
	}
}

/*Arraylist<E>
编译器可以阻止alist.add()方法添加的错误信息。
因为Arraylist<E>知道它保存的什么类型，因此它调用get()时会替你执行转型。
可以使用更加清晰的语法：foreach*/