package control;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;

public class pcd_ctrl {
    
    static String gambar,gambar2;
    static BufferedImage prosesImage;
    static double noise;
    static int c;
    private static FileInputStream fis;
    private final BufferedImage negativeImage;
    
    public pcd_ctrl() {
        this.negativeImage = null;
    }
    
    //get start
    public static String getGambar() { 
        return gambar;
    }
    
    public static String getHistogram(){
        return null;
    }
    
    public BufferedImage getNegativeImage() {
        return this.negativeImage;
    }
    //get end
    
    //sett start
    public static String setGambar(String x) {
        return gambar = x; 
    }
    
    //sett end
    
    //start tampil gambar
//    public void tampilkanImage(String url) {
//        BufferedImage loadImg = loadImage(url);
//        ImageIcon img = new ImageIcon(resize(loadImg, panel_utama.getWidth(), panel_utama.getHeight()));
//        panel_utama.setIcon(img); 
//    }
//    
//    private BufferedImage loadImage(String url) {
//        BufferedImage bimg = null;
//        try {
//            bimg = ImageIO.read(new File(url));
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(rootPane, "File Salah", url, HEIGHT);
//        }
//        return bimg; 
//    }
//    
//    private BufferedImage resize(BufferedImage img, int newW, int newH) {
//        int w = img.getWidth();
//        int h = img.getHeight();        
//        BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
//        Graphics2D g = dimg.createGraphics();
//        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//        g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);
//        g.dispose();
//        return dimg; 
//    }
    //end tampil gambar
    
}
