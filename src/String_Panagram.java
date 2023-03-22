import java.util.Scanner;

public class String_Panagram {

	public static void main(String[] args) {
      
		//Scanner sc=new Scanner(System.in);
		//System.out.println("write the sentence");
       //String st=sc.nextLine();
		String st="the quick brown fox jumps over the lazy dog";
       
       boolean res=panagramTest(st.toLowerCase());
       System.out.println(res);
      		 
	}
	
	private static boolean panagramTest(String s) {
		if(s.length()<26) {
			return false;
		} else {
			for(char ch='a';ch <='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		}
		   return true;
	   }

}
   
   