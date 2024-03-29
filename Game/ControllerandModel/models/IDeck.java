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
    public final int MAXCARDVALUE = 13;
    public final int NUMSUITS = 4;
    
/**
 * Shuffles the deck of cards
 * 
 * @pre none
 * @post self = [randomized placement of Cards in self] AND shuffleDeck = void
 * @return none
 * 
 */
    public void shuffleDeck(); 
/**
 * Returns the card at the top of the deck
 * @pre none
 * @post self #= self AND position +=1 AND topOfDeck = Card
 * @return Card object at top of deck 
 */

    public Card topOfDeck();


    /**
     * Checks to see if end of deck has been reached
     * @pre none
     * @post self #=self and endOfDeck = [true if position in deck < MAXCARDS, OW false]
     * @return boolean of whether end of deck has been reached
     */
    public boolean endOfDeck();

    
}