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


    
}