import java.util.Scanner; 
public class ScannerClass { 
 
	public static void main(String[] args) { 
	 
		int num1, num2; 
		 
		int add, sub, multi, div, modulus; 
		Scanner scan = new Scanner (System.in); 
		System.out.print("What is the first number? "); 
		num1 = scan.nextInt(); 
		System.out.print("What is the second number? "); 
		num2 = scan.nextInt(); 
		 
		add = num1 + num2; 
		 
		sub = num1 - num2; 
		 
		multi = num1*num2; 
		 
		div = num1/num2; 
		 
		modulus = num1%num2; 
		 
		System.out.println("The addition of " + num1 + " and " + num2 + " is " + add); 
		 
		System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + sub); 
		 
		System.out.println("The multiplication of " + num1 + " and " + num2 + " is " +  
		 
		multi); 
		 
		System.out.println("The division of " + num1 + " and " + num2 + " is " + div); 
		 
		System.out.println("The modulus of " + num1 + " and " + num2 + " is " +  
		 
		modulus); 
 
} 
 
} 
 
 
