package code.container;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/**
 * 
 * @author CCC
 * 正则表达式和java IO
 */
public class JGrep {
	public static void main(String args[]){
		// \b是 词的边界符；
		args = new String[]{"JGrep.java".toUpperCase(),"\\b[Ssct]\\w+"};
		if(args.length < 2){
			System.err.println("Usage: java JGrep file regex");
			System.exit(0);
		}
		Pattern pattern = Pattern.compile(args[1],Pattern.CASE_INSENSITIVE);
		int index = 0;
		Matcher matcher = pattern.matcher("");
		for (String string : new TextFile("src/study/thinkinjava/_11/JGrep.java")) {
			matcher.reset(string);
			while (matcher.find()) {
				System.out.println(index++ +": "+matcher.group()+" : "+matcher.start());
				
			}
		}
		
		
	}
}
