package code.holdingYourObj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class TheReplacements {
	public static void main(String args[]){
		String string = TextFile.read("src/study/thinkinjava/_11/TheReplacements.java");
		Pattern pattern = Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL);
		Matcher  minput = pattern.matcher(string);
		if(minput.find()){
			string = minput.group(1);
		}
		// X{2,}  至少要匹配两次X;
		//把两个或多个空格替换为一个空格
		string = string.replaceAll(" {2,}", " ");
		//删除每行开头部分的所有空格
		string = string.replaceAll("(?m)^+", " ");
		System.out.println(string);
		
		string = string.replaceFirst("[aeiou]", "(VOWEL1)");
		StringBuffer sBuffer = new StringBuffer();
		Pattern pattern2 = Pattern.compile("[aeiou]");
		Matcher matcher = pattern2.matcher(string);
		while (matcher.find()) {
			matcher.appendReplacement(sBuffer, matcher.group().toLowerCase());
		}
		matcher.appendTail(sBuffer);
		System.out.println(sBuffer);
	}
}	
