//import java.util.Arrays;

public class CheckStringPalindrome {
   public static void main(String[] args) {
	
	   String st1="naman";
	   char[] charray=st1.toCharArray();
	   int len=charray.length;
	   int mid=len/2;
	   
	   for(int i=0;i<=mid;i++) {
		   @SuppressWarnings("unused")
		char tmp=charray[i];
		   charray[i]=charray[len-1];
		   charray[len-1]=charray[i];
		   len--;
	   } 
	   
	    for(char ele:charray) {
		   System.out.print(ele);
	   }
	   System.out.println(); 
	   
	   //String st2=Arrays.toString(charray);
	   StringBuilder sb= new StringBuilder();
  	 for(int i=0;i<charray.length;i++) {
  		 sb.append(charray[i]);
  	 }
  	 String st2= sb.toString();
  	 //System.out.println(st2); 
	   
	  
	   if(st1.equals(st2)) {
		   System.out.println("this string is palindrome");
	   }else {
		   System.out.println("this string is not palindrome");
	   }
   }
}  
