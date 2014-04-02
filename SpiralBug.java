import info.gridworld.actor.Bug;
import info.gridworld.actor.Bug;

public class SpiralBug extends Bug{
    
    private int steps, sideLength;
    public SpiralBug(int length){
        steps = 0;
        sideLength = length;
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
            steps = 0;
            sideLength++;
        }
        
    }
}
