import javax.swing.JOptionPane; 
 
public class JOptionPaneClass { 
 
	public static void main(String[] args) { 
	 
		String num1, num2; 
		num1 = JOptionPane.showInputDialog("Enter a integer: "); 
		num2 = JOptionPane.showInputDialog("Enter another integer:"); 
		 
		int num1m = Integer.parseInt(num1); 
		int num2m = Integer.parseInt(num2); 
		 
		JOptionPane.showMessageDialog(null, "The addition of " +num1 + " and " + num2+ " is " + (num1m+num2m) 
		+ "\n The subtraction of " + num1 + " and " + num2 + " is " + (num1m-num2m) 
		+ "\n The multiplication of " + num1 + " and " + num2 + " is " + (num1m*num2m) 
		+ "\n The division of " + num1 + " and " + num2 + " is " + (num1m/num2m) 
		+ "\n The modulus of " + num1 + " and " + num2 + " is " + (num1m%num2m)); 
		 
		 
	 
	 
	 
	} 
 
} 
 
