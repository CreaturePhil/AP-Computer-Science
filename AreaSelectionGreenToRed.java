public void areaSelectionGreenToRed(int x, int y, int width, int height){ 
    Pixel[][] pixels = this.getPixels2D(); 
    for(int r = 0; r < width; r++){ 
        for(int c = 0; c < height; c++){ 
            if( pixels[x+c][y+r].getGreen() > 70 &&  
            pixels[x+c][y+r].getBlue() < 50 && 
            pixels[x+c][y+r].getRed() < 130) 
            { 
            pixels[x+c][y+r].setRed(255); 
            pixels[x+c][y+r].setBlue(0); 
            pixels[x+c][y+r].setGreen(0); 
        } 
        }  
    } 
 
} 
