package com.fawzan.de;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.ArrayList;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Main extends JPanel {

    //set width and height of a JPanel
    private static int WIDTH = 700;
    private static int HEIGHT = 600;

    private static ArrayList<Shape> listOfShapes;   //creating array list to put shapes

    public static void main(String[] args) {
        // write your code here


        JFrame frame = new JFrame("Some Shapes");    //set title

        frame.setContentPane(new Main());
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setSize(WIDTH, HEIGHT);
        frame.pack();
        frame.setVisible(true);
        

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

//        Line line = new Line(Color.red, 0, 0, 400, 600);                //create line object and send relavent parameters
//        Square square = new Square(Color.green, 400, 400, 100, 100);    //create squre object
//
        Nautilus nautilas = new Nautilus(250,250,12,1);                 //create nautilus object
        Circle circle = new Circle(Color.blue,100,100,50);              //create circle object
       Triangle triangle = new Triangle(Color.blue , 100 , 100 , 100 , 100);      //create triangle object

//        line.draw(g);                                                   //draw line
//        square.draw(g);                                                 //draw square

        nautilas.draw(g);                                               //draw nautilus
        circle.draw(g);                                                 //draw circle
        triangle.draw(g);                                               //draw triangle

    }
}
