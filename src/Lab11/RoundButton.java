/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;

/**
 *
 * @author Bilal
 */
public class RoundButton extends JButton {

    public RoundButton() {
        Dimension dim = new Dimension(100, 50);
        this.setSize(dim);
    }

    @Override
    protected void paintComponent(Graphics grap) {
//        super.paintComponent(grap);
        Graphics2D g2d = (Graphics2D) grap;
        g2d.setPaint(new GradientPaint(2.0f, 10.0f, Color.DARK_GRAY, 2.0f, 10.0f,Color.BLUE,true));
        g2d.fill(new Ellipse2D.Double(0, 0, 100, 50));

        if (getModel().isArmed()) {
            
        } else {

        }
    }
}
