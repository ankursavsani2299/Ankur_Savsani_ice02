package unogame;

/**
 * This class +++Insert Description Here+++
 *
 * @author Ankur Savsani
 */
public class CardHand {

     private int numberofcards = 60;
   
   Card[] deck = new Card[numberofcards];//array of object declaration
   
   //array for generate 60 card in array
   int count = 0;
   
   public void generateArray(){
       
       for(Card.Color c:Card.Color.values())//read colors
       {
            
           for(Card.Value v:Card.Value.values())//read values
           {
                deck[count] = new Card(c,v);//constructor
   
                count++;
                
           
           }
                   
       
       }

    }
    
}
