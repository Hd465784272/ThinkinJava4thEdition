package code.string;

import java.util.Scanner;

public class Hex_1 {
	//变16进制
	public static String to16Dump(Object ob){
		StringBuilder sb = new StringBuilder();
		
		byte[] bt = ((String) ob).getBytes();
		int n = 0;
		for (byte b : bt) {
			if(n % 16 == 0){
				sb.append(String.format("%05X: ", n));
			}
			sb.append(String.format("%02X ", b));
			n++;
			if(n % 16 == 0){
				sb.append(String.format("\n"));
			}
		}
		System.out.println(sb);
		return sb.toString();
	}
	public static void main(String args[]){
//		String string = "ABCDXYZ   abcdxyz";
		Scanner scanner = new Scanner(System.in);
		
		to16Dump(scanner.next());
		
	}	
}
