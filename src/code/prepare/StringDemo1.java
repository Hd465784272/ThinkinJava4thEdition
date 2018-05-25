package code.prepare;


public class StringDemo1 {
	public static String reserve(String str){
		StringBuilder sBuilder = new StringBuilder();
		for (int i = str.length(); i >0 ; i--) {
			sBuilder.append(str.charAt(i-1));
		}
		return sBuilder.toString();
	}
	public static void main(String args[]){
		System.out.println(StringDemo1.reserve("how are you ?"));
	}
}
