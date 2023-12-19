package Game.ControllerandModel.models; 
/**
 * Deck represents a Deck of card objects
 * 
 * Initialization Ensures:
 *                  Deck contains number of card objects equal to MAXCARDS
 *                  No cards in the deck equal each other
 * 
 * Defines:
 *        numOfCards: X
 * 
 * Constraints:
 *          0 < numOfCards <= MAXCARDS
 * 
 * 
 */



public interface IDeck {

    public final int MAXCARDS = 52; 
    

    public void shuffleDeck(); 

    
}