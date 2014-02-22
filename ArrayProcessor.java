 
public class ArrayProcessor { 
 
	int[] array; 
	public ArrayProcessor(int[] value){ 
		this.array = value; 
	} 
	 
	public int getFirstInstance(int value){ 
		for(int i = 0; i < array.length; i++){ 
			if(value==array[i]){ 
				return i; 
			} 
		} 
		return -1; 
	} 
	 
	public int getLastInstance(int value){ 
		for(int i = (array.length-1); i >= 0; i--){ 
			if(value==array[i]){ 
				return i; 
			} 
		} 
		return -1; 
	} 
	 
	public int getTotalInstances(int value){ 
		int count = 0; 
		for (int i = 0; i < array.length; i++){ 
			if(value==array[i]){ 
				count ++; 
			} 
		} 
		if(count==0){ 
			return -1; 
		} 
		return count; 
	 
	} 
	
} 
 
 
