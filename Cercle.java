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
public class Cercle {
  public Point centre;
  public double r ;
    public  Cercle(Point c ,double r)
    {
       this.centre = c ; 
       this.r = r;
        
    }
    public void deplaceCentre(double a , double b )
    {
       this.centre.setX(a); 
       this.centre.setY(b); 
    }
    public void changerRayon(double R)
    {
        this.r = R;
    }
  
    public Point getCentre()
    {
      return this.centre;   
    }
    public String toString()
    {
    return "les coordonnées du centre du cercle X= "+this.centre.getX()+" et Y= "+this.centre.getY()+" ,Et   "+this.r+" de son rayon.";   
    }
}
