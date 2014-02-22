 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.ArrayList; 
import java.util.Random; 
import java.util.Scanner; 
  
  
public class ClassRandomizer { 
  
    public static void main(String[] args) { 
        //declare a new array list here to store the names. 
        ArrayList<String> assign = new ArrayList<String>(); 
         
        File file = new File("Period_6.txt"); 
        try { 
              
            Scanner scanner = new Scanner(file); 
  
            while (scanner.hasNextLine()) { 
                String line = scanner.nextLine(); 
                assign.add(line); 
                //assign the name to an array list here and get rid of the print statement 
                 
                 
            } 
            scanner.close(); 
        } catch (FileNotFoundException e) { 
                e.printStackTrace(); 
        } 
         
        //here, write the code to reprint the names in a random order 
        Random generator = new Random(); 
        int n = 0; 
        while(!(assign.size()==0)){ 
         
            int ran = generator.nextInt(assign.size()); 
            n++; 
            System.out.println(n+". " + assign.get(ran)); 
            assign.remove(ran); 
             
         
        } 
    } 
  
} 
