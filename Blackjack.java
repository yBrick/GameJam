import java.util.Scanner();
import java.util.ArrayList();

public class Blackjack
{
  
  ArrayList <Integer> DealerCards = new ArrayList <Integer>();
   ArrayList <Integer> PlayerCards = new ArrayList <Integer>();
  
  Boolean PlayerStay = false;
  
  GameJam g = new GameJam();
  
  Scanner sc = new Scanner(System.in);
  
  Dealer d = new Dealer();
  
  Cards c = new Cards();
  
  public void startGame()
  {
    d.Deal();

  
    
    Choice();
    
  }
      
                       
   public int Choice()
   {
     System.out.println("Please select an option:\n [1] Hit \n [2] Stay ");
     
     int gameChoice = sc.nextInt();
     
     if(gameChoice = 1)
     {
       d.PlayerHit();
       d.DealerChoice()
     }
     else if(gameChoice = 2)
     {
       d.PlayerStay();
       d.DealerChoice();
       
     }
     else()
     {
       Sytsem.out.println("Please choose a valid option");
       Choice();
     }
     

   }
  
  

  
           
    public void checkStay()
    {
      if(PlayerStay = true && d.DealerStay = true)
      {
        d.EndGame();
        
      }

     
      
    }
  
  
  
 
}
