import java.util.Random;
import java.util.Arraylist;
public class Dealer
{
  GameJam g = new GameJam();
  Blackjack b = new Blackjack();
  Random r = new Random();
 
  public void DealerHit()
  {
    System.println("The Dealer Hits");
   int DealerAdd = cardGen();
    b.DealerCards.add(DealerAdd);
    c.printCards(b.DealerCards);
  }
  
  
  public void PlayerHit()
  {
    System.out.println("You Hit");
    int PlayerAdd = cardGen();
    b.PlayerCards.add(PlayerAdd);
    c.printCards(b.PlayerCards);
  for(i : b.PlayerCards)
    {
       int PlayerAmount = 0;
   PlayerAmount = PlayerAmount + b.PlayerCards.get(i);
      
    }
    if(PlayerAmount >= 21 )
    {
      endGame();
    }
    
  }
  
  public void PlayerStay()
  {
    System.out.println("You Stay");
    b.PlayerStay = true;
  }
  
  public void Deal()
  {
    int Dealer1 = cardGen();
    int Dealer2 = cardGen();    
    b.DealerCards.add(Dealer1);
    System.out.println("Dealer's Cards:");
    c.printCards(b.DealerCards);
       b.DealerCards.add(Dealer2);
      int DealerAmount = Dealer1 + Dealer2;
      if(Dealer1 + Dealer2 >= 21)
    {
      c.printCards(b.DealerCards);
      endGame();
    }
    int Player1 = cardGen();
    int Player2 = cardGen();   
    b.PlayerCards.add(Player1);
    b.PlayerCards.add(Player2);
    System.out.println("\nPlayer's Cards:");
    c.printCards(b.PlayerCards)
      int PlayerAmount = Player1+Player2;
       if(Player1 + Player2 >= 21)
    {
      endGame();
    }
  }
  public int cardGen()
  {
    return r.nextInt(12);
  }
  public void DealerChoice()
  {
    for(i : b.DealerCards)
    {
       int DealerAmount = 0;
      DealerAmount = DealerAmount + b.DealerCards.get(i);
      if(DealerAmount > 17)
      {
        boolean DealerStay = true;
      }
      else
      {
        
        boolean DealerStay = false;
        DealerHit();
      }
      //will ive realized its easier for you to add to the dealers card amount in dealer instead of blackjack, 
      //if i went stupid and messed up feel free to change it up in my code
    }
   public void endGame //im fairly sure we still have to create the playerAmount int, but other than that i think this works
      {
       if(dealerAmount = 21)
       {
         System.out.println("Dealer has 21, Dealer wins!");
       }
        else if(playerAmount = 21)
        {
          System.out.println("You have 21, Blackjack!");
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
