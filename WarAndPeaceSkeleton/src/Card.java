
public class Card 
{
	private CardValue value;
	private CardSuit suit;
	
	public Card(CardValue value, CardSuit suit)
	{
		this.value = value;
		this.suit = suit;
	}
	
	public Card(Card c)
	{
		this.value = c.value;
		this.suit = c.suit;
	}
	
	public String toString() 
	{
		 return value + " of " + suit;
	}
	public boolean winner(Card c) 
	{
		if( this.value.compareTo(c.value) == 0 )
		{
			if(this.suit.compareTo(c.suit) > 0)
				return true;
			else
				return false;
		}
		else
		{
			if(this.value.compareTo(c.value) > 0)
				return true;
			else
				return false;
					
		}
		
	}
	
}
