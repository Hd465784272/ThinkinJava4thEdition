package code.io;


import java.util.regex.*;
import java.io.*;
import java.util.*;
/**
 * 目录列表器
 * @author CCC
 * 
 *	典型的调用顺序是 :
 *  Pattern p = Pattern.compile("a*b");
 	Matcher m = p.matcher("aaaaab");
 	boolean b = m.matches();
 *
 */
public class DirList {
  public static void main(String[] args) {
	args = new String[]{".*"};//多个任意字符
    File path = new File("src/code/innerClass");
    String[] list;
    if(args.length == 0)
      list = path.list();
    else
    //list:返回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组。
    list = path.list(new DirFilter(args[0]));
    //使用java.utils.Arrays.sort()  和 String.CASE_INSENSITIVE_ORDER对结果排序
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for(String dirItem : list)
      System.out.println(dirItem);
  }
}
//FilenameFilter接口:实现此接口的类实例可用于过滤器文件名
class DirFilter implements FilenameFilter {
  private Pattern pattern;
  public DirFilter(String regex) {
    pattern = Pattern.compile(regex);
    System.out.println("正则表达式为： "+pattern);
  }
  public boolean accept(File dir,	//dir - 被找到的文件所在的目录。
		  String name) {			//name - 文件的名称。 
	  System.out.println("文件目录: "+dir);
	  System.out.println("文件名称: "+name);
    return pattern.matcher(name).matches();
  }
}