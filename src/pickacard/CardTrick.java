package pickacard;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        
       
           Scanner scan = new Scanner(System.in);
           System.out.println("Please enter number between 1-7");
           int ab = scan.nextInt(); 
           if (ab > 7){
               System.out.println("Please enter number between 1-7");
           }
           else{
        //   String qsuits= suits[rsuits];
         //  String.join("", qsuits);
         //   c.setSuit = String( wsuits);
          Card[] magicHand = new Card[7];

       
        for (int i = 0; i < magicHand.length; i++) {
            int am = i;
            Card c = new Card( );
         String[] suits = new String[]{"Hearts", "Diamonds", "Spades", "Clubs"};
           int rsuits = new Random().nextInt(suits.length );
           String qsuits = suits[rsuits];
           String wsuits = new String(qsuits);
           
         Random Rnumbers = new Random();
       
        double numbers = Rnumbers.nextInt(13);
          //  double numbers = Rnumbers.nextInt(qnumbers);
           c.setValue((int) numbers + 1    );
           
          
         
            System.out.println(c.getValue()+ " of " + qsuits); //c.getSuit());
            
         if (c.getValue() == 7 && qsuits=="Spades"){
             System.out.print("Choosen card is from magic card.");
             
        }
         else {
             System.out.print("Choosen card is not from magic card.");
         }
           

      // I edit directly on github
    }
           }

}
}
