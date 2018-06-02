package code.io;

import java.io.File;


//本课时讲解通过使用mkdir（）与mkdirs（）方法创建文件夹，使用delete（）方法删除文件夹，使用renameTo（）方法重命名文件夹


public class FolderFile {
	public static void main(String[] args) {

		File file = new File("folder/1/2/3/4");
		//mkdir()只能创建一级目录
		//mkdirs()可以创建多级目录
		if(file.mkdirs()){
			System.out.println("创建成功");
		}else{
			//文件夹已存在的情况，无法创建成功
			if(file.exists()){
				System.out.println("文件夹已存在");
			}else{
				System.out.println("创建失败");
			}
		}

		File file_1 = new File("folder");
		File f1 = new File("folder_new");
		if(file_1.renameTo(f1)){
			System.out.println("重命名成功");
		}else{
			System.out.println("重命名失败");
		}
		
		
		File file_2 = new File("folder_new/1/2");
		File f2 = new File("folder_new/2");
		if(file_2.renameTo(f2)){
			System.out.println("重命名成功");
		}else{
			System.out.println("重命名失败");
		}
		
		File file_3 = new File("folder_new/2/3");
		File f3 = new File("folder_new/3");
		if(file_3.renameTo(f3)){
			System.out.println("重命名成功");
		}else{
			System.out.println("重命名失败");
		}
		
		File file_4 = new File("folder_new/3/4");
		File f4 = new File("folder_new/4");
		if(file_4.renameTo(f4)){
			System.out.println("重命名成功");
		}else{
			System.out.println("重命名失败");
		}
	}
}
