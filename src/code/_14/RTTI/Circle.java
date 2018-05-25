package code._14.RTTI;

import static net.mindview.util.Print.*;

public class Circle extends Shape {
  public void draw() { print("Circle.draw()"); }
  public void erase() { print("Circle.erase()"); }
  static{
	  System.out.println("Circle Static method");
  }
} ///:~
