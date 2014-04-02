
import java.util.ArrayList;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class SmellyCritter extends Critter{
    
    private int sf;
    
    public SmellyCritter(int smellFactor){
        sf = smellFactor;
    }
    
    public SmellyCritter(){
        sf = 2;
    }
    
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();
        Location loc = getLocation();
        int row = loc.getRow();
        int col = loc.getCol();
        for (int r = row-sf; r <= row+sf; r++){
            for (int c = col-sf; c <= col+sf; c++){
                Location temp = new Location(r,c);
                if (getGrid().isValid(temp)) {
                    Actor a = getGrid().get(temp);
                    if (a != null && a != this) {
                        actors.add(a);
                    }
                }
            }
        }
        return actors;
    }
    
    public void processActors(ArrayList<Actor> actors) {
        for (Actor a : actors) {
        	a.setDirection(a.getLocation().getDirectionToward(getLocation())+Location.HALF_CIRCLE);
        	/*
        	Location smellyCritterLoc = getLocation();
        	Location actorLoc = a.getLocation();
        	int directionOfSmellyCritter = actorLoc.getDirectionToward(smellyCritterLoc);
        	int turn180 = Location.HALF_CIRCLE;
        	int turningDirection = directionOfSmellyCritter+turn180;
        	a.setDirection(turningDirection);
        	*/
        }
    }
    
}

