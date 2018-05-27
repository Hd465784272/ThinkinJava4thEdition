package code.holdingYourObj;

import java.util.Scanner;

public class ScannerRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(SimpleRead.input);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.format("%s\n", name);

		System.out.println("How old are you? What is your favorite double?");
		System.out.println("(input: <age> <double>)");
		int numbers = scanner.nextInt();
		double d = scanner.nextDouble();
		System.out.format(" %10d    %4f", numbers, d);
		
	}

}
