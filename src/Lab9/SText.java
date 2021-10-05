/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;

/**
 *
 * @author Bilal
 */
/**
 *
 * @author Bilal
 */
public class SText extends Shape {

    Point start;
    String text;
    Color color;
    int thickness;
    Font font;
    public SText(Point start, String text, Color color, int thickness) {
        this.start = start;
        this.text = text;
        this.color = color;
        this.thickness = thickness;
        font = new Font("Comic Sans MS",Font.BOLD,thickness);
            
        
    }

    @Override
    public void Draw(Graphics graph) {
        Graphics2D g2d = (Graphics2D) graph;
        Stroke stroke = new BasicStroke(thickness, BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER);
        g2d.setFont(font);
        g2d.setColor(color);
        g2d.drawString(this.text,start.x, start.y);

    }
}
