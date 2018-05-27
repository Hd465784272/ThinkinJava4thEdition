package code.holdingYourObj;

import java.util.Arrays;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "You can jump, I can jump";
		System.out.println(Arrays.toString
				(string.split("\\s+can\\s+")));
		
	}

}
