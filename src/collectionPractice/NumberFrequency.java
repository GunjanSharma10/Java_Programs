package collectionPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<Integer> l=Arrays.asList(4,8,3,4,8,5,4,3,3,11,3);
		
		Map<Integer,Integer> fre=new HashMap<>();
		
		for(Integer e:l) {
			Integer count=fre.get(e);
			if(count==null)
				count=0;
			
			fre.put(e, count+1);
		}
		
		for(Map.Entry<Integer,Integer> ele:fre.entrySet())
			System.out.println(ele.getKey()+"   "+ele.getValue());
		
		
	}

}
