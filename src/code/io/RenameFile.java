package code.io;

import java.io.File;
import java.io.IOException;

public class RenameFile {
	public static void main(String[] args) {
		File file = new File("0.txt");
		if(file.exists()){
			File newf = new File("2.txt");
			file.renameTo(newf);
			System.out.println(file.getName());
			System.out.println(newf.getName());
		}else{
			System.out.println("文件不存在");
			try {
				file.createNewFile();
				System.out.println("文件创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("创建异常");
			}
		}
	}
}
