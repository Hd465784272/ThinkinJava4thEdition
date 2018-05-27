package code.holdingYourObj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression3 {
	public static void main(String[] args){
		Pattern pattern = Pattern.compile("a*b");
		Matcher m = pattern.matcher("aaaaab");
		while(m.find()){
			 System.out.println("Match \"" + m.group() + "\" at positions " +
			          m.start() + "-" + (m.end() - 1));
		}
		

	}
}
