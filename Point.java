/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

/**
 *
 * @author Abdelkalek
 */
public class Point {
    private double x,y; 
    public Point(double x1 , double y2)
    {
       x =x1; 
       y =y2; 
    }
    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public void setX(double k){x=k;}
    public void setY(double y){this.y=y;}
    public void deplace(double dx , double dy)
    {
        x+=dx;
        y+=dy;
    }
    public String toString()
    {
        return "Point de coordonnees:"+x+","+y; 
    }
     
}
