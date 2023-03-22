
abstract public class abstractDemo {
	
	abstract public void run();
	
	public void walk() {
		System.out.println("i am running");
	}
	

}



 interface InterfaceDemo{
	
	public void drive();
}

 
 class Demo1 extends abstractDemo{

	@Override
	public void run() {
		System.out.println("I am in Demo");
		
	}
	 
 }
 
 
 class Demo2 implements InterfaceDemo{

	@Override
	public void drive() {
		System.out.println("i am driving");
		
	}
	 
 }
 
 class MainDemo{
	 
	 int[] arr = new int[5];
	 
	 String st="hello";
	 String st1="hello";
	 String st2 = new String("hello");
	

	 
	 //==
	//.equals()
	 
	 public static void main(String[] args) {
	
		 Demo1 d1= new Demo1();
		 Demo2 d2 = new Demo2();
		 
		 d1.run();
		 d1.walk();
		 d2.drive();
		 
	}
	 	 
 }
 