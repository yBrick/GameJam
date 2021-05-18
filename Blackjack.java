import java.util.Scanner();
import java.util.ArrayList();

public class Blackjack
{
  
  ArrayList <String> DealerCards = new ArrayList <String>();
   ArrayList <String> PlayerCards = new ArrayList <String>();
  
  Scanner sc = new Scanner(System.in);
  
  Dealer d = new Dealer();
  
  Cards c = new Cards();
  
  public void startGame()
  {
    d.Deal();

    System.out.println("Cards Equal: " + d.cardValue);
    
    Choice();
    
  }
      
                       
   public int Choice()
   {
     System.out.println("Please select an option:\n 1. Hit \n 2. Stay \n 3. Bet");
     
     int gameChoice = sc.nextInt();
     
     if(gameChoice = 1)
     {
       d.Hit();
     }
     else if(gameChoice = 2)
     {
       d.Stay();
     }
     else if(gameChoice = 3)
     {
       d.AddBet();
       d.Hit();
     }
     else()
     {
       Sytsem.out.println("Please choose a valid option");
       Choice();
     }
     
       continueGame();
   }
  
  
  
                        
     public void continueGame()
     {
       
     }  
      
  
    public void printCards()
    {
      for (int i = 0; i < 
      
      
    }
  
  
  
 
}
