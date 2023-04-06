package chapter11;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<String, SmartPhone> hashMap = new HashMap<>();
		
		hashMap.put("Spring", new SmartPhone("Spring", "010-1111-2222"));
		hashMap.put("Winter", new SmartPhone("Winter", "010-2222-4444"));
		
		System.out.println(hashMap.get("Winter"));
		
		hashMap.put("autumn", new SmartPhone("autumn", "010-2222-3333"));
		
		hashMap.put("Winter", new SmartPhone("Winter", "010-1111-3333"));
		
		
		System.out.println(hashMap.get("Winter"));
		
		Set<String> keySet = hashMap.keySet();
		
		for(String key : keySet ) {
			System.out.println();
		}
		
		
		
	}

}
