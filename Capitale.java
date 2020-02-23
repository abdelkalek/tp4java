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
public class Capitale extends Ville {
    private String capitale ; 
  public   Capitale(String  v1, String c) {
      super(v1);
      this.capitale = c.toUpperCase() ; 
    }

   Capitale(String c, String v1, int habitans) {
      super(v1,habitans);
      this.capitale = c.toUpperCase() ; 
    }

     public void setNbHabitants(int i) {
        super.sethabitants(i);
    }

    @Override
    protected String getNom() {
        return super.getNom();
    }
    @Override
    public String toString()
    {
       return  super.toString()+"Capitale de "+this.capitale;
    }
    
}
