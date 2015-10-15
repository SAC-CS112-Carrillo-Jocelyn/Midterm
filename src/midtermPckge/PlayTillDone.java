package midtermPckge;
import javax.swing.JOptionPane;
public class PlayTillDone {

	public static void main(String[] args) {
		int diceNumb, remainder,d=-1;
		String oddOrEven, likeToPlayAgain;
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
			{
				switch(oddOrEven)
				{
				case "odd":
					d=1;break;
				case "even":
					d=0;break;
				}
				
				if(d==remainder)
					JOptionPane.showMessageDialog(null, "You guessed correctly!");
				else
					JOptionPane.showMessageDialog(null, "You guessed wrong. :<");
				
				//PlayAgain?
				likeToPlayAgain= JOptionPane.showInputDialog
						("Would you like to play again? Yes=y or No=n");
				
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
