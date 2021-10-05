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
public class SRectangle extends Shape {

    Point start;
    Point end;
    int width;
    int height;
    Color color;
    int thickness;

    public SRectangle(Point start, Point end, Color color, int thickness) {
        this.start = new Point(start.x, start.y);
        this.end = end;
        this.color = color;
        this.thickness = thickness;
        width = Math.abs(start.x - end.x);
        height = Math.abs(start.y - end.y);
        if (end.y < start.y) {
            start.y = end.y;
        }
        if (end.x < start.x) {
            start.x = end.x;
        }
    }

    public void rePosition(Point rstart, Point rend) {
        if (rend.x < start.x) {
            start.x = rend.x;
            width = Math.abs(rstart.x - rend.x);
        } else if (rend.x > start.x) {
            if (start.x < rstart.x) {
                start.x = rend.x;
                width = Math.abs(rstart.x - start.x);
            }else{
            width = Math.abs(rstart.x - rend.x);
            }
        }

        if (rend.y < start.y) {
            start.y = rend.y;
            height = Math.abs(rstart.y - rend.y);
        } else if (rend.y > start.y) {
            if (start.y < rstart.y) {
                start.y = rend.y;
                height = Math.abs(rstart.y - start.y);
            } else {
                height = Math.abs(start.y - rend.y);

            }
        }

    }

    @Override
    public void Draw(Graphics graph) {
        Graphics2D g2d = (Graphics2D) graph;
        Stroke stroke = new BasicStroke(thickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2d.setStroke(stroke);
        g2d.setColor(color);
        g2d.drawRect(start.x, start.y, width, height);

    }
}
