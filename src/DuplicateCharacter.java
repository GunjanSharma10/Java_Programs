
public class DuplicateCharacter {

	public static void main(String[] args) {
          String st1 = "my name is meera";
          int count;
          char st[]=st1.toCharArray();
          
          for(int i=0;i<st.length;i++) {
        	  count=1;
        	  for(int j=i+1;j<st.length;j++) {
        		  if((st[i]==st[j]) && (st[i]!=' ')) {
        			  count++;
        			  st[j]='0';       			
        		  } }
        		  
        		  if(count>1 && st[i]!='0') {
        		  System.out.println("duplicate variable: "+st[i]+" counts: "+count);
        		  
        	  }
          }
	}

}
