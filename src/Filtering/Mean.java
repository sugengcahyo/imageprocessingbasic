package Filtering;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Mean extends Neighbor {
    private final String context = "mean";
    private BufferedImage image, newImage;
    private int width, height;

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
        } catch (Exception e) {
            System.out.println("Error:\t" + e.getMessage());
        }
    }

    public void output() {
        try {
            File output = new File("/home/shohibulbait/Pictures/picFilter/mean.jpg");
            ImageIO.write(newImage, "jpg", output);
            JOptionPane.showMessageDialog(null, "Gambar terfilter mean telah diupload pada : "+output);
            System.out.println("Filter Mean outputed!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
