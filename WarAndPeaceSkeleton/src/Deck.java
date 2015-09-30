import java.util.ArrayList;
public class Deck 
{
	private ArrayList<Card> cards;
	public Card randomCard;
	
	public Deck() 
	{
		load();
	}
	
	public void load()
	{
		cards = new ArrayList<Card>();
		for(CardSuit suit : CardSuit.values())
		{
			for(CardValue value : CardValue.values())
			{
				Card card = new Card(value, suit);
				cards.add(card);
			}
		}
	}

	public Card draw() 
	{
		int randomCard = (int) (Math.random() * cards.size()); 
		Card temp = cards.get(randomCard);
		cards.remove(randomCard);
		return temp;
	}


}
