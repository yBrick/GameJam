import java.util.ArrayList;
import java.util.Array;
public class Cards
{
  public rules()
  {
    System.out.println("");
  }
  
  public printCards(ArrayList <int> cardList)
  {
   for(int i = 0; i<7; i++)
   {
     for(int j = 0; j < cardList.size(); j++)
     {
       if(i==3)
       {
         System.out.print("|        " + cardRowChar + "       |");
       }
       else
       {System.out.print(cardRow[i]);}
     }
   }
 }

}
