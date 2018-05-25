package code._13;

import java.util.Formatter;

public class Conversion {
	public static void main(String argsp[]){
		Formatter f  = new Formatter(System.out);
		
		char u = 'a';
		System.out.println("u = "+u);
		f.format("s :%s\n", u);
//		f.format("d: %d \n", u);
		f.format("c: %c \n", u);
//		f.format("f: %f \n", u);
//		f.format("e: %e \n", u);
//		f.format("x: %x \n", u);
		f.format("h: %h \n", u);
		
		int v = 121;
		System.out.println("v = "+v);
		f.format("d: %d \n", v);
		f.format("c: %c \n", v);
		f.format("b: %b \n", v)	;
		f.format("s :%s\n", v);
//		f.format("f: %f \n", v);
//		f.format("e: %e \n", v);
		f.format("x: %x \n", v);
		f.format("h: %h \n", v);
		
	}
}
