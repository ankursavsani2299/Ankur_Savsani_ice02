package unogame;

/**
 * This class +++Insert Description Here+++
 *
 * @author Ankur Savsani
 */
public class Card {

    public enum Color{RED, YELLOW, GREEN, BLUE};
    private Color color;
    
    
    //enum declaration to avoid string
    
    public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, COLOUR, SKIP, REVERSE ,DRAWTWO, DRAWFOUR, WILDCARD};
    private Value value;

    public Card(Color c, Value v){
        this.color=c;
        this.value=v;
    }

    /**
     * @return the value
     */
    
    
    public Value getValue() {
        return value;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }
    

}
