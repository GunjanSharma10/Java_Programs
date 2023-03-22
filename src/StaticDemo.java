
public class StaticDemo {
	
	int id;
	String name;
	static String batch;
	
	//initialize the static variables in static block
	static {
		batch= "A";
	}
	
	
	public StaticDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo s1 = new StaticDemo(1,"Alex");
		StaticDemo s2 = new StaticDemo(2,"John");
		
		System.out.println(s1.id+" "+s1.name+" "+StaticDemo.batch);   //static belongs to class not with object
		System.out.println(s2.id+" "+s2.name+" "+StaticDemo.batch);   // hence calling with Class reference.
	}

}
