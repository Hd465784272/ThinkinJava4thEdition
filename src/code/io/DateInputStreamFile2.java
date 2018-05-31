package code.io;

import java.io.*;

public class DateInputStreamFile2 {
  public static void main(String[] args)
  throws IOException {
    DataInputStream in = new DataInputStream(
      new BufferedInputStream(
        new FileInputStream("src/code/io/DateInputStreamFile2.java")));
    while(in.available() != 0)
      System.out.print((char)in.readByte());
  }
}
