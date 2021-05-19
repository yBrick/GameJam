import java.util.Scanner;
public class GameJam
{
 

  
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
     
         
        
      }
      
      
      
  }
}
