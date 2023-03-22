package collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set<Integer> s1=new HashSet<>();
         
         s1.add(5);
         s1.add(4);
         s1.add(29);
         s1.add(92);
         s1.add(43);
         
         Set<Integer> s2=new HashSet<>();
         
         s2.add(15);
         s2.add(43);
         s2.add(129);
         s2.add(925);
         s2.add(432);
             
         System.out.println(s1);
         System.out.println();
         
         for(Integer ele:s1)
        	 System.out.print(ele+"  ");
         System.out.println();
         
         Iterator<Integer> p=s1.iterator();
         while(p.hasNext())
        	 System.out.println(p.next());
         System.out.println("   ----------------   ");
         
         System.out.println(s1.size());
         
        // s1.clear();
         
         System.out.println(" ----we have--- "+s1);
         System.out.println(s1.isEmpty());
         
         List<Integer> l1=new ArrayList<>(s1);
         System.out.println(l1);
         
         for(Integer ele:s1)
        	 System.out.println(s2.contains(ele));
         
        	
         
	}

}
