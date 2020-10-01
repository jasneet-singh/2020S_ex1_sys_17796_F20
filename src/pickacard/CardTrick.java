package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author MuZhang
 */
public class CardTrick {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];
      
         for (int i = 0; i < magicHand.length; i++) {
              Card c = new Card();
            //c.setValue(insert call to random number generator here)
               c.setValue((int)(Math.random() * 12));
           
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            //it is a String
               c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
        }

        //insert code to ask the user for Card value and suit, create their card
       System.out.println("please pick any card in the deck");
        
         int valuePick = (int)(Math.random() * 12);
         String suitPick = Card.SUITS[(int)(Math.random() * 3)];
        
         System.out.println("your card's value is: "+ valuePick);
          System.out.println("your card's suit is: "+ suitPick);
         
         
        /* System.out.println("please enter the Card value and suit");
        
          int valueGuess = sc.nextInt();
          String suitGuess = sc.nextLine();*/
        
        // and search magicHand here
         
       
        //Then report the result here
         Card c = new Card();
        if(valuePick == c.getValue() && suitPick.equals(c.getSuit())){
            System.out.println("your card is in the magic hand of random cards");}
        else{
            System.out.println("your card is not in the magic hand of random cards");
        }
      
    }

}
