import java.util.Scanner; 
  
 public class ArrayGrades { 
  
    public static void main(String[] args) { 
         
       final int GRADES_LENGTH = 5; 
       double[] grades = new double[GRADES_LENGTH]; 
         
       Scanner input = new Scanner(System.in); 
       System.out.print("Enter first grade: "); 
       grades[0] = input.nextDouble(); 
        
       System.out.print("Enter second grade: "); 
       grades[1] = input.nextDouble(); 
        
       System.out.print("Enter third grade: "); 
       grades[2] = input.nextDouble(); 
        
       System.out.print("Enter fourth grade: "); 
       grades[3] = input.nextDouble(); 
        
       System.out.print("Enter fifth grade: "); 
       grades[4] = input.nextDouble(); 
        
       for(int i = 0; i < grades.length; i++){ 
       System.out.print(grades[i] + " "); 
       } 
        
       double average = 0;  
        
       for(double digit:grades){ 
       average += digit; 
       } 
        
       System.out.println("\n" + "Average of the five grades is: " + average/5); 
        
    } 
     
     
  
} 
 
