class Student1{
	int rollno;
	String name,course;
	float fee;
	
	Student1(int rollno,String name,String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	Student1(int rollno,String name,String course,float fee){
		this(rollno,name,course);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	
}}
 
public class Practice_Constructors {

	public static void main(String[] args) {
	  /* Pizza pizza=new Pizza();
       Pizza pizza1=new Pizza("thin");
       Pizza pizza2=new Pizza("thin","mozeralla");
       Pizza pizza3=new Pizza("thin","mozeralla","corns");
       Pizza pizza4=new Pizza("thin","mozeralla","tomato",250);
       System.out.println("case 1:");
       System.out.println(pizza1.crust);
       System.out.println("case 2:");       
       System.out.println(pizza2.crust);
       System.out.println(pizza2.cheese);
       System.out.println("case 3:");
       System.out.println(pizza3.crust);
       System.out.println(pizza3.cheese);
       System.out.println(pizza3.toppings);
       System.out.println("case 4:");
       System.out.println(pizza4.crust);
       System.out.println(pizza4.cheese);
       System.out.println(pizza4.toppings);
       System.out.println(pizza4.cost); */
		
		Student1 s1=new Student1(10,"Ram","CS");
		Student1 s2=new Student1(20,"Shyam","CSE",1000f);
		s1.display();
		s2.display();
	}

}
