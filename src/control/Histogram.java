package control;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Histogram {
    String gambar;
    static Image image;
    static Dimension size;
    static BufferedImage prosesImage;
    static BufferedImage prosesImage3;
    static BufferedImage prosesImage2;
    static pcd_ctrl Gambar;
    
    public void drawHistogram(){
        this.gambar=null;
    }
    
    public void pisahRGB(int a, int b){
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB) & 0xFF; //shift ke 0
            }
        }
    }
    
    public void brighness(){
        
    }
}