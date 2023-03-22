package collectionPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency {
       
	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("A","B","D","A","B","A");
		
		Map<String,Integer> fre=new HashMap<>();
		for(String s:l) {
			Integer count=fre.get(s);
			if(count==null) {
				count=0;
			}
			fre.put(s, count+1);
		}
		
		for(Map.Entry<String,Integer> el:fre.entrySet())
			System.out.println(el.getKey()+"    "+el.getValue());
	}
}
