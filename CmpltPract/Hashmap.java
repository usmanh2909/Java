package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hii");
		hm.put(1, "Hello");
		hm.put(5, "Morning");
		hm.put(4, "Evening");
		System.out.println(hm.get(1));
		System.out.println(hm.get(5));
		hm.remove(0);
		System.out.println(hm.get(0));
		
		Set sm = hm.entrySet();
		
		Iterator it = sm.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
