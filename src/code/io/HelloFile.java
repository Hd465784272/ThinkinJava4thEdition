package code.io;

import java.io.File;
import java.io.IOException;


//本课时讲解通过文件类的creatNewFile（）方法创建文件，通过delete（）方法删除文件，使用renameTo（）方法重命名文件。


public class HelloFile {
	public static void main(String[] args) {
		File file = new File("src/com/jike/junior/0.txt");
		//文件是否存在
		if(file.exists()){
			File newfile = new File("src/com/jike/junior/1.txt");
			//重命名操作不但可以改名字， 也可以改目录。
			//前提：文件夹结构必须在一个分区，mac无需考虑，win分C/D/E/F盘区，夸盘无法用重命名操作
			//文件夹不在一个分区的情况需要使用文件的拷贝，
			file.renameTo(newfile);
			System.out.println(file.getName());
			/*
			//获取文件名
			System.out.println(file.getName());
			//路径
			System.out.println(file.getPath());
			//绝对路径
			System.out.println(file.isAbsolute());
			//获取绝对路径
			System.out.println(file.getAbsolutePath());
			//是否是文件
			System.out.println(file.isFile());
			//是否是文件夹
			System.out.println(file.isDirectory());
			*/
		}else{
			System.out.println("文件不存在");
			//文件不存在
			try {
				//创建文件
				file.createNewFile();
				System.out.println("文件创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("文件创建异常");
			}
		}
	}
}
