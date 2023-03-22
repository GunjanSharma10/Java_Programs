
public class Practice_java {
	// PRACTICING ARRAY

	public static void main(String[] args) {
	/*  int[] arr= {3,7,5,9};
		for(int element:arr) {
			System.out.println(element); 
		}  
		
		int[] arr= {3,7,5,9};
		int num=8;
		boolean sig=false;
		for(int element:arr) {
			if(num==element) {
			sig=true;
			break;
			}}
		if(sig) {
			System.out.println("yes present");
		}
			else {
				System.out.println("not present");	
			}
		*/
		
		// SWAPPING OF ARRAY ELEMENTS PROGRAM
		
		int[] arr= {2,13,6,7,9,3,15,48};
		int l=arr.length;
		System.out.println("the length of array: "+l);
		int n=Math.floorDiv(l, 2);
		int temp;
		/*
		System.out.println("the mid point is: "+n);
		for(int i=0;i<n;i++) {
			temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
		}
		for(int element:arr) {
			System.out.print(element +" ");
		} 
		/*for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
			System.out.print(" ");
		} */
		
		// FIND MAX NO
		int max=arr[0];
		for(int i=1;i<l;i++) {
		if(max<arr[i])
		max=arr[i];
		}
		System.out.println("the greatest no is: "+max);
		
	}

}
