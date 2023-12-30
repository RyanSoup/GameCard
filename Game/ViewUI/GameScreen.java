package Game.ViewUI; 


import Game.ControllerandModel.models.Card;
import Game.ControllerandModel.models.Deck;
import Game.ControllerandModel.models.IDeck;


/**
 * 
 * 
 */
public class GameScreen{

    public static IDeck deck; 


    /**
     * Main method for deck of cards
     * @pre none
     * @post deck = new Deck(); 
     * @return void
     */
    public static void main(){
        deck = new Deck(); 
        Card next = deck.topOfDeck(); 
        next.toString(); 

        return; 
    }


}