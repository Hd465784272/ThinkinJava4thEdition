package code._11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = Splitting.dream;
		System.out.println(string);
		String regex = "[fst][aeiou][aeiou]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		while (matcher.find()) {
			System.out.print("  find: "+matcher.group());
		}
		System.out.println();
		matcher.reset("fie,seo,tai");
		while (matcher.find()) {
			System.out.print("  find:  "+matcher.group());
		}
	}

}
