package code.container;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random  = new Random(47);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<1000; i++){
			int key = random.nextInt(10);
			Integer ikey = map.get(key);
			map.put(key, ikey == null ? 1:ikey+1);
		}
		System.out.println(map);
		
	}

}
