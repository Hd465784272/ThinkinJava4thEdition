package code.container;

import java.util.Arrays;
/*
 * 适配器：当有一个接口并需要另一个接口时，编写适配器可以解决问题
 */
public class AdapterMethodIdiom {
	public static void main(String args[]){
		ReversibleArrayList<String> ral = 
				new ReversibleArrayList<String>(
						Arrays.asList("To be or not to be".split(" ")));
		for (String string : ral) {
			System.out.print(string+" ");
		}
		System.out.println();
		for (String string : ral.reversed()) {
			System.out.print(string+" ");
		}
	}
}
