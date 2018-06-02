package code.io;

import java.io.File;
import java.io.IOException;


//本课时讲解判断文件是否存在、文件名称、路径、文件大小、是否被隐藏、是否可读可写、是否为文件夹等



public class ReadFileProperty {
	public static void main(String[] args) {
		run();
	}
	public static void run (){
		File file = new File("text.txt");
		//判断文件是否存在
		if(file.exists()){
			
			//读取文件名称
			System.out.println(file.getName());
			//读取文件路径
			System.out.println(file.getPath());
			//读取文件绝对路径
			System.out.println(file.getAbsolutePath());
			//读取文件父级路径
			//因为当前file的路径为:text.txt 所以他的父级路径为null
			System.out.println("读取文件父级路径"+file.getParent());
			//新建file，路径为text.txt的绝对路径，再返回他的父级路径
			System.out.println("读取文件父级路径"+new File(file.getAbsolutePath()).getParent());
			//读取文件大小
			System.out.println(file.length()+"bytes");
			System.out.println((float)file.length()/1000+"KB");
			//判断文件是否被隐藏
			System.out.println(file.isHidden());
			//判断文件是否可读
			System.out.println(file.canRead());
			//判断文件是否可写
			System.out.println(file.canWrite());
			
			
		}else{
			try {
				file.createNewFile();
				System.out.println("文件创建成功");
				run();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("文件创建异常");
			}
		}
	}
}
