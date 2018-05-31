package code.io;
import java.io.*;

public class FileOutput_ShortCut {
  static String file = "src/code/io/FileOutput_ShortCutDemo.out";
  public static void main(String[] args)
  throws IOException {
    BufferedReader in = new BufferedReader(
      new StringReader(
       BufferedReadFile.read("src/code/io/FileOutput_ShortCut.java")));
    // Here's the shortcut:
    PrintWriter out = new PrintWriter(file);
    int lineCount = 1;
    String s;
    while((s = in.readLine()) != null )
      out.println(lineCount++ + ": " + s);
    out.close();
    System.out.println(BufferedReadFile.read(file));
  }
} 
