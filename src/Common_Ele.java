import java.util.ArrayList;
import java.util.Scanner;

public class Common_Ele {

	public static void main(String[] args) {
		
    ArrayList<Integer> ar1=new ArrayList<>();
    ArrayList<Integer> ar2=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the size of both arrays");
    int n=sc.nextInt();
   
   System.out.println("enter the elements of array 1");  
    for(int i=0;i<n;i++) {
    	int x=sc.nextInt();
    	ar1.add(x);
    }
    
    System.out.println("enter the elements of array 2");  
    for(int i=0;i<n;i++) {
    	int x=sc.nextInt();
    	ar2.add(x);
    }
    
    for(Integer ele: ar1) {
    	if(ar1.containsAll(ar2))
    	System.out.println(ele);
    }

    
	}

}
