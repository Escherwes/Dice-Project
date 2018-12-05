import java.util.ArrayList;
public class DiceRunner{
	public static void main(String[]args){

		Die die1 = new Die();
		Die die2 = new Die();
		ArrayList<Die> hold = new ArrayList<>();

		while(die1.getValues != 1){
			die1.roll();
			System.out.println(die1);
		}

		while(die2.getValues != 1){
			die2.roll();
			System.out.println(die2);
		}

		for(int i = 0; i<6; i++){
			hold.addDie();
			System.out.println(hold);
		}

		hold.shake();

		System.out.println(hold);
	}
}