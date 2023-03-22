package collectionPractice;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(3, "c");
		m1.put(4, "f");
		m1.put(5, "s");
		
		for(Map.Entry<Integer, String> ele:m1.entrySet())
			System.out.println(ele.getKey()+"  "+ele.getValue());
		
		TreeMap<Integer,String> m2=new TreeMap<>();
		m2.put(1, "a");
		m2.put(2, "b");
		m2.put(3, "c");
		m2.put(4, "f");
		m2.put(5, "s");
		System.out.print("values are "+m2.headMap(3));
		System.out.println();
		System.out.print("values are "+m2.tailMap(3));
		System.out.println();
		
		if(m1.containsValue("b"))
			System.out.println("yes");
		
		if(m1.containsKey(3))
			System.out.println(m1.get(3));

	}

}
