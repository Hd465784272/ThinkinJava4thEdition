package code.io;
import java.io.*;
/*
 * 文件的基本输出
 */
public class FileOutput_Basic {
	//文件输出目录
  static String file = "src/code/io/FileOutput_BasicDemo.out";
  public static void main(String[] args)
  throws IOException {
	  //缓冲 读文件
    BufferedReader r = new BufferedReader(
      new StringReader(
        BufferedReadFile.read("src/code/io/FileOutput_Basic.java")));
    PrintWriter o = new PrintWriter(
      new BufferedWriter(new FileWriter(file)));
    int lineCount = 1;
    String s;
    while((s = r.readLine()) != null )
      o.println(lineCount++ + ": " + s);
    o.close();
//     Show the stored file:
    System.out.println(BufferedReadFile.read(file));
  }
}
