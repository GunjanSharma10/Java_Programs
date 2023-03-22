import java.util.Scanner;

public class Swap_without_var {
	public static void main(String[] args) {
		int x,y;
		System.out.println("enter the value of x and y: ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("the swap value of x and y are: "+x +"\t"+ +y);
	}

}
