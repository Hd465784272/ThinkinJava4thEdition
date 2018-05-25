package code._13;

import java.io.File;
import java.io.IOException;

import net.mindview.util.BinaryFile;
/*
 * 一个十六进制的转换工具
 */
public class Hex {
	//变成16进制
	public static String formate(byte[] data){
		StringBuilder sBuilder = new StringBuilder();
		int n =0;
		for (byte b : data) {
			if(n%16 == 0){
				sBuilder.append(String.format("%-9X: ", n));
			}
			sBuilder.append(String.format("%02X ", b));
			n++;
			if(n % 16 == 0)
				sBuilder.append("\n");
		}
		sBuilder.append("\n");
		return sBuilder.toString();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(args.length == 0){
			System.out.println(formate(BinaryFile.read("src/study/thinkinjava/_13/Hex.java")));
		}else{
			System.out.println(formate(BinaryFile.read(new File(args[0]))));
		}
	}

}
