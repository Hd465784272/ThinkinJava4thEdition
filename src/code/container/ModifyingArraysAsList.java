package code.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ModifyingArraysAsList {
	public static void main(String args[]){
		Random random = new Random(47);
		String[] ia = ("Can I help you ?").split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(ia));
		System.out.println("Before shuffling " +list);
		Collections.shuffle(list, random);
		System.out.println("After shuffling " +list);
		System.out.println("Arrays: "+Arrays.toString(ia));
		
		List<String> list2 = Arrays.asList(ia);
		System.out.println("Before shuffing: "+list2);
		Collections.shuffle(list2, random);
		System.out.println("After shuffing: "+list2);
		System.out.println(list2.toString());
		
	}
}
