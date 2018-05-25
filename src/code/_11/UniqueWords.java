package code._11;

import java.io.FileNotFoundException;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class UniqueWords {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		 Set<String> set = new TreeSet<String>(
		 new TextFile("src/study/thinkinjava/_11/_1genericity/SetOperation.java", "\\W+"));
		 System.out.println(set);
	}
}
	