public void copyFlip(int x, int y, int width, int height, int newX, int newY){ 
	Pixel[][] pixels = this.getPixels2D(); 
	Color[][] temp = new Color[width][height]; 
	for(int r = 0; r < width; r++){ 
		for(int c = 0; c < height; c++){ 
			temp[r][c] = pixels[x+width-r][y+height-c].getColor(); 
		} 
	} 
	for(int r = 0; r < width; r++){ 
		for(int c = 0; c < height; c++){ 
			pixels[newX + r][newY + c].setColor(temp[r][c]); 
		} 
	} 
} 
