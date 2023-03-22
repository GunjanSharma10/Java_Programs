
public class DuplicateCharacterDemo2 {
      
	public static void main(String[] args) {
		String teststring="hello there how are you?";
		char[] test=teststring.toCharArray();
		int count;
		
		for(int i=0;i<test.length;i++) {
			count=1;
			for(int j=i+1;j<test.length;j++) {
				if((test[i]==test[j]) && (test[i]!=' ')) {
					count++;
					test[j]='0';
				}
			}
			if((count>1) && test[i]!='0') {
				System.out.println("duplicate character: "+test[i]+" count: "+count);
			}
		}
	}
}
