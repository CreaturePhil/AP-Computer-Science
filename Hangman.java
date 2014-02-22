 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.nio.charset.Charset; 
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.Random; 
import java.util.Scanner; 
public class Hangman { 
    public static void main(String[] args) { 
         
         ArrayList<String> dictionaryList = new ArrayList<String>(); 
         File file = new File("HangmanLexicon.txt"); 
            try { 
                Scanner scanner = new Scanner(file); 
                while (scanner.hasNextLine()) { 
                    String line = scanner.nextLine(); 
                    dictionaryList.add(line); 
                } 
              scanner.close(); 
            } catch (FileNotFoundException e) { 
                    e.printStackTrace(); 
            } 
             
            /*  
             * Getting the word and hiding it 
             */ 
             
            Random rng = new Random(); 
            int word = rng.nextInt(dictionaryList.size()); //randomly chooses a word from the text file 
            Scanner scanner = new Scanner(System.in); 
            int guessesLeft = 6; // the total amount of guesses the user gets 
            ArrayList<Character> alreadyGuess = new ArrayList<Character>(); // keep tracks of the user's guesses 
            boolean wordFound = false; // keeps track of when the game will end after the user runs out of guesses 
             
             
            String wordSelected = dictionaryList.get(word); //converts the int value of the randomly choose word to a string 
            char[] letters = wordSelected.toCharArray(); // converts the word to a char 
            char[] hideWord = new char[letters.length]; // gets the length of hiding the word 
            
             
            // the for loop hides the word by replacing it with '_' 
            for(int i = 0; i < letters.length; i++) { 
               hideWord[i]='_'; 
            }  
             
            /*  
             * Starts the hangman game. The while loop will keep running the game. 
             */ 
             
            while(true){ 
  
                //for testing purposes they can use the print statement below to replace the other print statement 
                //System.out.print("\n" + wordSelected + "\n" + "Word: "); 
                System.out.print("\n" + "Word: "); 
                for(int i = 0; i < letters.length; i++){ 
                    System.out.print(hideWord[i]); 
                } // Display the word 
                 
                // Allows user to input and displays the guesses that are left 
                System.out.print("\n" + "Guesses Left: " + guessesLeft +"\nAlready Guess: " + alreadyGuess + "\nGuess: ");  
                char userInput = scanner.nextLine().toUpperCase().charAt(0); // uppercase the String first, and then pick the char 
               
                // Checks to see if the user already guess the same word 
                for(int i = 0; i < alreadyGuess.size(); i++){ 
                    if(userInput==alreadyGuess.get(i)){ 
                        System.out.println("\nYou already guessed this letter. Try Again. ");  
                        break; 
                    }  
                } 
                 
                // records the user's guesses 
                if(!(alreadyGuess.contains(userInput))){ 
                    alreadyGuess.add(userInput);  
                } 
                 
                
                // Checks if the user guesses the right letter in the word 
                for(int i = 0; i < letters.length; i++) { 
                    if(userInput==letters[i]) { 
                      hideWord[i] = userInput; 
                      wordFound = true; 
                      
                    } 
                } 
 
               
            // If user guesses the incorrect letter it will display this and lower the amount of guesses 
            if(!wordFound){ 
                System.out.println("\nThe letter was not found in the word. \n"); 
                guessesLeft -= 1; 
            } 
             
             
            wordFound = false; // resets the wordFound boolean back to false 
             
            // if user runs out of guesses left, they will lose. 
            if(guessesLeft<=0){ 
                System.out.println("\nYou lose, you hanged the man."); 
                break; 
            } 
            
            // if user guesses correctly on the word, they win. Uses the array class to compare two char arrays 
            if(Arrays.equals(letters,hideWord)){ 
                System.out.println("\nWord: " + wordSelected); 
                System.out.println("\nCongratulations! You guess the right word and save the man from being hang."); 
                break; 
            } 
             
         
    } 
      } 
} 
 
