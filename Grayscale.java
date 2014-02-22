public void toGrayscale(){ 
  Pixel[][] pixels = this.getPixels2D(); 
  for (int i = 0; i < pixels.length; i++){ 
	  for(int j = 0; j < pixels[i].length; j++){ 
		  int average = (int)pixels[i][j].getAverage(); 
		  pixels[i][j].setRed(average); 
		  pixels[i][j].setBlue(average); 
		  pixels[i][j].setGreen(average); 
	  } 
	} 
} 
