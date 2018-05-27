package code.classInfo;
/**
 * 类方法提取器
 */
import java.lang.reflect.*;
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class ShowMethods {
  private static String usage ="String[] args 为空。";
  private static Pattern p = Pattern.compile("\\w+\\.");
  public static void main(String[] args) {
	args = new String[]{"code.classInfo.ShowMethods","java.lang.String"};
    if(args.length < 1) {
      print(usage);
      System.exit(0);
    }
    int lines = 0;
    Class<?> c;
    Method[] methods;
    Constructor[] ctors;
    for (int i = 0; i < args.length; i++) {
        try {
			c = Class.forName(args[i]);
			methods = c.getMethods();
	        ctors = c.getConstructors();
	        for(Method method : methods)
	        	print("Method  ："+p.matcher(method.toString()));
	        for(Constructor ctor : ctors)
	        	print("Constructor  :"+p.matcher(ctor.toString()).replaceAll(""));
	        lines = methods.length + ctors.length;
	        System.out.println("-----------"+c.getSimpleName()+"---------"+lines);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
      } 
	}
} 
