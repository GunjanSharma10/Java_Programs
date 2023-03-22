/*
public class ArrayMinMax {
         public static void main(String[] args) {
			int[] ar1= {23,56,12,98,107,65,2,45,78};
			
			int max=ar1[0];     // find greatest number
			for(int i=0;i<ar1.length;i++) {
				if(ar1[i]>max) {
					max=ar1[i];
				}
			}
			
			System.out.println("max ele: "+max);
			
			int min=ar1[0];    // find smallest number
			for(int i=0;i<ar1.length;i++) {
				if(ar1[i]<min) {
					min=ar1[i];
				}
			}
			System.out.println("min ele: "+min);
			
			int sum=0;       // sum of integer array
			for(int i=0;i<ar1.length;i++) {
				sum=sum+ar1[i];
			}
			System.out.println("sum of ele: "+sum);
			
			
			
		}
} */

public class ArrayMinMax {
	public static void main(String[] args) {
		int arr[]= {5,2,4,9,18,34,6,12};
		int l=arr.length;
		int min, max;
		 min=arr[0];
		for(int i=0;i<l;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("min ele:"+""+min);
		
		 max=arr[0];
			for(int i=0;i<l;i++) {
				if(arr[i]>max)
					max=arr[i];
			}
			System.out.println("max ele:"+""+max);
	}
	
}
