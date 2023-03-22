
public class To_StringDemo {
       int id;
       String name;
       String city;
       
       To_StringDemo(int id,String name,String city){
    	   this.id=id;
    	   this.name=name;
    	   this.city=city;
    	   }
       
       public String toString() {
    	   return id+" "+name+" "+city;
       }
       
	public static void main(String[] args) {
		To_StringDemo s1= new To_StringDemo(10,"Ram","Agra");
		To_StringDemo s2= new To_StringDemo(20,"Shyam","Agra");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
