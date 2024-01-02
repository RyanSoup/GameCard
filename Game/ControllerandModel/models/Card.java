package Game.ControllerandModel.models;

public class Card{
    /**
    * Card object 
    * 
    * invariants:
    *         0 <= numOfCards < MAXCARDVALUE
    *         suitOfCard = ["hearts", "diamonds", "spades", "clubs"]
    * 
    * 
    */

    public final int MAXCARDVALUE = 13;  
    private int numOfCard;
    private String suitOfCard; 

    /**
     * Constructor for Card Object
     * @param number number of card
     * @param suit suit of card
     * @pre 0<=number<MAXCARDVALUE
     * @pre suit = "hearts" OR "diamonds" or "spades" or "clubs"
     * @post numOfCard = number AND suitOfCard = suit
     * 
     */
    public Card(int number, String suit){
        numOfCard = number;
        suitOfCard = suit; 

    }

    /**
     * Returns the number of the card
     * @pre none
     * @postnumOfCard #= numOfCard AND suitOfCard = suitOfCard AND getNumOfCard = numOfCard
     * @return numOfCard = [number of the card]
     */
    public int getNumOfCard(){
        return numOfCard;
    }
    
    /**
     * Returns the suit of the card
     * @pre none
     * @post numOfCard #= numOfCard AND suitOfCard #= suitOfCard AND getSuitOfCard = suitOfCard
     * @return suitOfCard = [string value of the suit of card]
     */
    public String getSuitOfCard(){
        return suitOfCard; 
    }

    /**
     * sets the numOfCard value of a Card object
     * @param number int value of the card
     * @pre 0 <= number < MAXCARDVALUE
     * @post numOfCard = number AND suitOfCard #= suitOfCard and setNumOfCard = void
     * @return void
     */
    public void setNumOfCard(int number){
        numOfCard = number;
        return; 
    }
    /**
     * sets the suitOfCard value of a Card object
     * @param suit string of suit value
     * @pre suit is a valid card suit (hearts, diamomds, clubs, or spades)
     * @post numOfCard #= numOfCard AND suitOfCard = suit AND setSuitOfCard = void
     * @return void
     */
    public void setSuitOfCard(String suit){
        suitOfCard = suit; 
        return;
    }
    

    /**
     * Compares two instances of card objects to see if they are equal
     * @param obj Card Object
     * @pre obj is a valid Card Object
     * @post numOfCard #= numOfCard AND suitOfCard #= suitOfCard AND isEquals = [true if equals, OW false]
     * @return [true if objects are equal, OW false]
     */
    public Boolean isEquals(Object obj){
        if( obj instanceof Card){
            Card checkCard = (Card) obj; 
            if(this.numOfCard == checkCard.getNumOfCard() 
            && this.suitOfCard.equals(checkCard.getSuitOfCard())){
                    return true; 
            }
        }
        return false; 
    }
    
    /**
     * Creates a string of Card 
     * @pre none
     * @post numOfCard #= numOfCard AND suitOfCard #= suitOfCard AND cardToString = out
     * @return [string of card including its number and suit]
     */
    public String cardToString(){
        String out = "The "+this.getNumOfCard()+" of "+this.getSuitOfCard()+".";
        return out;

    }

}