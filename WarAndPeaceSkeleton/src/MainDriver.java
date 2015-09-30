
/**
 * @author Farooq Khan, Calvin Lu
 * @date Sept 29, 2015
 */
public class MainDriver 
{

	static final int HANDS = 52;
	
	public static void main(String[] args) 
	{
		
		Deck player1 = new Deck();
		Deck player2 = new Deck();
		int count = 0;
		int player1Score = 0, player2Score = 0, Tie = 0;
		
		while(count < HANDS)
		{ 
			Card p1Card = player1.draw();
			Card p2Card = player2.draw();
			
			System.out.println("Player 1 Card: " + p1Card);
			System.out.println("Player 2 Card: " + p2Card);
			System.out.println("");
			
			if(p1Card.toString().compareTo(p2Card.toString()) == 0)
			{
				Tie++;
			}
			else if(p1Card.winner(p2Card)==true)
				player1Score++;
			else
				player2Score++;
				
			count++;
		}	
		
		System.out.printf("Final score: Player 1--%d; Player 2--%d; Tie--%d", player1Score, player2Score, Tie);
		
		
	}

}
