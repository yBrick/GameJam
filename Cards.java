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

}
