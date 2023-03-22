
public class DEmo extends Bike {

	public void fun(int x) {
 	   System.out.println("hi i am fun in child");
    }
	
	public void fun2() {
		System.out.println("hi i am fun2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       short x=10;
//       int z = x;
//		
//		int a=5;
//       short b = (short)a;
       
		Bike b = new DEmo();
		b.fun(3);
	//	b.fun2();
       
	}

}

class Bike{
	
	public void fun(int x) {
		System.out.println("hii i am fun");
	}
}
