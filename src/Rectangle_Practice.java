
class Rectangle{
	private int l,b;
	
	public Rectangle() {
		this.l=4;
		this.b=5;
	}
	public Rectangle(int length, int breath) {
		this.l=length;
		this.b=breath;
	}
	public void setLength(int length) {
		this.l=length;
	}
	public int getLength() {
		return l;
	}
	public void setBreath(int breath) {
		this.b=breath;
	}
	public int getBreath() {
		return b;
	}
	public int perimeter() {
		return 2*(l+b);
	}
	public int area() {
		return l*b;
	}
}
public class Rectangle_Practice {

	public static void main(String[] args) {
       Rectangle rec=new Rectangle();
       System.out.println("the breath and length are: "+rec.getBreath()+","+"\t" + rec.getLength());
       System.out.println("the perimeter: "+rec.perimeter() +"cm");
       System.out.println("the area: "+rec.area() +"cm2"); 
	}

}
