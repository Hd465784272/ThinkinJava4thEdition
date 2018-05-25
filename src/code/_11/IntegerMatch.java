package code._11;
/*
 * 正则表达式：
 */
public class IntegerMatch {

	public static void main(String[] args) {
		//可能有一个'-'号开头，后面有一位数字
		System.out.println("-1234".matches("-?\\d"));
		///可能有一个'-'号开头，后面有一位或多位数字
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("-1".matches("-?\\d+"));
		
		//可能以- +开头的多位数字
		//因为 + 在正则表达式中有特殊意义，所以必须用 // 将其转义。
		System.out.println("1".matches("(-|\\+)?\\d+"));
	}

}
