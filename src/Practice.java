import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
     
		//String st = "gunjan";
		//String sg = "sharma";
		Scanner sc = new Scanner(System.in);
		
        //String letter;
        //System.out.println("enter the message: ");
        // letter=sc.nextLine();
        // System.out.println(letter.replace(" ","_")); 
       int h,s,m;
       double t;
       System.out.println("enter the marks of hindi");
       h=sc.nextInt();
       System.out.println("enter the marks of science");
	   s=sc.nextInt();
	   System.out.println("enter the marks of maths");
    	m =sc.nextInt();
    	t = (h+s+m)/3;
    	if(t>=40) {
    		if((h>=33)&&(s>=33)&&(m>=33)) {
    			System.out.println("you passed the examination");
    		}
    		else {
    			System.out.println("sorry! try again");
    		}
    	}
    	else {
    		System.out.println("sorry! try again");
    	}
			
	}
}
