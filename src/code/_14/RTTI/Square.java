package code._14.RTTI;

import static net.mindview.util.Print.*;

public class Square extends Shape {
  public void draw() { print("Square.draw()"); }
  public void erase() { print("Square.erase()"); }
  static{
	  System.out.println("Square Static Method");
  }
} ///:~
