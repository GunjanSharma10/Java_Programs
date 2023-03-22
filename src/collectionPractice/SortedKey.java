package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortedKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer,Integer> m=new HashMap<>();
        m.put(7, 123);
        m.put(6, 321);
        m.put(2, 117);
        m.put(4, 653);
        
        
        System.out.println("before sorting:  ");
        for(Map.Entry<Integer,Integer> el:m.entrySet() )
        	System.out.println(el.getKey()+"   "+el.getValue());
        
        System.out.println("after sorting:   ");
        
        List<Integer> list=new ArrayList<>(m.keySet());
        Collections.sort(list);
        
        Map<Integer,Integer> m1=new LinkedHashMap<>();
        for(Integer l:list) {
        	m1.put(l, m.get(l));
        }
        
        for(Map.Entry<Integer,Integer> el:m1.entrySet() )
        	System.out.println(el.getKey()+"   "+el.getValue());
        }
        
	}


