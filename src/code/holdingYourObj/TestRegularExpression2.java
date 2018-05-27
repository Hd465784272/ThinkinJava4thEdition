package code.holdingYourObj;


public class TestRegularExpression2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args = new String[]{"Java now has regular expressions",
				"^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s+"};
		if(args.length < 0){
			System.exit(0);
		}
		System.out.println(args);
		for (String string : args) {
			
		}

	}

}
