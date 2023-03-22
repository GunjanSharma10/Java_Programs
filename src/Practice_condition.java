import java.util.Scanner;
import java.util.Random;
public class Practice_condition {
	
	public static void main(String[] args) {
		// String web;
		Scanner sc= new Scanner(System.in);
	  // int n;
      /* System.out.println("enter the website");
	  web = sc.next();
	   if(web.endsWith(".com")){
		  System.out.println("this is commercial website");
	  }
		  else if(web.endsWith(".org")) {
			  System.out.println("this is org website"); 
	  }
		  else if(web.endsWith(".in")) {
		      System.out.println("this is indian website");
		  }
		  else {
			  System.out.println("try again");
		  } */
	/*  System.out.println("enter the year");
	  n=sc.nextInt();
	  if(n%4==0) {
		  System.out.println("year is leap year");
	  }
		  else {
			  System.out.println("year is not leap year");
			  
		  } */
	  
	  /*int n=100;
	  while (n<=200)
	  { System.out.println(n);
	  n++;
	  
	  } */
		
	/*	int a=1, n;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		do {
			System.out.println(a);
			a++;
		}while(a<=n); */
		
	/* int i,j;
	for (i=4;i>0;i--)
	{
		for(j=i;j>0;j--)
		{ System.out.print("*");
	}
		System.out.println();

	} */
	
		/* int a,s=0,i;
		System.out.println("enter the value of a");
		a=sc.nextInt();
		for(i=1;i<11;i++) 
		{
			s=s+a*i;
		}
		System.out.println("the sum is: "+s);

 */
	/*	int i;
		int[] arr = new int[5];
		System.out.println("enter 5 no's");
		for(i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<5;i++) {
        System.out.println(arr[i]);
		}
	*/
		// ROCK PAPER SCISSOR GAME
		Random rd=new Random();
		System.out.println("we are going to play game'rock paper scissor'");
		System.out.println("select your input:\n 1 for rock \n 2 for paper \n 3 for scissor");
		int user=sc.nextInt();
		if(user==1) {
		System.out.println("you selected: Rock");}
		else if(user==2) {
			System.out.println("you selected: Paper");}
		else {
			System.out.println("you selected: Scissor");}
		
		int comp = rd.nextInt(3)+1;
		if(comp==1) {
			System.out.println("comp selected: Rock");}
			else if(comp==2) {
				System.out.println("comp selected: Paper");}
			else {
				System.out.println("comp selected: Scissor");}
		
		switch(user) {
		case 1:
			if(1==comp) {
				System.out.println("it's a tie");
			}
			else if (comp==2) {
				System.out.println("comp wins");
			}
			else {
				System.out.println("you win");
			}
			break;
		case 2:
			if(2==comp) {
				System.out.println("it's a tie");
			}
			else if (comp==1) {
				System.out.println("you win");
			}
			else {
				System.out.println("comp wins");
			}
			break;
		case 3:
			if(3==comp) {
				System.out.println("it's a tie");
			}
			else if (comp==1) {
				System.out.println("comp wins");
			}
			else {
				System.out.println("you win");
			}
		    break;
		}
		
		
	}
}