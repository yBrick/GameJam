import java.util.Random;
import java.util.Arraylist;
public class Dealer
{
  Blackjack b = new Blackjack();
  Random r = new Random();
  int cardAmt = 2;
  public void Hit()
  {
   
  }
  
  public void Stay()
  {
    
  }
  
  public void Deal()
  {
    
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
      DealerAmount = DealerAmount + DealerCards.get(i);
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
