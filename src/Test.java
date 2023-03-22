
public class Test {
    public static void main(String[] args) {
		String st="what aaa ahhe";
		char[] str=st.toCharArray();
		//int l=str.length;
		int count=0;
		
		for(int i=0;i<str.length-1;i++) {
			count=1;
			if(str[i]!='0') {
			  for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					count++;
					str[j]='0';
				}
			  }
			}
			
			if(count>1 && str[i]!=' ') {
				System.out.println("duplicate character is: "+str[i]+"  "+count+"times");	
			}
			
		}
		
//		if(count<2) {
//			System.out.println("no duplicate character");
//		}
//		
		}
}

//
//Object[] charArray = inputString.chars().mapToObj(c -> (char) c).toArray();
//Map<Character, Integer> mapCharCount = new HashMap<>();
//Arrays.stream(charArray).map(c -> (char) c).forEach(c -> {
//	if (mapCharCount.get(c) != null) {
//		mapCharCount.put(c, mapCharCount.get(c) + 1);
//	} else {
//		mapCharCount.putIfAbsent(c, 1);
//	}
//});
//for (Map.Entry<Character, Integer> e : mapCharCount.entrySet()) {
//	if (e.getValue() > 1) {
//		System.out.println("Duplicate Char: " + e.getKey());
//	}
