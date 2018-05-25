package code._14;

import java.util.ArrayList;
import java.util.List;

import code._14.RTTI.Circle;
import code._14.RTTI.Shape;
import code._14.RTTI.Square;
import code._14.RTTI.Triangle;

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
