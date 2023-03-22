import java.util.Scanner;

class Cylinder{
	private float radius, height;
	
	public Cylinder() {
		this.height=4;
		this.radius=21;
	}
	public Cylinder(float r, float h) {
		this.height=h;
		this.radius=r;
	}
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public float sur_area() {
		return 2*(22/7)*radius*height;
	    
	}
	public float volume() {
	    return (22/7)*radius*radius*height;
	}
	
}

public class Cylinder_Problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          Cylinder cld=new Cylinder(4f,21f);
          //Cylinder(4f,21f);
          //System.out.println("enter the value of radius");
          //float r=sc.nextFloat();
          //System.out.println("enter the value of height");
          //float h=sc.nextFloat();
          //cld.setHeight(h);
          //cld.setRadius(r);
          System.out.println("the radius of the cylinder: "+cld.getRadius());
          System.out.println("the Height of the cylinder: "+cld.getHeight());
          System.out.println("the surface area of the cylinder: "+cld.sur_area());
          System.out.println("the volume of the cylinder: "+cld.volume());
          
          
	}

}
