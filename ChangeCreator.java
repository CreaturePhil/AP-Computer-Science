import javax.swing.JOptionPane; 
 
public class ChangeCreator { 
 
	public static void main(String[] args) { 
	 
	 
		String PayUp; 
		PayUp = JOptionPane.showInputDialog("Enter your money here: "); 
		double Amount = Double.parseDouble(PayUp); 
		 
		final double TWENTY, TEN, FIVE, ONE, QUARTER, DIME, NICKEL, PENNY; 
		TWENTY = 20; 
		TEN = 10; 
		FIVE = 5; 
		ONE = 1; 
		QUARTER = .25; 
		DIME = .10; 
		NICKEL = .05; 
		PENNY = .01; 
		 
		double twenties, tens, fives, ones, quarters, dime, nickels, pennies; 
		twenties = Amount/TWENTY; 
		tens = (Amount%TWENTY)/TEN; 
		fives = ((Amount%TWENTY)%TEN)/FIVE; 
		ones = (((Amount%TWENTY)%TEN)%FIVE)/ONE; 
		quarters = ((((Amount%TWENTY)%TEN)%FIVE)%ONE)/QUARTER; 
		dime = (((((Amount%TWENTY)%TEN)%FIVE)%ONE)%QUARTER)/DIME; 
		nickels = ((((((Amount%TWENTY)%TEN)%FIVE)%ONE)%QUARTER)%DIME)/NICKEL; 
		pennies = (((((((Amount%TWENTY)%TEN)%FIVE)%ONE)%QUARTER)%DIME)%NICKEL)/PENNY; 
		 
		JOptionPane.showMessageDialog(null, (int)twenties + " Twenty Dollar Bills" 
		+ "\n" + (int)tens + " Ten Dollar Bills"  
		+ "\n" + (int)fives + " Five Dollar Bills" 
		+ "\n" + (int)ones + " One Dollar Bills" 
		+ "\n" + (int)quarters + " Quarters" 
		+ "\n" + (int)dime + "  Dimes" 
		+ "\n" + (int)nickels + " Nickels" 
		+ "\n" + (int)(pennies+0.1) + " Pennies"); //adds 0.1 because of floating point number
		 
	 
	} 
 
} 
 
 
