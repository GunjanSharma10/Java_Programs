
public class Pizza {
  String crust;
  String cheese;
  String toppings;
  int cost;
  // constructors and constructor overloading
  public Pizza(){
	  System.out.println("No Pizza!!! ");
  }
  
  public Pizza(String crust){
	  this.crust=crust;
  }
  
  public Pizza(String crust, String cheese) {
	  this.crust=crust;
	  this.cheese=cheese;
  }
  
  public Pizza(String crust, String cheese, String toppings) {
	  this.crust=crust;
	  this.cheese=cheese;
	  this.toppings=toppings;
  }
  
  public Pizza(String crust, String cheese, String toppings, int cost) {
	  this.crust=crust;
	  this.cheese=cheese;
	  this.toppings=toppings;
	  this.cost=cost;
  }
}
