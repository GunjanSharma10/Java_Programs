
 class Employee1{
	 int salary;
	    String name;

	    public int getSalary(){
	    	salary = 50000;
	        return salary;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setName(String n){
	        name = n;
	    }
 }
 
 class Cellphone{
	 public void ringing() {
		 System.out.println("phone is ringing");
	 }
	 public void vibrating() {
		 System.out.println("phone is vibrating");
	 }
 }
 
 class Square{
	 private int side;
             int ar,peri;
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	 
	 public int area() {
		ar= side*side;
		return ar;
	 }
	 
	 public int perimeter() {
		 peri=4*side;
		 return peri;
	 }
 }
public class Practice_Class {

	public static void main(String[] args) {
        Employee1 emp1=new Employee1();
        emp1.setName("gunjan");
        System.out.println(emp1.getSalary());
        System.out.println(emp1.getName());
        
        Cellphone nokia=new Cellphone();
        nokia.ringing();
        nokia.vibrating();
        
        Square sq=new Square();
        sq.setSide(5);
        System.out.println("the side of square is: "+sq.getSide());
        System.out.println("the area of square is: "+sq.area());
        System.out.println("the perimeter of square is: "+sq.perimeter());
	}

}
