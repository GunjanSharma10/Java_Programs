
public class ThreadDemoR implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thread :"+Thread.currentThread().getId()+ " is running.");
		
		} 
		catch(Exception e) {
			System.out.println(e);
		}		
	}

}

class ThreadMainR {
	
	int a = 5;   int x=a+5;
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
		ThreadDemoR tr = new ThreadDemoR();	
		Thread td = new Thread(tr);
		
		td.start();
		}
	}
}