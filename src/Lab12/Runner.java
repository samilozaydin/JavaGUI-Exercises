/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Bilal
 */
public class Runner extends JPanel implements Runnable {

    ArrayList<String> images;
    int state;
    boolean isRunning;
    Thread runThread;
    int delay;

    public Runner(String runnerName) {
        super();
        this.setOpaque(false);
        images = new ArrayList<>();
        String imagePath = this.getClass().getClassLoader().getResource(runnerName).getFile();
        File file = new File(imagePath);
        File[] files = file.listFiles();
        state = 0;
        delay = 0;
        isRunning = false;

        for (File x : files) {
            images.add(x.getAbsolutePath());
        }
        runThread = new Thread(this);
    }

    public void Start(int delay) {
        this.delay = delay;
        state = 0;
        isRunning = true;
        runThread.start();
    }

    public void nesState() {
        state = (state + 1) % 10;
        setLocation(getLocation().x + 1, getLocation().y);

    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        try {
            super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.

            BufferedImage image = ImageIO.read(new File(images.get(state)));
            grphcs.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        } catch (IOException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run() {
        while (isRunning) {
            try {
                nesState();
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
