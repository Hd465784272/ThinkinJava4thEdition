一、FilenameFilter介绍：文件名过滤器。实现此接口的类实例可用于过滤器文件名。
	一般	有两种方法返回所有文件和目录：
		1、 String[] list = 	new File("文件目录").list(FilenameFilter filter);
		2、 File[] list = new File("文件目录").listFile(FilenameFilter filter);
		
		
二、文件名过滤器一般用法
	1.实现FilenameFilter接口；
	2.实现boolean accept(File dir,String name);  
	 //dir表示文件的当前目录，name表示文件名；
	
