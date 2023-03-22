class Student {
	int rollno;
	String name;
	static String clg = "ITS";
	
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+clg);
	}
}

class Cube{
	static int vol(int side) {
		int v=side*side*side;
		return v;
	}
}
public class Static_Demo {
	public static void main(String[] args) {
		Student s1=new Student(10,"ram");
		Student s2=new Student(15,"shyam");
		//s1.clg="BTS";
		s1.display();
		s2.display();
		System.out.println("volume of cube " + Cube.vol(10));
	}

}
