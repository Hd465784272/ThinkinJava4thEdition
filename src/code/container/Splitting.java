package code.container;

import java.util.Arrays;

public class Splitting {
	
	public static String dream = "Five score years ago, a great American, "
			+ "in whose symbolic shadow we stand today, signed the "
			+ "Emancipation Proclamation. This momentous decree came as"
			+ " a great beacon light of hope to millions of Negro slaves"
			+ " who had been seared in the flames of withering injustice."
			+ " It came as a joyous daybreak to end the long night of bad "
			+ "captivity.";

	public static void split(String regex){
		System.out.println(Arrays.toString(dream.split(regex)));
	}
	
	public static void main(String args[]) {
		split(" ");
		
		//  \\	：	我要插入一个正则表达式的反斜线\
		//	\W	：	非单词字符；注意一定是大写的W
		split("\\W+");
		
		split("e\\W+");
	}
}
