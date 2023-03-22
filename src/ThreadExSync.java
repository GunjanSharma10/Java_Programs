
public class ThreadExSync {
	
     public static int a = 0;
     
     public static void main(String[] args) throws InterruptedException {
		
    	 Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<200 ; i++) {
					ThreadExSync.a++;
					//System.out.println("Thread 1 value: "+ThreadExSync.a);
				}
				
			}
    	    } );
    	 t1.start();
    	 
    	 Thread t2 = new Thread(new Runnable() {

 			@Override
 			public void run() {
 				for(int i=0; i<200 ; i++) {
 					ThreadExSync.a++;
 				//	System.out.println("Thread 2 value: "+ThreadExSync.a);
 				}
 				
 			}
     	    } );
    	
     	 t2.start();
    	 
    	Thread.sleep(3000);
    	 System.out.println("value of a by main method: "+ThreadExSync.a);
	}

}