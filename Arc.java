package com.fawzan.de;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.QuadCurve2D;

/**
 * Created by Computers on 8/4/2016.
 */

public class Arc extends Shape {

    //fiedls
    private double x1 , y1;
    private double x2 , y2;
    private double ctrlx , ctrly;

    //constructors
    public Arc(double x1, double y1, double x2, double y2, double ctrlx, double ctrly) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.ctrlx = ctrlx;
        this.ctrly = ctrly;
    }

    //constructor with color(in shape class)
    public Arc(Color color, double x1, double y1, double x2, double y2, double ctrlx, double ctrly) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.ctrlx = ctrlx;
        this.ctrly = ctrly;
    }

    //override method that is in shape class
    @Override
    public void draw(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);

        g2.draw(new QuadCurve2D.Double(x1,y1,ctrlx,ctrly,x2,y2));  //draw arc
    }
}


