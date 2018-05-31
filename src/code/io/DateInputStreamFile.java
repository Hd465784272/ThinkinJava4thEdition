package code.io;
import java.io.*;
/**
 * 格式化的内存输入
 * @author CCC
 *
 */
public class DateInputStreamFile {
  public static void main(String[] args)
  throws IOException {
    try {
      DataInputStream in = new DataInputStream(
        new ByteArrayInputStream(
         BufferedReadFile.read(
          "src/code/io/DateInputStreamFile.java").getBytes()));
      while(true){
    	  System.out.print((char)in.readByte());
      }
       
    } catch(EOFException e) {
      System.err.println("End of stream");
    }
  }
} 
