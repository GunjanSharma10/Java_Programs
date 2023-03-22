
public class Test1 {

	public static void main(String[] args) {
		String st="akash";
		System.out.println("original: "+st);
		char[] arr=st.toCharArray();
		
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		String str=new String(arr);
		System.out.println("reverse: "+str);
	}

}

