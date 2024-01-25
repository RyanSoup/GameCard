package Game.ControllerandModel.models;

import java.util.*;
 

public class Deck implements IDeck{
    public final String suites[] = {"hearts", "diamonds", "spades", "clubs"}; 
    private Card deckOfCards[];
    private int position = 0; 
/**
 *Constructor for deck of cards
 *@pre none
 *@post position = 0 AND deckOfCards = Card[MAXCARDS];
 *@return none
 */
public Deck(){
    deckOfCards = new Card[MAXCARDS]; 
    position = 0; 
    for(int i =0; i < NUMSUITS; i++){
        for(int j = 0; j < MAXCARDVALUE; j++){
            deckOfCards[position] = new Card(j, suites[i]); 
            position++; 
        }
    }
    position = 0; 
}

/**
 * Shuffles the cards in an already created deck
 * @pre complete deck
 * @post deckOfCards = [deck of cards in random order] AND position #= position and shuffleDeck = void;
 * @return void
 * 
 */
public void shuffleDeck(){
    Random rand = new Random();   
    int randNum = rand.nextInt(MAXCARDS); 
    for(int i = 0; i < 3; i++){
        for(int j = MAXCARDS -1; j > 0; j --){
            randNum = rand.nextInt(j + 1);
            Card temp = deckOfCards[j];
            deckOfCards[j] = deckOfCards[randNum];
            deckOfCards[randNum] = temp; 
        }
    }

    return; 
}

/**
 * Returns the value of the top card of the deck
 * @pre position < MAXCARDS
 * @post position += 1 AND deckOfCards #= deckOfCards AND topOfDeck = deckOfCards[position]
 * @return Card = deckOfCards[position]
 */
public Card topOfDeck(){
    position++;
    return deckOfCards[position - 1];
}


}