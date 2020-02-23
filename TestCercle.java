package Exercice1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdelkalek
 */
public class TestCercle {
public static void main(String[] args) {
        Cercle c = new Cercle(new Point(5,4), 3);

System.out.println(c);
c.deplaceCentre(1, 0.5);
c.changerRayon(5.25);
System.out.println(c);
Point pt = c.getCentre();
System.out.println(pt);
}
}

