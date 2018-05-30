package code.io;


import java.io.File;

import net.mindview.util.PPrint;

public class DirListUtils_Demo {

	public static void main(String[] args) {
		//目录：
		PPrint.pprint(DirListUtils.walk("src/code").dirs);
		System.out.println("-----------------");
		//遍历以D开头的文件
		for (File file : DirListUtils.local("src/code/io", "D.*")) {
			System.out.println(file);
		}
		System.out.println("-----------------");
		//遍历以D开头的文件
		for (File file : DirListUtils.walk("src/code/io", "D.*")) {
			System.out.println(file);
		}
		System.out.println("-----------------");
		for (File file : DirListUtils.walk("./bin/code", ".*List.*\\.class")) {
			System.out.println(file);
		}
	}

}
