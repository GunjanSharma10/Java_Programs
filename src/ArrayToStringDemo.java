import java.util.Arrays;
import java.util.stream.Collectors;
/*
public class ArrayToStringDemo {
     public static void main(String[] args) {
		
    	 String[] arraystring= {"hello","my","name","is","Gunjan"};
    	 
    	 //method-1
    	 String st1= Arrays.toString(arraystring);
    	 System.out.println(st1);
    	 
    	 //method-2
    	 StringBuilder sb= new StringBuilder();
    	 for(int i=0;i<arraystring.length;i++) {
    		 sb.append(arraystring[i]);
    	 }
    	 String st2= sb.toString();
    	 System.out.println(st2);
    	 
    	 //method-3
    	 String st3=String.join(" ",arraystring);
    	 System.out.println(st3);
    	 
    	 //method-4
    	 String st4 = Arrays.stream(arraystring).collect(Collectors.joining());
    	 System.out.println(st4);
    	 
    	 //---------------check equal strings-----------------
    	 
    	 String string1="hello world";
    	 String string2="Hello World";
    	 System.out.println(string1.equals(string2));
    	 System.out.println(string1.equalsIgnoreCase(string2));
	}
} */   
 
public class ArrayToStringDemo{
	
	public static void main(String[] args) {
		String[] arr= {"hii","how","are","you?"};
		
		//method-1
		String st1=Arrays.toString(arr);
		System.out.println(st1);
	
	
	//method-2
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<arr.length;i++) {
		sb.append(arr[i]);
	}
	String st2=sb.toString();
	System.out.println(st2);
	
	//method-3
	String st3= String.join(" ", arr);
	System.out.println(st3);
		
	}
	
} 
