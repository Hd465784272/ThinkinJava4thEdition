package code.holdingYourObj;

import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class UniqueWordsAlphabetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		set.addAll(new TextFile("src/study/thinkinjava/_11/_1genericity/SetOperation.java","\\W+"));
		System.out.println(set);
	}

}
