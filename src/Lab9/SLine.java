/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.awt.BasicStroke;
import java.awt.Color;
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
public class SLine extends Shape {

    Point start;
    Point end;
    Color color;
    int thickness;
    public SLine(Point start, Point end, Color color, int thickness) {
        this.start = start;
        this.end = end;
        this.color = color;
        this.thickness = thickness;
    }

    @Override
    public void Draw(Graphics graph) {
        Graphics2D g2d = (Graphics2D) graph;
        Stroke stroke = new BasicStroke(thickness, BasicStroke.CAP_ROUND,BasicStroke.JOIN_MITER);
        g2d.setStroke(stroke);
        g2d.setColor(color);
        g2d.drawLine(start.x, start.y, end.x, end.y);

    }
}
