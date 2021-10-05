/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjeDeneme;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Bilal
 */
public class DegradedPanel extends JPanel {

    private static int HORIZONTAL = 0;
    private static int VERTICAL = 1;
    private static int DIAGONAL_UP = 2;
    private static int DIAGONAL_DOWN = 3;

    private Color color1;
    private Color color2;
    private int direction;

    public DegradedPanel() {
        super();
 
        color1 = Color.BLACK;
        Color color = new Color(74,148,242);
        color2 = Color.WHITE;
    }

    public DegradedPanel(Color color1, Color color2) {
        super();
        this.color1 = color1;
        this.color2 = color2;
    }

    public DegradedPanel(Color color1, Color color2, int direction) {
        super();
        this.color1 = color1;
        this.color2 = color2;
        this.direction = direction;
    }

    @Override
    protected void paintComponent(Graphics x ){
        super.paintComponent(x);
        
        Graphics2D g2d = (Graphics2D) x;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        
        GradientPaint backColor= new GradientPaint(0,0, color1,0, getHeight(), color2);
        g2d.setPaint(backColor);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
    
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor2() {
        return color2;
    }

    public static int getHORIZONTAL() {
        return HORIZONTAL;
    }

    public static int getVERTICAL() {
        return VERTICAL;
    }

    public static int getDIAGONAL_UP() {
        return DIAGONAL_UP;
    }

    public static int getDIAGONAL_DOWN() {
        return DIAGONAL_DOWN;
    }

}
