package collectionPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("hii");
		ts1.add("hello");
		ts1.add("hey");
		ts1.add("heya");
		
		Set<String> ts2=new TreeSet<>();
		
		Set<String> ts3=new TreeSet<>();
		ts3.add("a");
		ts3.add("hii");
		ts3.add("hello");
		ts3.add("b");
		
		System.out.println(ts1);
		
		Iterator p=ts1.descendingIterator();
		while(p.hasNext())
			System.out.print(p.next()+"  ");
		
		System.out.println();
		
		for(String s:ts1)
			System.out.print(s+" ");
		System.out.println();
		
		ts2.addAll(ts1);
		
		System.out.println(ts2);
		
		System.out.println(ts1.first());
		System.out.println(ts1.last());
		System.out.println();
		
		System.out.println(ts1);
		System.out.println(ts3);
		
		for(String el:ts1)
			System.out.println(ts3.contains(el)? "yes" :"no");
		
		System.out.println();
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(5);
		t.add(23);
		t.add(2);
		t.add(9);
		t.add(7);
		
		System.out.println(t.contains(7));
		
		TreeSet<Integer> treeheadset=new TreeSet<Integer>();
		
		treeheadset=(TreeSet)t.headSet(7);
		
		Iterator x=treeheadset.iterator();
		System.out.println("data are: ");
		while(x.hasNext())
			System.out.print(x.next()+" ");
		
		
		
		
		

	}

}
