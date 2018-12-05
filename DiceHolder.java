import java.util.ArrayList;
public class DiceHolder{

	Die die = new Die();

	private ArrayList<Die> list;

	public DiceHolder(){

		list = new ArrayList<>();

	}

	public int addDie(Die die){

		if(list.size()<6){
			list.add(die);
			return 1;
		}

		else
			return -1;

	}

	public void shake(){

		for(int i = 0; i<list.size(); i++){
			die.roll();
			int rand = (int)(Math.random()*list.size())+1;
			list.add(rand, die);
		}

	}

	public String toString(){

		return die+"\n";

	}

}