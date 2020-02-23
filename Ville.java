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
public class Ville {
private String   nomVille; 
private int  nbHabitants; 
  public  Ville(String NomVille) 
  {
      this.nomVille = NomVille.toUpperCase() ; 
  }

   public Ville(String NomVille, int habitants)
   {
             this.nomVille = NomVille.toUpperCase() ; 
             this.nbHabitants = habitants; 
   }

   protected String getNom() {
      return this.nomVille;
    }
   protected int getNbHabitants()
   {
       if (this.nbHabitants== 0)
       {
          return 0; 
       } else 
       {
       return this.nbHabitants; 
       }
   } 
   protected void  sethabitants(int i)
    {
        if (i<0)
       {
          this.nbHabitants=  0; 
       } else 
       {
          this.nbHabitants = i ; 
       }
    }
   
   public boolean nbHabitantsConnu()// 
   {
       if (this.nbHabitants== 0)
       {
       return false ;
       } else 
       {
      return true ;    
       }
 
   }
   /* pour le categorie par classe (A =  0 à  999999)
  ( B =  1000000 à  1999999)
   ( C =  de 2000000 a plus ) 
*/
    protected String categorie() {
        
      if(this.nbHabitants>0 && this.nbHabitants<999999) 
          {return" A";}
             else if(this.nbHabitants>1000000 && this.nbHabitants<2000000)
                {return" B";} 
             else if(this.nbHabitants>=2000000)
                {return " C";}
             else 
             {
                   return" ?";           
             }
     
    }
@Override
   public  String toString()
    {
       if (this.nbHabitantsConnu())
       {
          return "Ville de "+this.nomVille+"  ; "+this.nbHabitants+"  habitants."; 
       }else{
        return "Ville de "+this.nomVille; }
    }
  
   
}
