import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
    String name= JOptionPane.showInputDialog("what is your name?");
    JOptionPane.showMessageDialog(null,"hello " +name);
    
    int age = Integer.parseInt(JOptionPane.showInputDialog("your age is"));
    JOptionPane.showMessageDialog(null,"your age is " +age);
			
    double height = Double.parseDouble(JOptionPane.showInputDialog("your height is "));
    JOptionPane.showMessageDialog(null,"your height is " +height+ "cm ");
    // TODO Auto-generated method stub

	}

}
