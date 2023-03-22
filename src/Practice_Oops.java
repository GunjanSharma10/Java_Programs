import java.util.Scanner;
 
public class Practice_Oops {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Employee emp=new Employee();
		String n;
		int sal,id;
		//emp.name ="veronika";
		//emp.salary = 50000;
		System.out.println("enter the employee name");
		n =sc.nextLine();
		emp.setName(n);
		System.out.println("enter the employee's salary");
		sal=sc.nextInt();
		emp.setSalary(sal);
		System.out.println("enter the employee's id");
		id=sc.nextInt();
		emp.setId(id);		
		System.out.println("employee's name: "+emp.getName());
		System.out.println("employee's salary: "+emp.getSalary());
		System.out.println("employee's id: "+emp.getId());
		//emp.getName();
		//emp.getSalary();
	}

}
