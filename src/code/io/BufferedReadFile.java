package code.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 缓冲 读文件
 * BufferedReader
 * 载入一个文件， 把文件输入到控制台
 * @author CCC
 *
 */
public class BufferedReadFile {
	public static String read(String path) throws IOException{
		BufferedReader bReader  = new BufferedReader(new FileReader(path));
		StringBuilder sBuilder = new StringBuilder();
		String res;
			while((res = bReader.readLine()) != null)
				sBuilder.append(res+"\n");
			bReader.close();
			System.out.println();
		return sBuilder.toString();
	}
	public static void main(String[] args) throws IOException {
		System.out.println(read("src/code/io/BufferedReadFile.java"));
	}

}
