import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

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
