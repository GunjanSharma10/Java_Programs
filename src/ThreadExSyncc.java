
 class Paran{
	
	private Object lock = "lock";   //after applying this lock to the block, now intrinsic lock/ lock specific to object is applied.
	 public void generate() {       // no consistency will be there. synchronized is applied to particular area.
		 synchronized(lock)
		 {
		for(int i=0;i<10;i++) {
			if(i<5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println();
		 }
//		for(int j=0;j<10;j++) {
//			
//		}
	
	}
}

public class ThreadExSyncc {

	public static void main(String[] args) {
		
		Paran p1 = new Paran();             // if there is only one object then sync work on that, no inconsistency will be there.
		Paran p2 = new Paran();            // but now 2 objects are there and sync will apply 2 locks on these 2 objects, and effect
		 //anonymous thread                // will nullify. because lock is specific to object.
		new Thread(new Runnable() {            

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					p1.generate();
				}
				
			}}).start();
		
	//----another anonymous thread	
		new Thread(new Runnable() {             //anonymous thread

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					p2.generate();
				}
				
			}}).start();
	}
}
