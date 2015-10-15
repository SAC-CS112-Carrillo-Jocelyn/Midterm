package midtermPckge;
import javax.swing.JOptionPane;
public class TrackOddRollPercentage {

	public static void main(String[] args) {
		//declare
		int diceNumb, remainder, d=-1, roundsPlayed=1, odd=0, oddPercent=0;
		String oddOrEven, likeToPlayAgain, message;
		boolean playAgain=false;
		
		
		//Start
		do
		{
			JOptionPane.showMessageDialog(null, "Throw a dice!");
			diceNumb= 1+(int)(Math.random()*6); //make random #
			oddOrEven=(JOptionPane.showInputDialog(null,
					"Do you think the number rolled is odd or even?").toLowerCase());
	
			//a odd # will have a remainder of 1, while a even # will have a remainder of 0
			remainder = diceNumb%2; 
			
			//Logic
			if(oddOrEven.equals("odd")||oddOrEven.equals("even"))
			{	//need this to output % for odd dice rolls
				if(diceNumb%2==1){
					odd=odd+100;
				}
	
				switch(oddOrEven)
				{
				case "odd":
					d=1;break;
				case "even":
					d=0;
					break;
				}
				if(d==remainder)
				{
					JOptionPane.showMessageDialog(null, "You guessed correctly!");
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You guessed wrong. :<");
				}
				
				//PlayAgain?
				oddPercent=odd/roundsPlayed;//percent for dice rolling Odd# 
				message= String.format("You've played %d games.\n"
						+ "A odd number has been rolled %d percent of the time.\n"
						+ "Would you like to play again? Yes=y or No=n", roundsPlayed,oddPercent);
				
				roundsPlayed++;
				likeToPlayAgain= JOptionPane.showInputDialog(message);
				
				if(likeToPlayAgain.toLowerCase().equals("y")
						||likeToPlayAgain.toLowerCase().equals("yes"))
				{
					playAgain=true;
				}
				else
					playAgain=false;
			}
			else
			{	
				JOptionPane.showMessageDialog(null, "Invalid input. Try Again.");
				playAgain=true;
			}
			
		}while(playAgain);

	}

}
