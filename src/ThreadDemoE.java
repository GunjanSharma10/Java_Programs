
public class ThreadDemoE extends Thread{
	
	
	@SuppressWarnings("deprecation")
	public void run() {
		try {
		System.out.println("Thread :"+Thread.currentThread().getId()+ " is running.");
	
	} 
	catch(Exception e) {
		System.out.println(e);
	}

}
}

class ThreadMain {
	
	public static void main(String[] args) {
		ThreadDemoE td = new ThreadDemoE();
		
		td.start();
		td.run();
	}
}