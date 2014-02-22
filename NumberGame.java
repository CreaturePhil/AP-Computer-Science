import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGame {

	public static void main(String[] args) {
	
		int user = Integer.parseInt(JOptionPane.showInputDialog("Pick a number between 1 and 10: "));
		
		Random ran = new Random();
		
		int computer = ran.nextInt(10)+1;
		
		int userp = 0; // short for user's points
		
		int comp = 0; // short for computer's points
		
		while(user != -1){
		
		computer = ran.nextInt(10)+1;
		
		if (user == computer){
		
			user = Integer.parseInt(JOptionPane.showInputDialog("You pick the right number!" + "\n Counter: " + (userp++) + "\n" + "User's Points: " + userp + "\n" + "Computer's Points: " + comp
			
			+ "\n " + "Keep going or type -1 to exit"));
		
		}
		
		else {
		
			user = Integer.parseInt(JOptionPane.showInputDialog("You pick the wrong number!" + "\n Counter: 1" + (comp++) + "\n" + "User's Points: " + userp + "\n" + "Computer's Points: " + comp
			
			+ "\n" + "\n " + "Try again or type -1 to exit"));
		
		}
		
		}
		
		JOptionPane.showMessageDialog(null, "Final Score" + "\n " + "\n" + "User's Points: " + userp + "\n" + "Computer's Points: " + comp);
		
	}

}
