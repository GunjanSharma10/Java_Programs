//import java.util.ArrayList;
//import java.util.Stack;
//import java.util.Queue;
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
import java.util.ArrayDeque;
//import java.util.Scanner;
public class Collection_Practice1 {

	public static void main(String[] args) {
         
		//ArrayList<String> mylist= new ArrayList<>();
		//Stack<String> stk=new Stack<>();
		//Queue<String> q=new LinkedList<>();
		//Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		ArrayDeque<Integer> ad=new ArrayDeque<>();
	
		//Scanner sc=new Scanner(System.in);
		/* stk.push("black");
		stk.push("red");
		stk.push("blue");
		stk.push("yellow");
		
		System.out.println("uppermost plate: "+stk.peek());
		System.out.println(stk);
		
		/* System.out.println("enter the no of entries: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("enter "+ i +" string");
			String st=sc.next();
			mylist.add(st);	
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(mylist.get(i));
		}
			
		System.out.println("enter the string you want to remove");
		String sg=sc.next();
		mylist.remove(sg);
		
		for(int i=0;i<n-1 ;i++) {
			System.out.println(mylist.get(i));
		}
		
		mylist.clear();
		//mylist.add("hello");
		//mylist.add("world");
		//System.out.println(mylist.get(0));
		//System.out.println(mylist.get(1)); */
		/* q.offer("first");
		q.offer("second");
		q.offer("third");
		q.offer("fourth");
		q.offer("fifth");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek()); */
		/*
		pq.offer(34);
		pq.offer(4);
		pq.offer(14);
		pq.offer(23);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println("the peek element is: "+pq.peek());
		System.out.println(pq); */
		
		ad.offer(23);
		ad.offer(38);
		ad.offerFirst(56);
		ad.offer(5);
		ad.offerLast(78);
		System.out.println(ad); 
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		System.out.println(ad.poll());
		System.out.println(ad); 
		System.out.println(ad.pollFirst());
		System.out.println(ad); 
		System.out.println(ad.pollLast());
		System.out.println(ad); 
		
		
		
		
	}

}
