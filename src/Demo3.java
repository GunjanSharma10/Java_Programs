//	import java.io.*;
	import java.util.Scanner;
//	import java.lang.Math;
//	import java.util.stream.*;
//	import java.util.List.*;
//	import java.lang.Integer.*;
	
	public class Demo3 {
	    public static int minChanges(int[] a,int k){
	    	int i,j,count=0;
	    	 for (i = 0; i < a.length; i++) {
	             for (j = 0; j < i; j++)
	             if (a[i] == a[j])
	                break;
	             if (i == j)
	            	 count++;
	             //System.out.print( arr[i] + " ");
	          }
	    
	        int val=k-count;
	        if(val<0) {
	        	return 0;
	        }
	        else
	        	return val;
	    }

	    public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        int n;
	        System.out.println("enter length of array");
	        n=scan.nextInt();
	        int k;
	        System.out.println("enter no of distinct");
	        k=scan.nextInt();
	       
	        int[] a = new int[n];
	        for(int j=0;j<n;j++){
	        	 System.out.println("enter arr val: ");
	            a[j]=scan.nextInt();
	        }
	        scan.close();
	        int result;
	        result = minChanges(a,k);
	        System.out.println();
	        System.out.print(result);
	        return ;
	    }
	

}
