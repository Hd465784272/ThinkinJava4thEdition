package code.classInfo.RTTI;

import static net.mindview.util.Print.*;

public class Triangle extends Shape {
  public void draw() { print("Triangle.draw()"); }
  public void erase() { print("Triangle.erase()"); }
  static{
	  System.out.println("Triangle Static method");
  }
} ///:~
