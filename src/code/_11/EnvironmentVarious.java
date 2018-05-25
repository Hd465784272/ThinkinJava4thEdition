package code._11;

import java.util.Map.Entry;

public class EnvironmentVarious {
	public static void main(String[] args){
		for (Entry<String, String> entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
	}
}
