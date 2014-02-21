import java.util.Random; 
import javax.swing.JOptionPane; 
 
public class RPS { 
	public static void main(String[] args) { 
	 
		int zero, one, two; 
		zero = 0; //rock 
		one = 1; //paper 
		two = 2; //scissor 
		 
		int user = Integer.parseInt(JOptionPane.showInputDialog("Insert 0 for Rock, 1 for Paper, or 2 for Scissor: ")); 
		Random ran = new Random(); 
		int computer = ran.nextInt(2); 
		 
		if (user == computer) 
		JOptionPane.showMessageDialog(null, "User: " + user + "\n" +  "Computer: " + computer + "\n" + "It's a tie!"); 
		 
		// rock beats scissor 
		if (user == zero && computer == two) 
		JOptionPane.showMessageDialog(null,"User: " + user + "\n" +  "Computer: " + computer + "\n" + "User Won!"); 
		if (user == two && computer == zero) 
		JOptionPane.showMessageDialog(null,"User: " + user + "\n" +  "Computer: " + computer + "\n" + "Computer Won!"); 
		 
		// scissor beats paper 
		if (user == two && computer == one) 
		JOptionPane.showMessageDialog(null,"User: " + user + "\n" +  "Computer: " + computer + "\n" + "User Won!"); 
		if (user == one && computer == two) 
		JOptionPane.showMessageDialog(null,"User: " + user + "\n" +  "Computer: " + computer + "\n" + "Computer Won!"); 
		 
		// paper beats rock 
		if (user == one && computer == zero) 
		JOptionPane.showMessageDialog(null,"User: " + user + "\n" +  "Computer: " + computer + "\n" + "User Won!"); 
		if (user == zero && computer == one) 
		JOptionPane.showMessageDialog(null,"User: " + user + "\n" +  "Computer: " + computer + "\n" + "Computer Won!"); 
		 
	} 
 
} 
 
 
