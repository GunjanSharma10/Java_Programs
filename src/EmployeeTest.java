
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(1);
		e1.setName("X");
		e1.setSalary(4000);
		
		e2.setId(1);
		e2.setName("X");
		e2.setSalary(4000);
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		
	System.out.println("shallow comparison: "+ (e1==e2));
	System.out.println("deep comparison: "+e1.equals(e2));
	
	System.out.println("--------------------------------");
	
	System.out.println("shallow comparison: "+ (s1==s2));
	System.out.println("deep comparison: "+s1.equals(s2));
		
	}

}
