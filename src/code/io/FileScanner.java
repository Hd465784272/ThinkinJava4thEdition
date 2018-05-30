package code.io;

import java.io.File;


//本课时讲解通过使用listFiles（）方法获取文件夹中的所有项目，并且通过递归显示完整的层级结构。


public class FileScanner {
	public static void main(String[] args) {
		File file = new File("src/code");
		Scanner(file,1);
	}

	public static void Scanner(File dir ,int tab) {
		if (dir.isDirectory()) {
			File[] next = dir.listFiles();
			for (int i = 0; i < next.length; i++) {
				for (int j = 0; j < tab; j++) {
					System.out.print("|--");
				}
				
				System.out.println(next[i].getName());
				if (next[i].isDirectory()) {
					Scanner(next[i],tab+1);
				}
			}
		} else {
			System.out.println("not a directory");
		}
	}
}
