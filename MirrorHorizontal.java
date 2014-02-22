public void mirrorHorizontal(){ 
	Pixel[][] pixels = this.getPixels2D(); 
	for (int column = 0; column < pixels[0].length; column++){ 
		for(int row = 0; row < pixels.length; row++){ 
			Pixel point = pixels[row][column]; 
			pixels[pixels.length-1-row][column].setColor(point.getColor()); 
		} 
	}  
} 
   
