/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filtering;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author shohibulbait
 */
public class Median extends Neighbor implements FilterContract{
    private final String context = "median";
    private BufferedImage image, newImage;
    private int width, height;

    @Override
    public void filter(File file) {
        try {
            image = ImageIO.read(file);
            newImage = ImageIO.read(file);
            width = image.getWidth();
            height = image.getHeight();

            for (int row = 0; row < width; row++) {
                for (int col = 0; col < height; col++) {
                    int red = this.redProcess(context, image, row, col, width, height);
                    int green = this.greenProcess(context, image, row, col, width, height);
                    int blue = this.blueProcess(context, image, row, col, width, height);
                    
                    newImage.setRGB(row, col, new Color(red, green, blue).getRGB());
                }
            }

            this.output();
        } catch (IOException e) {
            System.out.println("Error:\t" + e.getMessage());
        }
    }

    @Override
    public void output() {
        try {
            File output = new File("/home/shohibulbait/Pictures/picFilter/median.jpg");
            ImageIO.write(newImage, "jpg", output);
            JOptionPane.showMessageDialog(null, "Gambar terfilter mean telah diupload pada : "+output);
            System.out.println("Filter Median outputed!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
