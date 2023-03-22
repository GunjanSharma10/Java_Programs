
class Employee {
 private String name;
 private int id;
 private int salary;
 
  public void setSalary(int x){
	 salary =x;
  }
  
  public int getSalary(){
		 
		 return salary;
	 }
  
  public void setName(String n){
	 name = n;
  }
  
  public String getName(){
		 
		 return name;
	 }
  
  public void setId(int y){
	 id =y;
  }
  
  public int getId(){
		 
		 return id;
	 }
  
  public boolean equals(Object o) {
	  
	  if((o==null) || getClass()!=o.getClass()) {
		  return false;
	  }
	  if(o==this) {
		  return true;
	  }
	  Employee e = (Employee)o;
	  return(this.getId() == e.getId());
  }
  
  public int hashCode() {
	  return getId();
  }
}
