import java.util.Scanner;
public class GameJam
{
  Dealer d = new Dealer();
  
  int dealerAmount = d.DealerAmount;
  int playerAmount = d.PlayerAmount;
  
  public static void main (String [] args)
  {
    Scanner s = new Scanner();
    Cards c = new Cards();
    Blackjack b = new Blackjack();
    System.out.println("---WELCOME TO BLACKJACK!---\nCreated by Joe, Will, and Zach");
    boolean while1 = true;
    while(while1.equals(true))
    {
      while1 = false;
      System.out.println("Type 's' to start.\nType 'r' for the rules.");
      char beginning = s.nextLine;
      if(beginning.equalsIgnoreCase('s'))
      {
        b.startGame();
      }
      else if(beginning.equalsIgnoreCase('r'))
      {
        c.Rules();
      }
      else
      {
        while1 = true;
        System.out.println("Please type a valid option.");
      }
      
      
      public void endGame //im fairly sure we still have to create the playerAmount int, but other than that i think this works
      {
       if(dealerAmount = 21)
       {
         System.out.println("Dealer has 21, Dealer wins!");
       }
        else if(playerAmount = 21)
        {
          System.out.println("You have 21, blackjack!");
        }
         else if(dealerAmount > 21)
        {
          System.out.println("Dealer has " + dealerAmount + ". Dealer has gone bust, player wins!");
        }
         else if(playerAmount > 21)
        {
          System.out.println("Dealer has " + dealerAmount + ". Player has " + playerAmount + ". Player has bust, Dealer wins!");
        }
         else if(dealerAmount && playerAmount < 21)
        {
           if(dealerAmount > playerAmount)
           {
             System.out.println("Dealer has " + dealerAmount + ". Player has " + playerAmount + ". Dealer wins!")
           }
           else if(playerAmount > dealerAmount)
           {
             System.out.println("Dealer has " + dealerAmount + ". Player has " + playerAmount + ". Player wins!")
           }
           else
           {
             System.out.println("Dealer has " + dealerAmount + ". Player has " + playerAmount + ". Its a a tie! Dealer wins!")
           }
        }
         
        
      }
      
      
      
  }
}
