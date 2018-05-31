package code.io;

import java.io.*;
/**
 * 内存输入
 * @author CCC
 *
 */
public class StringReadFile {
  public static void main(String[] args)
  throws IOException {
    StringReader in = new StringReader(
      BufferedReadFile.read("src/code/io/StringReadFile.java"));
    int c;
    while((c = in.read()) != -1)
    	//read() 以int的形式范围下一个字节，因此必须类型转换为char才能正确打印。
      System.out.print((char)c);
  }
} 
