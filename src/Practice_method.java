import java.util.Scanner;
public class Practice_method {

	/* public static void mult(int x) {
	    for(int m=1;m<11;m++) {
	    System.out.println(m*x);
	}
	} 
	static void pattern() {
		for(int i=1;i<5;i++) {
			System.out.println();
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
		}
	} 
	 static int sum(int x) {
		 int result=0;
		 for(int i=1;i<=x;i++) {
			 result=result+i;
		 }
		 return result;
	 } 
	
	// fibonacci series=0,1,1,2,3,5,8,13....
	
	  static int fibb_num(int x) {
		   if(x==1) {
			   return 0;
		   }
		   else if(x==2) {
			   return 1;
		   }
		   else {
			  return fibb_num(x-1) + fibb_num(x-2);
		   } 
	  } */
	
	// array function using varags concept
	
	static float average(int ...arr) {
		float sum=0;
				int n;
		float avg;
		System.out.println("total no: "+arr.length);
		for(int a:arr) {		
			sum += a;
		}
		n=arr.length;
		avg = sum/n;
		return avg;
		//avg = sum/n;
		//System.out.println("the average is: "+avg);
	}
	
	public static void main(String[] args) {
       // Scanner sc =new Scanner(System.in);
		//System.out.println("enter the no");		
        //int n=sc.nextInt();
       // mult(n);
	   // pattern();
       // int total=sum(n);
       // int fib_no= fibb_num(n);
        //System.out.println("the sum of natural no is "+total);
       // System.out.println("the "+n+"th number of fibonacci series is "+fib_no);
		float total;
		//float avg;
		total=average(9,3,4,13,8,6,7,16);
		System.out.println("the sum is: "+total);
	}

}
