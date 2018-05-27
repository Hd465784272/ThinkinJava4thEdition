package code.string;

public class WhetherStringBuilder {
	public String StringMethod(String[] fields){
		String result = "";
		for(int i = 0; i < fields.length; i++){
			result+=fields[i];
		}
		System.out.println(result);
		return result;
	}
	public String StringBuilderMethod(String[] fields){
		StringBuilder sBuilder = new StringBuilder();
		for(int i = 0; i < fields.length; i++){
			sBuilder.append(fields[i]);
		}
		System.out.println(sBuilder.toString());
		return sBuilder.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fields = {"konsen","jiran","zhangbing","zhengliguo","zhangshuaikang"};
		WhetherStringBuilder wsb = new WhetherStringBuilder();
		wsb.StringMethod(fields);
	}

}
