//import java.util.ArrayList;

public class MaxOccuringChar {
public static void main(String[] args) {
	
	//ArrayList<String> al=new ArrayList<>();
	
	String st="hello how are you?";
	char[] arr=st.toCharArray();
	int count,max;
	//char maxchar;
	//int i;

	for(int i=0;i<arr.length;i++) {
	 count=1;
	  max=1;
	  char maxchar='0';
		for(int j=i+1;j<arr.length;j++) {
			if((arr[i]==arr[j]) && (arr[i]!=' ')) {
				count++;
				arr[j]='0';
			}
		}
		if(count>max) {
			max=count;
			maxchar=arr[i];
		} 
	
	if(max>count && arr[i]!='0') {
		System.out.println(maxchar+" and "+max);
		} else {
			System.out.println("no duplicate character");
		}
	}
 }
}
