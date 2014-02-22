  public void darken(double factor){ 
      Pixel[][] pixels = this.getPixels2D(); 
      double factorPercentage = factor/100; 
      double factorAbsolutePercentage = 1 - factorPercentage; 
      for (int i = 0; i < pixels.length; i++){ 
          for(int j = 0; j < pixels[i].length; j++){ 
             double redDarken = pixels[i][j].getRed()*factorAbsolutePercentage; 
             int redCast = (int)redDarken; 
             double blueDarken = pixels[i][j].getBlue()*factorAbsolutePercentage; 
             int blueCast = (int)blueDarken; 
             double greenDarken = pixels[i][j].getGreen()*factorAbsolutePercentage; 
             int greenCast = (int)greenDarken; 
             pixels[i][j].setRed(redCast); 
             pixels[i][j].setBlue(blueCast); 
             pixels[i][j].setGreen(greenCast); 
          } 
      } 
  } 
