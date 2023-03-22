package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
     public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("white");
		l1.add("red");
		l1.add("green");
		
		List<String> l2=new ArrayList<>();
		l2.add("apple");
		l2.add("mango");
		l2.add("grapes");
		
		List<String> l3=new ArrayList<>();
		
		l3.addAll(l1);
		l3.addAll(l2);
		
		List<Integer> l4=new ArrayList<>();
		l4.add(57);
		l4.add(2);
		l4.add(52);
		l4.add(7);
		
		l1.stream().forEach(i->System.out.println(i));
		System.out.println();
		
		l1.add(0, "peach");
		
		System.out.println("given ele "+l1.get(2));
		l1.set(2,"pink");
		
		l1.remove(0);
		
		
		for(String ele:l1)
			System.out.println(ele);
		
		System.out.println();
		System.out.println(l1);
		
		System.out.println(l3);
		
		System.out.println(l3.contains("apple"));
		System.out.println();
		Collections.sort(l4);
		System.out.println(l4);
		
		Collections.copy(l2, l1);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println();
		
		Collections.shuffle(l3);
		System.out.println(l3);
		
		Collections.reverse(l4);
		System.out.println(l4);
		
		Collections.swap(l4, 0, 1);
		
		System.out.println(l4);
		
	}
}
