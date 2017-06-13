package com.fawzan.de;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;

import static java.awt.geom.Arc2D.OPEN;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Circle extends Shape{

    private int x , y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public Circle(Color color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    @Override
    public void draw(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);

        g2.drawArc(x,y,radius,radius,0,360);
    }
}
