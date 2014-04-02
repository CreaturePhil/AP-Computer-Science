import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;


public class RockEater extends Critter{
	public void processActors(ArrayList<Actor> actors) { 
		 for (Actor a : actors) { 
			 if (a instanceof Rock) {
				 a.removeSelfFromGrid(); 
			 } 
		 } 
	}
}

