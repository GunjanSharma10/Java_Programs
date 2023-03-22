//import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		
		//again for practice
		String s="make me reverse";
		char[] st=s.toCharArray();
		int len=st.length;
		int mid=len/2;
		for(int i=0; i<=mid;i++) {
			char tmp = st[i];
			st[i]=st[len-1];
			st[len-1]=tmp;
			len--;
		}
		
		for(char ele:st) {
			System.out.print(ele);
		}
		
		
		
		
		
		
		
	/*	System.out.println("enter the string");
		Scanner scan=new Scanner(System.in);
		String sample=scan.next();
		String reverse = "";
		for(int i=sample.length()-1;i>=0;i--) {
			reverse = reverse + sample.charAt(i);
		}
		
		System.out.println("the reverse string is "+reverse);	*/
	
		/* String string="hello world universe";
		char[] st=string.toCharArray();
		int l=st.length;
		int mid=l/2;
		for(int i=0;i<mid;i++) {
			char tmp=st[i];
			st[i]=st[l-1];
			st[l-1]=tmp;
			l--;
		}
		for(char e:st) {
			System.out.print(e);
		}  
                 */
	}

}
