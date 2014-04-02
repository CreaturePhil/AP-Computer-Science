import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
 
import java.util.ArrayList;
import java.util.List;
 
 
public class ChameleonKid extends ChameleonCritter{
    public void processActors(ArrayList<Actor> actors){
        if(actors.size()  == 0){
            return;
        }
        
        Grid<Actor> gr = getGrid();
        Location loc = getLocation(); 
        Location next = loc.getAdjacentLocation(getDirection()); 
        Location nextLeft = loc.getAdjacentLocation(getDirection()-45); 
        Location nextRight = loc.getAdjacentLocation(getDirection()+45); 
        Actor neighborFront = gr.get(next);
        Actor neighborFrontLeft = gr.get(nextLeft);
        Actor neighborFrontRight = gr.get(nextRight);
        
        if (neighborFront != null){
            setColor(neighborFront.getColor()); 
        }
        else if (neighborFrontLeft != null){
            setColor(neighborFrontLeft.getColor()); 
        }
        else if (neighborFrontRight != null){
            setColor(neighborFrontRight.getColor()); 
        }
    }
 
}

