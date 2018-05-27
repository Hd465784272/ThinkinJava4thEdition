package code.classInfo;

import java.util.ArrayList;
import java.util.List;

import code.classInfo.RTTI.Circle;
import code.classInfo.RTTI.Shape;
import code.classInfo.RTTI.Square;
import code.classInfo.RTTI.Triangle;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> lShape = new ArrayList<Shape>();
		lShape.add(new Circle());
		lShape.add(new Square());
		lShape.add(new Triangle());
		for (Shape shape : lShape) {
			shape.draw();
			shape.erase();
		}
	}

}
