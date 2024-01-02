package Game.ControllerandModel.test;

import org.junit.Assert.*; 
import org.junit.Test;

import Game.ControllerandModel.models.Card; 



public class CardTest {
    
    public String createTestCardToString(int number, String suit){
        return "The "+number+" of "+suit+".";
    }

    String testCardToString(Object obj){
        if(obj instanceof Card){
            Card newObj = (Card)obj;
            String out = "The "+newObj.getNumOfCard()+" of "+newObj.getSuitOfCard()+".";
            return out;
        }
            return "0";
    }


    @Test 
    public void CardConstructor(){
        Card testC = new Card(1, "hearts");
        assertEquals(createTestCardToString(1, "hearts"), (testCardToString(testC))); 
    }

    
}
