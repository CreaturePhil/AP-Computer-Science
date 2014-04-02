import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class JumperBug extends Bug{
	private int steps, sideLength;
	
	public JumperBug(int length){
		steps = 0;
		sideLength = length;
	}
	
	public void move() { 
		 Grid<Actor> gr = getGrid(); 
		 if (gr == null) 
		 return; 
		 Location loc = getLocation(); 
		 Location next = loc.getAdjacentLocation(getDirection()); 
		 Location jump = next.getAdjacentLocation(getDirection()); 
		 if (gr.isValid(jump)) {
			 moveTo(jump); 
		 }else 
		 removeSelfFromGrid(); 
		 Flower flower = new Flower(getColor()); 
		 flower.putSelfInGrid(gr, loc); 
	} 

	public boolean canMove() { 
		 Grid<Actor> gr = getGrid(); 
		 if (gr == null) 
		 return false; 
		 Location loc = getLocation(); 
		 Location next = loc.getAdjacentLocation(getDirection()); 
		 Location jump = next.getAdjacentLocation(getDirection()); 
		 if (!gr.isValid(jump)) 
		 return false; 
		 Actor neighbor = gr.get(next); 
		 return (neighbor == null) || (neighbor instanceof Flower); 
		 // ok to move into empty location or onto flower 
		 // not ok to move onto any other actor 
	 } 

	 

	
	public void act(){
		if (steps < sideLength && canMove()){
			move();
			steps++;
		} else {
			steps = 0;
		}
	}
}

