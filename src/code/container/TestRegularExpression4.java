package code.container;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher matcher = Pattern.compile("\\w+").matcher(""
				+ "Evening is full of the linnet's wings");
		while(matcher.find()){
			System.out.print(matcher.group()+" ");
		}
		System.out.println();
		int i = 0;
		while(matcher.find(i)){
			System.out.print(matcher.group()+" ");
			i = matcher.end();
		}
		
		
	}

}
