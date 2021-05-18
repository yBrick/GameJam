import java.util.Random;
import java.util.Arraylist;
public class Dealer
{
  GameJam g = new GameJam();
  Blackjack b = new Blackjack();
  Random r = new Random();
  int cardAmt = 2;
  public void DealerHit()
  {
   
  }
  
  public void DealerStay()
  {
    
  }
  
  public void PlayerHit()
  {
  }
  
  public void PlayerHit()
  {
  }
  
  public void Deal()
  {
    int Dealer1 = cardGen();
    int Dealer2 = cardGen();    
    b.DealerCards.add(Dealer1);
    b.DealerCards.add(Dealer2);
    System.out.println("Dealer's Cards:");
    c.printCards(b.DealerCards)
      if(Dealer1 + Dealer2 >= 21)
    {
      g.endGame();
    }
    int Player1 = cardGen();
    int Player2 = cardGen();
   
    b.PlayerCards.add(Player1);
    b.PlayerCards.add(Player2);
    System.out.println("\nPlayer's Cards:");
    c.printCards(b.PlayerCards)
       if(Player1 + Player2 >= 21)
    {
      g.endGame();
    }
  }
  public int cardGen()
  {
    return r.nextInt(12);
  }
  public boolean DealerChoice()
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
      }
      return DealerStay;
    }
  }
  
}
