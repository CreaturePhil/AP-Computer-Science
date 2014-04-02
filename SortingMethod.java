
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 
 
public class SortingMethod {
 
    public static void main(String[] args) {
          ArrayList<String> nameListSelection = new ArrayList<String>();
          ArrayList<String> nameListInsertion = new ArrayList<String>();
          File file = new File("ProduceList.txt");
          try {
              Scanner scanner = new Scanner(file);
              while (scanner.hasNextLine()) {
                  String line = scanner.nextLine();
                  nameListSelection.add(line);
                  nameListInsertion.add(line);
              }
            scanner.close();
          } catch (FileNotFoundException e) {
                  e.printStackTrace();
          }
          System.out.println("Selection Sort:\n----------------------\n");
          System.out.print(selectionSort(nameListSelection));
          System.out.println("\n\nInsertion Sort:\n------------------\n");
          System.out.println(insertionSort(nameListInsertion));
       
 
    }
    
    public static ArrayList<String> selectionSort(ArrayList<String> nameList) {
        int min;
        String temp;
        
        for (int index = 0; index < nameList.size() - 1; index++) {
            min = index;
            
            for (int scan = index + 1; scan < nameList.size(); scan++){
                if(nameList.get(scan).compareTo(nameList.get(min)) < 0) {
                    min = scan;
                }
            }
            
            temp = nameList.get(min);
            nameList.set(min, nameList.get(index));
            nameList.set(index, temp);
        }
        return nameList;
    }
    
    public static ArrayList<String> insertionSort(ArrayList<String> nameList) {
		for (int index = 1; index < nameList.size(); index++) {
			String key = nameList.get(index);
			int position = index;
			
			//shift larger value to the right
			while (position > 0 && key.compareTo(nameList.get(position-1)) < 0) {
				nameList.set(position, nameList.get(position-1));
				position--;
			}
			
			nameList.set(position, key);
		}
		return nameList;
	}
 
}

