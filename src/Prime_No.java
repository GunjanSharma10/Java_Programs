
public class Prime_No {
    static void checkPrime(int n) {	
      int flag=0;
      if(n==0||n==1) {
    	  System.out.println("number is not prime");
      }else {
    	  for(int i=2;i<=(n/2);i++) {
    		  if(n%i==0) {
    			  System.out.println("number is not prime");
    			  flag=1;
    			  break;
    		  }
    	  }
      }
      if(flag==0) {
    	  System.out.println("number is prime");
      }
    }
    
      public static void main(String[] args) {
    	  checkPrime(10);
    	  checkPrime(17);
    	  checkPrime(53);
    	  checkPrime(76);
      }

}
