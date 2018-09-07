
public class Pixel {
    int red;
    int green;
    int blue;
    void colocarColor(int r, int g, int b){
      red = r;
      green = g;
      blue = b;   
    }
    void desaturar(){
    if(red<=125){
              red=0;
              green=0;
              blue=0;                    
    }else{ red=255;
    green=255;
    blue=255;
    }
        
    }
     }

