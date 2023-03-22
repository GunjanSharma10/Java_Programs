import java.util.Arrays;

public class PalindromeString {

	public static void main(String[] args) { 
	String st1="paman";
	char[] arr= st1.toCharArray();
	int l=arr.length;
	int mid= l/2;
	
	for(int i=0;i<=mid;i++) {
		char tmp= arr[i];
		arr[i]=arr[l-1];
		arr[l-1]=tmp;
		l--;
	}
	
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<arr.length;i++) {
		sb.append(arr[i]);
	}
	String st2=sb.toString();
	
	if(st1.equals(st2))
		System.out.println("yes"); 
	else
		System.out.println("no");

}} 

