package com.fawzan.de;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Nautilus extends Shape{

    private double x , y;                                 //coordinates of starting point
    private int count;                                    //no.of arc
    private int scale;                                    //size of arc

    public Nautilus(double x, double y, int count , int scale) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.scale = scale;
    }

    public Nautilus(Color color, double x, double y, int count , int scale) {
        super(color);
        this.x = x;
        this.y = y;
        this.count = count;
        this.scale = scale;
    }
    //fibonacci function to get radius of  each arc

    public int fib(int n){

        int n1 =1;
        int n2 = 1;
        int sum = 1;

        if(n<2){
            return n*scale;
        }

        for(;n>2;n--){
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
        }
        return sum*scale;
    }

    //ovrride draw method that is in shape class to draw nautilus shape
    @Override
    public void draw(Graphics g) {

        double x1 = x;                          //assigning x value that we get as a input parameter to the x1
        double y1 = y;                          //assigning y value that we get as a input parameter to the y1
        double x2 =0,y2 =0;                     //creating new coordinates variable for another point of curve
        double ctrlx = 0,ctrly = 0;             //get coordinates points that are controlling the curve
        int i=1;
        int height = 0 , width = 0;             //get height and width to draw frame of nautilus

        while (i <= count) {
            switch (i % 4) {
                case 0:
                    x2 = x1 + fib(i);           //get another point of curve using fibonacci algorithm
                    y2 = y1 + fib(i);
                    ctrlx = x1;                 //then get cntrol points
                    ctrly = y2;
                    break;
                case 1:
                    x2 = x1 + fib(i);
                    y2 = y1 - fib(i);
                    ctrlx = x2;
                    ctrly = y1;
                    break;
                case 2:
                    x2 = x1 - fib(i);
                    y2 = y1 - fib(i);
                    ctrlx = x1;
                    ctrly = y2;
                    break;
                case 3:
                    x2 = x1 - fib(i);
                    y2 = y1 + fib(i);
                    ctrlx = x2;
                    ctrly = y1;
                    break;
            }
            Arc arc = new Arc(Color.blue, x1, y1, x2, y2, ctrlx, ctrly);  //create new object of arc
            arc.draw(g);                                                  //draw arc
            x1 = x2;                                                      //assigning another point of curve to the starting point of next curve
            y1 = y2;
            i++;

        }
        if (count % 4 == 1) {
            height = fib(count);                                              //get height and width for the frame of a shape
            width = fib(count) + fib(count - 1);
            Square square = new Square((int)x1,(int)y1,-width,height);        //create frame
            square.draw(g);
        }else if(count % 4 == 2){
            width = fib(count);                                              //get height and width for the frame of a shape
            height = fib(count) + fib(count - 1);
            Square square = new Square((int)x1,(int)y1,width,height);        //create frame
            square.draw(g);
        }else if(count % 4 == 3){
            height = fib(count);                                              //get height and width for the frame of a shape
            width = fib(count) + fib(count - 1);
            Square square = new Square((int)x1,(int)y1,width,-height);        //create frame
            square.draw(g);
        }else{
            width = fib(count);                                              //get height and width for the frame of a shape
            height = fib(count) + fib(count - 1);
            Square square = new Square((int)x1,(int)y1,-width,-height);        //create frame
            square.draw(g);
        }
                                                          //draw that frame
    }
}


