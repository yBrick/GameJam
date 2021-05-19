import java.util.ArrayList;
import java.util.Array;
public class Cards
{
    String[] cardRowChar = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] intArray = new String[]{"--------------","|            |","|            |","void","|            |","|            |","______________",};
    public void rules()
    {
        System.out.println("");
    }

    public void test()
    {
     ArrayList<int> str = new ArrayList<int>();
       str.add(0);
       str.add(9);
       str.add(12); 
      printCards(str);
    }
  
    public void printCards(ArrayList <int> cardList)
    {
        for(int i = 0; i<7; i++)
        {
            for(int j = 0; j < cardList.size(); j++)
            {
                if(i == 3 && cardRowChar[cardList[j]].equals("10"))
                {
                    {
                        System.out.print("|     10     |");
                    }
                }
                else if(i==3)
                {
                    System.out.print("|      " + cardRowChar[cardList.get(j)] + "     |");
                }
                else
                {System.out.print(cardRow[i]);}
            }
        }
    }
    
    public void Rules()
    {
        System.out.println("The rules are simple, the goal of the game is to be the closest one to 21. \n Both you and the dealer start with two cards, you can see yours \n but you can only see one of the dealers cards. \n you have a choice to either hit or stay \n hitting gives you another card \n while staying allows you to not take one. \n if somebody goes over 21, they lose!, and if you hit exactly 21, you win!");
    
        System.out.println("Helpful Tip: The dealer has a point where they will no longer hit if they are at or above a certain value of cards. \n In this game that number is 17! once the dealer goes above that or hits it, they will no longer draw cards.");
    }

}
