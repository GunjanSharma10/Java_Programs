import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Practice_Collection2 {

	public static void main(String[] args) {
       
		/*Set<String> set=new HashSet<>();
		
		boolean added= set.add("hello");
		boolean added2 = set.add("hello");
		System.out.println(added);
		System.out.println(added2);
		
		Set<String> set2=Set.of("hii","how","are","you");
		//System.out.println(set2);
		
		Iterator<String> iterator=set2.iterator();
 		while(iterator.hasNext()) {
 			String next=iterator.next();
 			System.out.println(next);
 		} */
 		
		Set<String> tset=new TreeSet<>();
		tset.add("hii");
		tset.add("how");
		tset.add("are");
		tset.add("you"); 
		
		tset.addAll(Set.of("what", "a", "surprise"));
		
		/* Iterator<String> iterator=tset.iterator();
 		while(iterator.hasNext()) {
 			String next=iterator.next();
 			System.out.println(next);
 		} */
		
		/*for(String element: tset) {
			System.out.println(element);
		} */
		
		tset.forEach((element) -> {System.out.println("tree element is: "+element);});
	}

}
