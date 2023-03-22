
public class calculate {

    int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b){
         return  a*b;
    }
    int multiply(int a,int b,int c){
        return  a*b*c;
   }

public static void main(String[] args) {

        calculate obj = new calculate();
        int c = obj.multiply(5,4);
        int d = obj.multiply(5,4,2);
        double e = obj.multiply(5.1,4.2);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method of 3 no: returns integer : " + d);
        System.out.println("Mutiply method : returns double : " +  e);

}
}

	


