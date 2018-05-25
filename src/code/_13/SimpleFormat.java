package code._13;


public class SimpleFormat{
	public static void main(String args[]){
		int x = 5;
		double y =5.332256;
		//the old way
		System.out.println("Row 1:["+x+" "+y+"]");
		//the new way 	'\n'换行
		System.out.format("Row 2:[%d %f]\n", x,y);
		//or
		System.out.printf("Row 3:[%d %f]\n", x,y);
	}
}
