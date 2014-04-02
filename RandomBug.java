import java.util.Random;
import info.gridworld.actor.Bug;

public class RandomBug extends Bug{
	private int steps, length;
	Random rng = new Random();
	
	public RandomBug(){
		steps = 0;
		length = rng.nextInt(10);
	}
	public void turn(){
		setDirection(getDirection() + rng.nextInt(360));
	}
	
	public void act(){
		if (steps < length && canMove()){
			move();
			steps++;
		} else {
			turn();
			steps = 0;
			length = rng.nextInt(10);
		}
	}
}


