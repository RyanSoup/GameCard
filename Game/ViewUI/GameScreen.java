package Game.ViewUI; 
import java.util.Scanner;

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

        System.out.println("Welcome to the Card Drinking Game!\n");
        System.out.println("Woud you like to play?\n");
        Scanner userScan; 
        String uinput;
        userScan = new Scanner(System.in); 
        uinput = userScan.nextLine(); 
        char fc = uinput.charAt(0); 
        if(checkUInput(fc)){
            deck = new Deck();
            deck.shuffleDeck();
            do{
            Card idk = deck.topOfDeck();
            String cardVal = idk.cardToString(); 
            System.out.println(cardVal); 
            System.out.println("Continue?\n");
            uinput = userScan.nextLine();
            fc = uinput.charAt(0); 
            }while(checkUInput(fc));
        }

        userScan.close();
        return; 
    }

    public static boolean checkUInput(char uin){
        if(uin == 'y' || uin == 'Y')
            return true; 
        return false; 

    }
    


}