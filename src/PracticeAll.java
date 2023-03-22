import java.util.Arrays;

public class PracticeAll {
    public static void main(String[] args) {
    	
    	String st1="java";
    	String st2="avjb";
    	char[] ch1=st1.toCharArray();
    	char[] ch2=st2.toCharArray();
    	int l1=ch1.length;
    	int l2=ch2.length;
    	Arrays.sort(ch1);
    	Arrays.sort(ch2);
    	
    	int x=0;
    	if(l1!=l2) {
    		System.out.println("not anagram"); }
    	else {
    		for(int i=0;i<l1;i++) 
    			{if(ch1[i]!=ch2[i]) {
    				x++;
    			}
    				}
    		if(x==0) {
    			System.out.println(" anagram loop");
    		}
    		else {
    			System.out.println("not anagram loop");
    		}
    		}
    			
    	}
    	
	}


