package com.fawzan.de;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Triangle extends Shape{

    private  int x;
    private int y;
    private int width;
    private int height;

    public Triangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Triangle(Color color, int x, int y, int width, int height) {
        super(color);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {


        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);

        g2.draw(new Line2D.Double(x , y , x+width , y ));
        g2.draw(new Line2D.Double(x+width , y , (x/2)+width , y+height ));
        g2.draw(new Line2D.Double((x/2)+width , y+height , x , y ));
    }
}
