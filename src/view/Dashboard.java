package view;
import control.*;
import Sobel.*;
import Filtering.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Dashboard extends javax.swing.JFrame {
    
    static Image image;
    static Dimension size;
    static BufferedImage prosesImage;
    static BufferedImage prosesImage3;
    static BufferedImage prosesImage2;
    static pcd_ctrl Gambar;
    //static grayscale gs_process;
    
    public Dashboard() {
        pcd_ctrl ctrl = new pcd_ctrl();
        Sobel prosesSobel = new Sobel();
        Neighbor neighbor = new Filtering.Neighbor();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fc = new javax.swing.JFileChooser();
        lbl_prop = new javax.swing.JLabel();
        worksheet = new javax.swing.JPanel();
        origin = new javax.swing.JLabel();
        panel_utama = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        info = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        lvlBrightness = new java.awt.Scrollbar();
        lblBrightness = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lvlContrast = new java.awt.Scrollbar();
        lblContrast = new javax.swing.JTextField();
        lvlThresMin = new java.awt.Scrollbar();
        lblThresMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        OpenImg = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        Equalize = new javax.swing.JMenuItem();
        Histogram = new javax.swing.JMenuItem();
        color = new javax.swing.JMenu();
        Brightness = new javax.swing.JMenuItem();
        Contrast = new javax.swing.JMenuItem();
        bw = new javax.swing.JMenuItem();
        Invert = new javax.swing.JMenuItem();
        Threshold = new javax.swing.JMenuItem();
        Grayscale = new javax.swing.JMenuItem();
        filter = new javax.swing.JMenu();
        mean = new javax.swing.JMenuItem();
        median = new javax.swing.JMenuItem();
        edge = new javax.swing.JMenu();
        sobel = new javax.swing.JMenuItem();

        fc.setDialogTitle("Open Image");
        fc.setName("fc"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pengolahan Citra");
        setResizable(false);

        lbl_prop.setText("jLabel1");

        worksheet.setPreferredSize(new java.awt.Dimension(1050, 550));
        worksheet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        origin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        origin.setPreferredSize(new java.awt.Dimension(300, 230));
        worksheet.add(origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 0, -1, -1));

        panel_utama.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_utama.setName(""); // NOI18N
        worksheet.add(panel_utama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 475));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        worksheet.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 0, 10, 600));
        worksheet.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 485, 700, -1));
        info.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setText("Brightness");
        worksheet.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, 24));

        lvlBrightness.setMaximum(255);
        lvlBrightness.setMinimum(-255);
        lvlBrightness.setName(""); // NOI18N
        lvlBrightness.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        lvlBrightness.setPreferredSize(new java.awt.Dimension(127, 16));
        lvlBrightness.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                lvlBrightnessAdjustmentValueChanged(evt);
            }
        });
        worksheet.add(lvlBrightness, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 169, 24));

        lblBrightness.setEditable(false);
        lblBrightness.setBackground(java.awt.Color.lightGray);
        lblBrightness.setText("0");
        lblBrightness.setPreferredSize(new java.awt.Dimension(50, 15));
        lblBrightness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBrightnessActionPerformed(evt);
            }
        });
        worksheet.add(lblBrightness, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 40, 24));

        jLabel4.setText("Constrast");
        worksheet.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, 24));

        lvlContrast.setMaximum(255);
        lvlContrast.setMinimum(-255);
        lvlContrast.setName(""); // NOI18N
        lvlContrast.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        lvlContrast.setPreferredSize(new java.awt.Dimension(127, 16));
        lvlContrast.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                lvlContrastAdjustmentValueChanged(evt);
            }
        });
        worksheet.add(lvlContrast, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 169, 24));

        lblContrast.setEditable(false);
        lblContrast.setBackground(java.awt.Color.lightGray);
        lblContrast.setText("0");
        lblContrast.setPreferredSize(new java.awt.Dimension(50, 15));
        lblContrast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblContrastActionPerformed(evt);
            }
        });
        worksheet.add(lblContrast, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, 40, 24));

        lvlThresMin.setMaximum(255);
        lvlThresMin.setName(""); // NOI18N
        lvlThresMin.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        lvlThresMin.setPreferredSize(new java.awt.Dimension(127, 16));
        lvlThresMin.setUnitIncrement(10);
        lvlThresMin.setValue(127);
        lvlThresMin.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                lvlThresMinAdjustmentValueChanged(evt);
            }
        });
        worksheet.add(lvlThresMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 169, 24));

        lblThresMin.setEditable(false);
        lblThresMin.setBackground(java.awt.Color.lightGray);
        lblThresMin.setText("127");
        lblThresMin.setPreferredSize(new java.awt.Dimension(50, 15));
        lblThresMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblThresMinActionPerformed(evt);
            }
        });
        worksheet.add(lblThresMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, 40, 24));

        jLabel6.setText("Threshold");
        worksheet.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, 24));

        file.setText("File");

        OpenImg.setText("Open Image");
        OpenImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenImgActionPerformed(evt);
            }
        });
        file.add(OpenImg);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        file.add(Save);

        jMenuBar1.add(file);

        edit.setText("Edit");

        Equalize.setText("Equalize");
        Equalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualizeActionPerformed(evt);
            }
        });
        edit.add(Equalize);

        Histogram.setText("Histogram");
        Histogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistogramActionPerformed(evt);
            }
        });
        edit.add(Histogram);

        jMenuBar1.add(edit);

        color.setText("Color");

        Brightness.setText("Brightness");
        Brightness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrightnessActionPerformed(evt);
            }
        });
        color.add(Brightness);

        Contrast.setText("Contrast");
        Contrast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrastActionPerformed(evt);
            }
        });
        color.add(Contrast);

        bw.setText("Black-white");
        bw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bwActionPerformed(evt);
            }
        });
        color.add(bw);

        Invert.setText("Invert");
        Invert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvertActionPerformed(evt);
            }
        });
        color.add(Invert);

        Threshold.setText("Threshold");
        Threshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThresholdActionPerformed(evt);
            }
        });
        color.add(Threshold);

        Grayscale.setText("Grayscale");
        Grayscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrayscaleActionPerformed(evt);
            }
        });
        color.add(Grayscale);

        jMenuBar1.add(color);

        filter.setText("Filter");

        mean.setText("Mean");
        mean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meanActionPerformed(evt);
            }
        });
        filter.add(mean);

        median.setText("Median");
        median.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianActionPerformed(evt);
            }
        });
        filter.add(median);

        jMenuBar1.add(filter);

        edge.setText("Edge Detection");

        sobel.setText("Sobel");
        sobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobelActionPerformed(evt);
            }
        });
        edge.add(sobel);

        jMenuBar1.add(edge);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(worksheet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(worksheet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void OpenImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenImgActionPerformed
        //OPEN FILE IMAGE
        int open = fc.showOpenDialog(lbl_prop);
        String url=null;
        if (open == JFileChooser.APPROVE_OPTION) {
            pcd_ctrl.setGambar(fc.getSelectedFile().getPath());
            int pu_w=panel_utama.getWidth();
            int pu_h=panel_utama.getHeight();
            int or_w=origin.getWidth();
            int or_h=origin.getHeight();
            panel_utama.setIcon(new ImageIcon(new ImageIcon(pcd_ctrl.getGambar()).getImage().getScaledInstance(pu_w, pu_h, Image.SCALE_DEFAULT)));
            origin.setIcon(new ImageIcon(new ImageIcon(pcd_ctrl.getGambar()).getImage().getScaledInstance(or_w, or_h, Image.SCALE_DEFAULT)));
        }else{
            JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan FILE");
        }
        
        String img = pcd_ctrl.getGambar();
        info.setText("Alamat Gambar : "+pcd_ctrl.getGambar());
        System.out.println(pcd_ctrl.getGambar());
    }//GEN-LAST:event_OpenImgActionPerformed
        
    private void EqualizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualizeActionPerformed
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);  
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        
        BufferedImage nImg = new BufferedImage(size.width, size.height, BufferedImage.TYPE_BYTE_GRAY);
        WritableRaster wer = prosesImage.getRaster();
        WritableRaster er = nImg.getRaster();
        int totpix= wer.getWidth()*wer.getHeight();
        int[] histogram = new int[256];

        for (int x = 0; x < wer.getWidth(); x++) {
            for (int y = 0; y < wer.getHeight(); y++) {
                histogram[wer.getSample(x, y, 0)]++;
            }
        }
        
        int[] chistogram = new int[256];
        chistogram[0] = histogram[0];
        for(int i=1;i<256;i++){
            chistogram[i] = chistogram[i-1] + histogram[i];
        }
        
        float[] arr = new float[256];
        for(int i=0;i<256;i++){
            arr[i] =  (float)((chistogram[i]*255.0)/(float)totpix);
        }
        
        for (int x = 0; x < wer.getWidth(); x++) {
            for (int y = 0; y < wer.getHeight(); y++) {
                int nVal = (int) arr[wer.getSample(x, y, 0)];
                er.setSample(x, y, 0, nVal);
            }
        }
        nImg.setData(er);
        BufferedImage image2 = nImg;
        
        panel_utama.setIcon(new ImageIcon(new ImageIcon(image2).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
        drawHistogram(image2);
    }//GEN-LAST:event_EqualizeActionPerformed

    private void HistogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistogramActionPerformed
        // HISTOGRAM
        Histogram histogram = new Histogram();
        if(pcd_ctrl.getGambar()==null){
            JOptionPane.showMessageDialog(rootPane, "Silahkan import gambar terlebih dahulu");
        }else{
            image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
            size = new Dimension();
            size.width = image.getWidth(null);
            size.height = image.getHeight(null);
            setPreferredSize(size);  
            prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            Graphics g = prosesImage.getGraphics();
            g.drawImage(image, 0, 0, null);

            for (int x = 0; x < size.width; x++) {
                for (int y = 0; y < size.height; y++) {
                    int RGB = prosesImage.getRGB(x, y);
                    int alpha = (RGB << 24) & 0xFF;
                    int red = (RGB >> 16) & 0xFF;
                    int green = (RGB >> 8) & 0xFF;
                    int blue = (RGB) & 0xFF; //shift ke 0
                }
            }
            static_size();
            panel_utama.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
            drawHistogram(prosesImage);
        }
    }//GEN-LAST:event_HistogramActionPerformed

    private void BrightnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrightnessActionPerformed
        // Brightness
        brightness();
    }//GEN-LAST:event_BrightnessActionPerformed

    private void ContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrastActionPerformed
        // CONTRAST
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        
        if(pcd_ctrl.getGambar() == null){
            JOptionPane.showMessageDialog(rootPane, "Silahkan import gambar terlebih dahulu");
        }else{
            int add = lvlContrast.getValue();
            size = new Dimension();
            size.width = image.getWidth(null);
            size.height = image.getHeight(null);
            setPreferredSize(size);
            prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            prosesImage2 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            Graphics g = prosesImage.getGraphics();
            g.drawImage(image, 0, 0, null);

            for (int x = 0; x < size.width; x++){
                for (int y = 0; y < size.height; y++){
                    int RGB = prosesImage.getRGB(x, y);
                    int alpha = (RGB << 24) & 0xFF;
                    int red = (RGB >> 16) & 0xFF;
                    int green = (RGB >> 8) & 0xFF;
                    int blue = (RGB) & 0xFF;
                    int avg = (red + green + blue ) / 3;
                    int co = 2;
                    red = co *(red - add) + add;
                    green = co *(green - add) + add;
                    blue = co *(blue - add) + add;
                    if (red < 0 ){
                        red=0;
                    }
                    if (green < 0){
                        green=0;
                    }
                    if (blue < 0){
                        blue=0;
                    }
                    if (red > 255){
                        red=255;
                    }
                    if (green > 255){
                        green=255;
                    }
                    if (blue > 255){
                        blue=255;
                    }
                    int rgb2 = (alpha >> 24) | (red << 16) |(green << 8) | blue;
                    prosesImage.setRGB(x, y, rgb2);
                    static_size();
                }
            }
            panel_utama.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
            drawHistogram(prosesImage);
            drawHistogram();
        }
    }//GEN-LAST:event_ContrastActionPerformed

    private void InvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvertActionPerformed
        // invert
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        
        if(pcd_ctrl.getGambar() == null){
            JOptionPane.showMessageDialog(rootPane, "Silahkan import gambar terlebih dahulu");
        }else{
            size = new Dimension();
            size.width = image.getWidth(null);
            size.height = image.getHeight(null);
            setPreferredSize(size);
            prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            prosesImage2 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            Graphics g = prosesImage.getGraphics();
            g.drawImage(image, 0, 0, null);

            for (int x = 0; x < size.width; x++){
                for (int y = 0; y < size.height; y++){
                    int RGB = prosesImage.getRGB(x, y);
                    int alpha = (RGB << 24) & 0xFF;
                    int red = (RGB >> 16) & 0xFF;
                    int green = (RGB >> 8) & 0xFF;
                    int blue = (RGB >> 0) & 0xFF;
                    int avg = (red + green + blue ) / 3;
                    red = 255-red;
                    green = 255-green;
                    blue = 255-blue;
                    int rgb2 = (alpha >> 24) | (red << 16) |(green << 8) | blue;
                    prosesImage.setRGB(x, y, rgb2);
                    static_size();
                }
            }
            panel_utama.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
            drawHistogram(prosesImage);
            drawHistogram();
        }
    }//GEN-LAST:event_InvertActionPerformed

    private void GrayscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrayscaleActionPerformed
        // Grayscale
        grayscale();
        panel_utama.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
        drawHistogram(prosesImage);
    }//GEN-LAST:event_GrayscaleActionPerformed

    private void bwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwActionPerformed
        //black white
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);  
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_BYTE_BINARY);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, Color.WHITE, null);
        g.dispose();

        panel_utama.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
        drawHistogram(prosesImage);
    }//GEN-LAST:event_bwActionPerformed

    private void lvlBrightnessAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_lvlBrightnessAdjustmentValueChanged
        lvlBrightness.setMaximum (265);
        lvlBrightness.setMinimum (-255);
        int angka = lvlBrightness.getValue();
        String getAngka = String.valueOf(angka);
        lblBrightness.setText(getAngka);
    }//GEN-LAST:event_lvlBrightnessAdjustmentValueChanged

    private void lvlContrastAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_lvlContrastAdjustmentValueChanged
        lvlContrast.setMaximum (265);
        lvlContrast.setMinimum (-255);
        int angka = lvlContrast.getValue();
        String getAngka = String.valueOf(angka);
        lblContrast.setText(getAngka);
    }//GEN-LAST:event_lvlContrastAdjustmentValueChanged

    private void lblContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblContrastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblContrastActionPerformed

    private void lblBrightnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBrightnessActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblBrightnessActionPerformed

    private void meanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meanActionPerformed
        String fileFilter = pcd_ctrl.getGambar();
        if(fileFilter==null){
            JOptionPane.showMessageDialog(rootPane, "upload gambar dahulu!");
        }else{
            File targetImage = new File(fileFilter);
            Mean mean = new Mean();
            mean.filter(targetImage);
            
//            panel_utama.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
//            drawHistogram(prosesImage);
        }
    }//GEN-LAST:event_meanActionPerformed

    private void medianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianActionPerformed
        // Median Filter
        String fileFilter = pcd_ctrl.getGambar();
        if(fileFilter==null){
            JOptionPane.showMessageDialog(rootPane, "upload gambar dahulu!");
        }else{
            File targetImage = new File(fileFilter);
            Median median = new Median();
            median.filter(targetImage);
            
//            panel_utama.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
//            drawHistogram(prosesImage);
        }
    }//GEN-LAST:event_medianActionPerformed

    private void sobelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobelActionPerformed
        // edge detection sobel
        String fileSobel = pcd_ctrl.getGambar();
        int [] sobel_y =  {
            1, 0, -1, 
            2, 0, -2,
            1, 0, -1
        };

        int [] sobel_x = {
            1, 2, 1, 
            0, 0, 0,
            -1, -2, -1
        };
        
        System.out.println("Loading Image...");
        BufferedImage imgIn = null;
        try {
            imgIn = ImageIO.read(new File(fileSobel));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Done!" );
        
        System.out.println("Transforming to greyscale image..." );
        BufferedImage imgGrey = Sobel.greyscale(imgIn);
        try {
            ImageIO.write(imgGrey, "PNG", new File("greyscale.png"));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Done!" );

        System.out.println("Edgedetection in progress... " );
        
        BufferedImage edgesX = Sobel.edgeDetection(imgGrey, sobel_x);
        try {
            ImageIO.write(edgesX, "PNG", new File("edgesX.png"));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedImage edgesY = Sobel.edgeDetection(imgGrey, sobel_y);
        try {
            ImageIO.write(edgesY, "PNG", new File("edgesY.png"));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedImage sobel = Sobel.sobel(edgesX,edgesY);
        try {
            ImageIO.write(sobel, "PNG", new File("sobel.png"));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Proses Selesai!");
        System.out.println("Done!" );
    }//GEN-LAST:event_sobelActionPerformed

    private void ThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThresholdActionPerformed
        // TODO add your handling code here:
        if(pcd_ctrl.getGambar() == null){
            JOptionPane.showMessageDialog(rootPane, "Silahkan import gambar terlebih dahulu");
        }else{
            int nThresMin = lvlThresMin.getValue();
            size = new Dimension();
            size.width = image.getWidth(null);
            size.height = image.getHeight(null);
            setPreferredSize(size);
            prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            Graphics g = prosesImage.getGraphics();
            g.drawImage(image, 0, 0, null);
            BufferedImage finalThresholdImage = new BufferedImage(size.width,size.height,BufferedImage.TYPE_INT_RGB) ;
            for (int x = 0; x < size.width; x++) {
                for (int y = 0; y < size.height; y++) {
                    int RGB = prosesImage.getRGB(x, y);
                    int red = (RGB >> 16) & 0xFF;
                    int green = (RGB >> 8) & 0xFF;
                    int blue = (RGB >> 0) & 0xFF;
                    int avg = (red+green+green)/3; 
                    if(avg < nThresMin) {
                        finalThresholdImage.setRGB(x,y,mixColor(0, 0,0));
                    } else{
                        finalThresholdImage.setRGB(x,y,mixColor(255, 255,255));
                    }
                }
            }
            panel_utama.setIcon(new ImageIcon(new ImageIcon(finalThresholdImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
            drawHistogram(finalThresholdImage);
            drawHistogram();
        }
    }//GEN-LAST:event_ThresholdActionPerformed

    private void lvlThresMinAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_lvlThresMinAdjustmentValueChanged
        lvlThresMin.setMaximum (265);
        lvlThresMin.setMinimum (0);
        int angka = lvlThresMin.getValue();
        String getAngka = String.valueOf(angka);
        lblThresMin.setText(getAngka);
    }//GEN-LAST:event_lvlThresMinAdjustmentValueChanged

    private void lblThresMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblThresMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThresMinActionPerformed
    
    public static int mixColor(int red, int green, int blue) {
        return red<<16|green<<8|blue;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    
    public void static_size(){
        if (panel_utama.getWidth() >= 800) {
            panel_utama.setSize(800, 550);
            origin.setSize(200, 130);
        }
    }
    
    public void brightness(){
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        String t_add = lblBrightness.getText();
        int add = Integer.parseInt(t_add);
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage2 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);

        for (int x = 0; x < size.width; x++){
            for (int y = 0; y < size.height; y++){
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >> 0) & 0xFF;
                int avg = (red + green + blue ) / 3;
                red = red + add;
                green = green + add;
                blue = blue + add;
                if (red < 0 ){
                    red=0;
                }
                if (green < 0){
                    green=0;
                }
                if (blue < 0){
                    blue=0;
                }
                if (red > 255){
                    red=255;
                }
                if (green > 255){
                    green=255;
                }
                if (blue > 255){
                    blue=255;
                }
                int rgb2 = (alpha >> 24) | (red << 16) |(green << 8) | blue;
                prosesImage.setRGB(x, y, rgb2);
                static_size();
            }
        }
        panel_utama.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(panel_utama.getWidth(), panel_utama.getHeight(), Image.SCALE_DEFAULT)));
    }
    
    //start histogram
    private void drawHistogram(){
        BufferedImage test2 = null ;
        try {
            test2 = ImageIO.read(new File(pcd_ctrl.getGambar()));
        } catch (IOException e) {
            System.out.println(e);
        }
        int width = test2.getWidth();
        int height = test2.getHeight();
        int count[][] = new int[4][0x100];
        int RED = 0;
        int BLUE = 1;
        int GREEN = 2;
        int total = width * height;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int color = test2.getRGB(i, j);
                int cRed = (color & 0x00ff0000) >> 16;
                int cGreen = (color & 0x0000ff00) >> 8;
                int cBlue = color & 0x000000ff;
                int gry = (cRed + cGreen + cBlue)/3;
                count[RED][cRed]++;
                count[GREEN][cGreen]++;
                count[BLUE][cGreen]++;
                count[3][gry]++;
                //System.out.println(count[i][j]);
            }
        }
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (int f = 0; f < 0x100; f++) {
            dataset.addValue(count[0][f], "Red" , new Integer(f));
            dataset.addValue(count[1][f], "Green", new Integer(f));
            dataset.addValue(count[2][f], "Blue" , new Integer(f));
            dataset.addValue(count[3][f], "Black", new Integer(f));
        }
        
        try {
            JFreeChart chart = ChartFactory.createBarChart("Histogram RGB", "Nilai", "Frekuensi", dataset,PlotOrientation.VERTICAL,false,true,false);
            ChartFrame frame = new ChartFrame("Lihat Histogram", chart);
            chart.setBackgroundPaint(Color.WHITE);
            final CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.WHITE);
            plot.setRangeGridlinePaint(Color.RED);
            frame.setSize(500, 350);
            frame.setVisible(true);
            frame.setLocation(380, 200);
            frame.setTitle(pcd_ctrl.getGambar());
            String status = frame.getTitle();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void drawHistogram(BufferedImage test){
        int width = test.getWidth();
        int height = test.getHeight();
        int count[][] = new int[4][0x100];
        int RED = 0;
        int BLUE = 1;
        int GREEN = 2;
        int total = width * height;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int color = test.getRGB(i, j);
                int cRed = (color & 0x00ff0000) >> 16;
                int cGreen = (color & 0x0000ff00) >> 8;
                int cBlue = color & 0x000000ff;
                int gry = (cRed + cGreen + cBlue)/3;
                count[RED][cRed]++;
                count[GREEN][cGreen]++;
                count[BLUE][cGreen]++;
                count[3][gry]++;
                //System.out.println(count[i][j]);
            }
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (int f = 0; f < 0x100; f++) {
            dataset.addValue(count[0][f], "Red" , new Integer(f));
            dataset.addValue(count[1][f], "Green", new Integer(f));
            dataset.addValue(count[2][f], "Blue" , new Integer(f));
            dataset.addValue(count[3][f], "Black", new Integer(f));
        }
        
        try {
            JFreeChart chart = ChartFactory.createBarChart("Histogram RGB", "Nilai", "Frekuensi", dataset,PlotOrientation.VERTICAL,false,true,false);
            ChartFrame frame = new ChartFrame("Lihat Histogram", chart);
            chart.setBackgroundPaint(Color.WHITE);
            final CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.WHITE);
            plot.setRangeGridlinePaint(Color.RED);
            frame.setSize(600, 450);
            frame.setVisible(true);
            frame.setLocation(frame.getWidth()/2, frame.getHeight()/2);
            frame.setTitle(pcd_ctrl.getGambar());
            String status = frame.getTitle();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //end histogram
    
    //start gray
    private void grayscale(){
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);  
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);

        for(int y = 0; y < size.height; y++){
            for(int x = 0; x < size.width; x++){
                int p = prosesImage.getRGB(x,y);

                int a = (p>>24)&0xff;
                int r = (p>>16)&0xff;
                int gr = (p>>8)&0xff;
                int b = p&0xff;

                //calculate average
                int avg = (r+gr+b)/3;

                //replace RGB value with avg
                p = (a<<24) | (avg<<16) | (avg<<8) | avg;

                prosesImage.setRGB(x, y, p);
            }
        }
    }
    //end gray

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Brightness;
    private javax.swing.JMenuItem Contrast;
    private javax.swing.JMenuItem Equalize;
    private javax.swing.JMenuItem Grayscale;
    private javax.swing.JMenuItem Histogram;
    private javax.swing.JMenuItem Invert;
    private javax.swing.JMenuItem OpenImg;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem Threshold;
    private javax.swing.JMenuItem bw;
    private javax.swing.JMenu color;
    private javax.swing.JMenu edge;
    private javax.swing.JMenu edit;
    private javax.swing.JFileChooser fc;
    private javax.swing.JMenu file;
    private javax.swing.JMenu filter;
    private java.awt.Label info;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lblBrightness;
    private javax.swing.JTextField lblContrast;
    private javax.swing.JTextField lblThresMin;
    private javax.swing.JLabel lbl_prop;
    private java.awt.Scrollbar lvlBrightness;
    private java.awt.Scrollbar lvlContrast;
    private java.awt.Scrollbar lvlThresMin;
    private javax.swing.JMenuItem mean;
    private javax.swing.JMenuItem median;
    private javax.swing.JLabel origin;
    private javax.swing.JLabel panel_utama;
    private javax.swing.JMenuItem sobel;
    private javax.swing.JPanel worksheet;
    // End of variables declaration//GEN-END:variables
}