
class Parent{
	Parent(){
		System.out.println("hello, i am parent class.");
	}
	Parent(int a){
		System.out.println("hello i am "+a+ " constructor");
	}
	public int addNo(int a, int b){
		 return a+b;
	}
	public void multwp() {
		int a=4*5;
		System.out.println("multiplication of 4,5= 20");
	}
}

class Child extends Parent {
	public int multiply(int a, int b) {
		return a*b;
	}
}

public class Inheritance_Practice {
	public static void main(String[] args) {
		Parent par=new Parent();
		Parent par1=new Parent(4);
		Child ch=new Child();
		int m=ch.multiply(6, 7);
		System.out.println("the multiplication is "+m);
		ch.multwp();
		
		
	}

}
