import java.util.ArrayList;
public class DiceRunner{
	public static void main(String[]args){

		Die die1 = new Die();
		Die die2 = new Die();
		DiceHolder hold = new DiceHolder();
		int counter = 0;

		boolean check = false;
		while(check == false){
			die1.roll();
			die2.roll();
			System.out.println("Die 1: "+die1);
			System.out.println("Die 2: "+die2+"\n");
			counter++;

			if((die1.getValues() == 1) && (die2.getValues() == 1)){
				check = true;
			}
		}
		System.out.println("It took "+counter+" tries to get snake-eyes!\n");

		for(int i = 0; i<6; i++){
			hold.addDie(new Die((int)(Math.random()*17)+4));
			System.out.println(hold);
		}

		hold.shake();
		System.out.println(hold);
	}
}