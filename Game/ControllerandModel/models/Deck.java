package Game.ControllerandModel.models;

import Game.ControllerandModel.models.Card;
//import Game.ControllerandModel.models.IDeck;

public class Deck implements IDeck{
    public final String suites[] = {"hearts", "diamonds", "spades", "clubs"}; 
    private Card deckOfCards[];
    private int position; 
/**
 *Constructor for deck of cards
 *
 *
 */
public Deck(){
    deckOfCards = new Card[52]; 
    position = 0; 
    for(int i =0; i < 4; i++){
        for(int j = 0; j < 13; j++){
            deckOfCards[position] = new Card(j, suites[i]); 
            position++; 
        }
    }
    position = 0; 
}

public void shuffleDeck(){

    return; 
}

public Card topOfDeck(){
    position++;
    return deckOfCards[position -1];
}


}