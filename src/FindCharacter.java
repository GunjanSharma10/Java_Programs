
public class FindCharacter {
    public static void main(String[] args) {
		String st="hello world";
		char[] test=st.toCharArray();
		
		char ch= 'l';
		int count=0;
		for(int i=0;i<test.length;i++) {
			if(test[i]==ch) {
				count++;
			}
		}
		
				if(count==0) {
					System.out.println("this character does not exist");
				} else {
					System.out.println("no of occurences of character is: " +count); 
				}
	}
}
