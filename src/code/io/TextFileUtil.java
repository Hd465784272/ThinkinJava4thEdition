package code.io;
import java.io.*;
import java.util.*;
/**
 * 	文件读写工具
 * @author zhangkang
 *
 */
public class TextFileUtil extends ArrayList<String> {
	/**
	 * 读文件
	 * @param fileName	：读入文件名称（全类名）
	 * @return String	：返回文件内容
	 */
  public static String read(String fileName) {
    StringBuilder sb = new StringBuilder();
    try {
      BufferedReader in= new BufferedReader(new FileReader(
        new File(fileName).getAbsoluteFile()));
      try {
        String s;
        while((s = in.readLine()) != null) {
          sb.append(s);
          sb.append("\n");
        }
      } finally {
        in.close();
      }
    } catch(IOException e) {
      throw new RuntimeException(e);
    }
    return sb.toString();
  }
  // Write a single file in one method call:
  /**
   * @写文件
   * @param fileName ：写入的文件名称
   * @param text	：写入的文件内容
   */
  public static void write(String fileName, String text) {
    try {
      PrintWriter out = new PrintWriter(
        new File(fileName).getAbsoluteFile());
      try {
        out.print(text);
      } finally {
        out.close();
      }
    } catch(IOException e) {
      throw new RuntimeException(e);
    }
  }
  // Read a file, split by any regular expression:
  /**
   * @param fileName 读入文件名称（全类名）
   * @param splitter	正则表达式
   */
  public TextFileUtil(String fileName, String splitter) {
    super(Arrays.asList(read(fileName).split(splitter)));
    // Regular expression split() often leaves an empty
    // String at the first position:
    if(get(0).equals("")) remove(0);
  }
  // Normally read by lines:
  /**
   * @param fileName 读入文件名称（全类名）
   */
  public TextFileUtil(String fileName) {
    this(fileName, "\n");
  }
  public void write(String fileName) {
    try {
      PrintWriter out = new PrintWriter(
        new File(fileName).getAbsoluteFile());
      try {
        for(String item : this)
          out.println(item);
      } finally {
        out.close();
      }
    } catch(IOException e) {
      throw new RuntimeException(e);
    }
  }
  // Simple test:
  public static void main(String[] args) {
    String file = read("src/code/io/TextFileUtil.java");
//    System.out.println(file);
    write("src/code/io/TextFileUtil.txt", file);
    TextFileUtil text = new TextFileUtil("test.txt");
    text.write("src/code/io/TextFileUtil2.txt");
    // Break into unique sorted list of words:
    TreeSet<String> words = new TreeSet<String>(
      new TextFileUtil("src/code/io/TextFileUtil.java", "\\W+"));
    // Display the capitalized words:
    System.out.println(words.headSet("a"));
  }
} 
