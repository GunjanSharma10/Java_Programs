import java.util.Arrays;

//import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
     
	/*	char str1[]= {'l','i','s','t','e','n'};
		char str2[]= {'s','i','l','e','n','t'};
		
		int a=str1.length;
		int b=str2.length;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		int x=0;
		
		if(a!=b) {
			System.out.println("Strings are not anagrams");
		}
		else {
			for(int i=0; i < a; i++) {
			if(str1[i]!=str2[i]) {
				
				 x++;
		
				//System.out.println("Strings are not anagrams");
			} }
		}	
		 if(x==0) {
			 System.out.println("Strings are anagrams");
		 }
		 else {
			 System.out.println("Strings are not anagrams");		 
		 }
				*/
		 
		String st1="listen";
		String st2="silent";
		
		char[] ar1=st1.toCharArray();
		char[] ar2=st2.toCharArray();
		
		if(ar1.length!=ar2.length) {
			System.out.println("strings are not anagrams"); }
		else {
			 int count=0;
			
		Arrays.sort(ar1);
		Arrays.sort(ar2);

		for(int i=0;i<ar1.length;i++) {
			if(ar1[i]!=ar2[i]) {
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("strings are anagrams ");
		} else {
			System.out.println("strings are not anagrams");
			}
		}
	}
}


