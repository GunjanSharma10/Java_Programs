
public class Copy_FrequencyArray {

	public static void main(String[] args) {
              int[] arr1= {1,2,6,4,4,6,3,7,6,7,7,3,5,2,3,1,2,4,5};
              int[] arr2=new int[arr1.length];
              int count;
              
            /*  for(int i=0;i<arr1.length;i++) {
            	  arr2[i]=arr1[i];
              }
              for(int a:arr2) {
            	  System.out.print(a+" ");
              } */
              
          /*    for(int i=0;i<arr1.length;i++) {
            	  count=1;
            	  for(int j=i+1;j<arr1.length;j++) {
            		  if(arr1[i]==arr1[j] && arr1[i]!='x') {
            			  count++;
            			  arr1[j]='x';          			
            		  }
            	  }
            	  if(count>0 && arr1[i]!='x') {
            		  System.out.println("element: "+arr1[i]+"  frequency: "+count);
            	  }
              } */
              
              int[] arr3= {2,5,8,3,7,9};  // rotate left
              int first=arr3[0];
              
              for(int k=0;k<(arr3.length)-1;k++) {
            	  arr3[k]=arr3[k+1];
                  }
                  arr3[(arr3.length)-1]=first;
                  
                  for(int el:arr3) {
                	  System.out.print(el+" "); }
                  
              System.out.println();  
              
              int l=arr3.length;
              int last=arr3[l-1];  //rotate right
              for(int k=(l-1);k>0;k--) {
            	  arr3[k]=arr3[k-1];
                  }
                  arr3[0]=last;
                  
                  for(int el:arr3) {
                	  System.out.print(el+" "); } 
              
              System.out.println();    
                  
              int len=arr3.length; // reverse the array
              int mid=len/2;
              for(int m=0;m<mid;m++) {
            	  int tmp=arr3[m];
            	  arr3[m]=arr3[len-1];
            	  arr3[len-1]=tmp;
            	  len--;
              }
              for(int el:arr3) {
            	  System.out.print(el+" "); }   
              
            		 
	}

}
