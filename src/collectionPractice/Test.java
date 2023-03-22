package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//import java.util.Set;
//import java.util.TreeMap;

public class Test {
	
       // sorting the keys------------------------------
	
	public static void main(String[] args) {
		Map<Integer,Integer> m= new HashMap<>();
		m.put(35, 654);
		m.put(21, 114);
		m.put(3, 243);
		m.put(14, 744);
		
		System.out.println("Before Sorting:");
		
		for(Map.Entry<Integer,Integer> e:m.entrySet())
			System.out.println(e.getKey()+"  "+e.getValue());

		
//		System.out.println("Before Sorting:");
//		Set set = m.entrySet();
//		Iterator iterator = set.iterator();
//		while(iterator.hasNext()) {
//		    Map.Entry pair = (Map.Entry)iterator.next();
//		    System.out.print(pair.getKey() + ": ");
//		    System.out.println(pair.getValue());
//		    
//		}
//		
//		 Map<Integer, Integer> map = new TreeMap<Integer, Integer>(m);    
//		 System.out.println("After Sorting:");
//		    Set set2 = map.entrySet();
//		    Iterator iterator2 = set2.iterator();
//		    while(iterator2.hasNext()) {
//		        Map.Entry pair = (Map.Entry)iterator2.next();
//		        System.out.print(pair.getKey() + ": ");
//		        System.out.println(pair.getValue());
//		    } 
		
		System.out.println("after sorting:  ");
	    List<Integer> list=new ArrayList<>(m.keySet());
	    Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1-o2;
			}
	    	
	    });
	    
	    System.out.println(list);
	    
	    Map<Integer,Integer> sorted=new LinkedHashMap<>();
	    for(Integer key:list)
	    	sorted.put(key, m.get(key));
	    
	    System.out.println(sorted);
	}	

}
