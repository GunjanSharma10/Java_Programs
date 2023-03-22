package collectionPractice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new LinkedList<>();
		
		l1.add(8);
		l1.add(56);
		l1.add(23);
		l1.add(2);
		l1.add(0, 17);
		l1.add(28);
		l1.add(1, 98);
		
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(7);
		l2.add(96);
		l2.add(112);
		l2.add(234);
		
		System.out.println("peak ele   "+l2.peekLast());
		
		
		ListIterator<Integer> i=l1.listIterator(1);
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		for(Integer e:l1)
			System.out.print(e+" ");
		System.out.println();
		
		System.out.println(l1.get(0));
		
		for(Integer ele:l1)
			System.out.println(ele+ "    "+ l1.indexOf(ele));

		System.out.println();
		
		
	}
	

}
