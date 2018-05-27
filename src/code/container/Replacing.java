package code.container;

public class Replacing {
	static String dream = Splitting.dream;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dream.replaceFirst("s\\w+", "Six"));
		System.out.println(dream.replaceAll("Five |score |years |ago", "1"));
	}

}
