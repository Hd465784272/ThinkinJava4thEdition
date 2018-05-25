package code._11;

import java.util.Scanner;

public class ScannerDelimiter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("10,12,14,16,18,20");
		// \s是空白符
		scanner.useDelimiter("\\s*,\\s*");
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
			
		}
	}
}
