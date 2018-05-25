package code._13;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
	private String name;
	private Formatter formatter;
	public Turtle(String n, Formatter f){
		this.name = n;
		this.formatter = f;
	}
	public void move(int x, int y ){
		formatter.format("%s Turtle is at(%d, %d)\n",  name, x, y);
	}
	
	public static void main(String args[]){
		PrintStream outAlias = System.out;
		Turtle turtle = new Turtle("大海龟", new Formatter(outAlias));
		turtle.move(50, 10);
		Turtle turtle2 = new Turtle("巴西龟", new Formatter(System.out));
		turtle2.move(5, 10);
	}
}
