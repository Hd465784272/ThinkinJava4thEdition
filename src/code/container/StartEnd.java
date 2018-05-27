package code.container;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
	public static String str = "As long as there is injustice, whenever a\n" +
		    "Targathian baby cries out, wherever a distress\n" +
		    "signal sounds among the stars ... We'll be there.\n" +
		    "This fine ship, and this fine crew ...\n" +
		    "Never give up! Never surrender!";
	private static class Display{
		private boolean regexPrinted = false;
		private String regex;
		Display(String regex) {
			// TODO Auto-generated constructor stub
			this.regex = regex;
		}
		void display(String message){
			if(!regexPrinted){
				System.out.println(regex);
				regexPrinted = true;
			}
			System.out.println(message);
		}
	}
	static void examine(String string , String regex){
		Display d = new Display(regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(string);
		while (m.find()) {
			d.display("find:"+m.group()+" start: "+m.start()+" end: "+m.end());
		}
//		while (m.lookingAt()) {
//			d.display("find:"+m.group()+" start: "+m.start()+" end: "+m.end());
//		}
		while (m.matches()) {
			d.display("matches:"+m.group()+" start: "+m.start()+" end: "+m.end());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st[] = {"\\w*ere\\w","\\w*ere","T\\w+","never.*?!"};
		for(String in :str.split("\n")){
			System.out.println(in);
			for(String regex :st){
				examine(in, regex);
			}
		}
		
		
	}

}
