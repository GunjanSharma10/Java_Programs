import java.util.Scanner;
public class Maths {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	int rows,columns;
	String symbol="";
	System.out.println("enter no of rows:");
		rows= sc.nextInt();
		System.out.println("enter no of columns:");
	columns= sc.nextInt();
	System.out.println("enter the symbol:");
	symbol=sc.next();
	for(int i=1; i<=rows; i++) {
		System.out.println();
		for(int j=1; j<=columns; j++) {
			System.out.print(symbol);
			  double v,u,a,s;
		       System.out.println("enter the values of v");
		       v=sc.nextDouble();
		       System.out.println("enter the values of u");
		       u=sc.nextDouble();
		       System.out.println("enter the values of a");
		       a=sc.nextDouble();
		       System.out.println("enter the values of s");
		       s=sc.nextDouble();
		       double x;
		       //x = ((v*v-u*u)/(2*a*s));
		       x=((v*v)-(u*u))/(2*a*s);
		       System.out.println(x);
		}
	
	}
	
		// TODO Auto-generated method stub

	}

}
