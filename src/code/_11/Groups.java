package code._11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
	public static String str = Splitting.dream;
	public static void main(String args[]){
		Matcher matcher = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(str);
		while (matcher.find()) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.println("["+matcher.group(i)+"]");
			}
		}
	}
}
