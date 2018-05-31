package code.io;
/**
 * 习题：打开一个文本文件， 每次读取一行内容。每行作为String读入，
 * 将String读入置于LinkedList中，按照相反的顺序打印每一行。
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BufferedReadFileDemo {
	public static List walk(String path) throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader(path)); 
		List<String> list = new LinkedList<String>();
		String re;
		while((re = bf.readLine() ) != null){
			list.add(re);
		}
		return list;
	}
	public static void main(String[] args) throws IOException {
		List l = walk("src/code/io/README.md");
		 for (int i = l.size()-1; i >= 0; i--) {
			System.out.println(l.get(i));
		}
	}
}
