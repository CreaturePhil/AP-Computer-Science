public void negate(){ 
	Pixel[][] pixels = this.getPixels2D(); 
	for (int i = 0; i < pixels.length; i++){ 
		for(int j = 0; j < pixels[i].length; j++){ 
			int negativeRed = 255 - pixels[i][j].getRed(); 
			int negativeBlue = 255 - pixels[i][j].getBlue(); 
			int negativeGreen = 255 - pixels[i][j].getGreen(); 
			pixels[i][j].setRed(negativeRed); 
			pixels[i][j].setBlue(negativeBlue); 
			pixels[i][j].setGreen(negativeGreen); 
		} 
	} 
} 	
