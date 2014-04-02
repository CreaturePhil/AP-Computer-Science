import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class LeftyBug extends Bug{
    private int steps, sideLength;
    public LeftyBug(int length){
        steps = 0;
        sideLength = length;
    }
    public void turn(){
        setDirection(getDirection() + Location.HALF_LEFT);
    }
    public void act(){
        if (steps &lt; sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            steps = 0;
        }
        
    }
}
