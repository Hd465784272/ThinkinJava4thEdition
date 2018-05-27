package code.holdingYourObj;

import java.util.Scanner;

public class ThreatAnalyzer {

	static String threatData = "58.27.82.161@02/10/2005\n" + "204.45.234.40@02/11/2005\n" + "58.27.82.161@02/11/2005\n"
			+ "58.27.82.161@02/12/2005\n" + "58.27.82.161@02/12/2005\n"
			+ "[Next log section with different data format]";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(threatData);
		String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" + "(\\d{2}/\\d{2}/\\d{4})";
		String date;
		String ip;
		while (scanner.hasNext(pattern)) {
			scanner.next(pattern);
			date = scanner.match().group(2);
			ip = scanner.match().group(1);
			System.out.format("Thread on %s from %s\n", date, ip);
		}
	}

}
