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


    public static void main(String[] args){
        deck = new Deck(); 
        deck.shuffleDeck();
        Card idk = deck.topOfDeck();
        String cardVal = idk.cardToString(); 
        System.out.println(cardVal); 
        Card testsC = new Card(10, "clubs"); 
        System.out.println(testsC.cardToString());


        return; 
    }


}