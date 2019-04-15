
/**
 * Write a description of class MyFamilyTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyFamilyTree
{
    public static void main (String [] args) {
        
        
        
     Node me = new Node("Juan Andrés");
         Node dad= new Node("Camilo");
         me.right=dad;
         Node mom=new Node("Mery");
         me.left=mom;
         
         //The parents of my Parents
         Node grandPa=new Node("Omar");
         dad.right=grandPa;
         Node grandMom=new Node("Rosalba");
         dad.left=grandMom;
         
         Node grandPad=new Node("Pablo");
         Node grandMomm=new Node("Luisa");
         mom.left=grandMomm;
         mom.right=grandPad;   
        
        System.out.println("My grandmother is " + me.left.left);
    }
   
}
