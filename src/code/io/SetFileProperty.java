package code.io;

import java.io.File;
import java.io.IOException;

//本课时讲解将文件设定为可读、可写或只读。


public class SetFileProperty {
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		if(file.exists()){
			//只读
//			file.setReadOnly();
			//可写
			file.setWritable(true);
			//可读
			file.setReadable(true);
		}else{
			try {
				file.createNewFile();
				System.out.println("创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("创建异常");
			}
		}
	}
}
