package unogame;

/**
 * This class +++Insert Description Here+++
 *
 * @author Ankur Savsani
 */
public class GamePlayer {

     public static void main(String[]args){        
                     
            
            CardHand s1 = new CardHand();//object to access method generate
            
           s1.generateArray();//calls the array to generate 60 cards
           
           for( Card d1 : s1.deck)//reading deck from array
           {
               System.out.println(d1.getColor()+" "+d1.getValue());
           }

        }
    
}
