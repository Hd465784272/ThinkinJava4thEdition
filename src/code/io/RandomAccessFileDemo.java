package code.io;
import java.io.*;
//RandomAccessFile：读写 / 随机访问seek
public class RandomAccessFileDemo {
  static String file = "src/code/io/RandomAccessFileDemo.txt";
  static void display() throws IOException {
    RandomAccessFile rf = new RandomAccessFile(file, "r");
    for(int i = 0; i < 7; i++)
      System.out.println(
        "Value " + i + ": " + rf.readDouble());
    System.out.println(rf.readUTF());
    rf.close();
  }
  public static void main(String[] args)
  throws IOException {
    RandomAccessFile rf = new RandomAccessFile(file, "rw");
    for(int i = 0; i < 7; i++)
      rf.writeDouble(i*1.414);
    rf.writeUTF("The end of the file");
    rf.close();
    display();
    rf = new RandomAccessFile(file, "rw");
    //因为Double总是8字节长，，所以查找第5个Double,需用 5*8
    rf.seek(5*8);
    rf.writeDouble(47.0001);
    rf.close();
    display();
  }
} 
