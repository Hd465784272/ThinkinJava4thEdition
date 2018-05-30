package code.io;

/**
 * 目录列表器，用匿名的方式实现
 */
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList2 {
	//注意这里regex是 Final。这在匿名内部类中是必须的，这样他才能使用来自该类范围之外的对象
  public static FilenameFilter filter(final String regex) {
    return new FilenameFilter() {
      private Pattern pattern = Pattern.compile(regex);
      public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
      }
    }; 
  }
  public static void main(String[] args) {
	args = new String[]{".*"};
    File path = new File("src/code/io");
    String[] list;
    if(args.length == 0)
      list = path.list();
    else
      list = path.list(filter(args[0]));
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for(String dirItem : list)
      System.out.println(dirItem);
  }
} 
