package code.holdingYourObj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreatAnalyzer2 {

	static String threatData = "58.27.82.161@02/10/2005\n" + "204.45.234.40@02/11/2005\n" + "58.27.82.161@02/11/2005\n"
			+ "58.27.82.161@02/12/2005\n" + "58.27.82.161@02/12/2005\n"
			+ "[Next log section with different data format]";

	public static void main(String[] args) {
		String regex = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" + "(\\d{2}/\\d{2}/\\d{4})";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher  = pattern.matcher(threatData);
		while (matcher.find()) {
			System.out.format("Thread on %s from %s\n",matcher.group(2) ,matcher.group(1));
		}
		
	}

}
