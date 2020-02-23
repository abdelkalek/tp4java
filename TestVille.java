/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice2;

/**
 *
 * @author Abdelkalek
 */
public class TestVille {
public static void main(String args[]) {
Ville v1,v2;
v1= new Ville ("Toulouse");
v2 = new Ville ("Strasbourg", 272975);
System.out.println(v1);
System.out.println(v2);
System.out.println();
Capitale c1, c2;
c1 = new Capitale("Paris", "France");
c2 = new Capitale("Rome", "Italie", 2700000);
c1.setNbHabitants(2181371);
System.out.println(c1);
System.out.println(c2);
System.out.println();
System.out.println("catégorie de la ville de " +
v1.getNom() + " : " + v1.categorie());
System.out.println("catégorie de la ville de " +
v2.getNom() + " : " + v2.categorie());
System.out.println("catégorie de la ville de " +
c1.getNom() + " : " + c1.categorie());
System.out.println();
}
}
