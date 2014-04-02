import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug{
    private int steps;
    private int sideLength;
    private int Z;
    
    public ZBug(int length) {
        steps = 0;
        sideLength = length;
        Z = 3;
        setDirection(90);
    }
    /*public void turn(){
        setDirection(getDirection() + Location.SOUTHEAST);
    }*/
    public void act(){
        if(steps &lt; sideLength && canMove()){
            move();
            steps++;
            } else {
            Z--;
            if (Z == 1){
                turn();
                turn();
            }
            turn();
            turn();
            turn();
            steps = 0;
            if (Z &lt;= 0){
                steps =  (sideLength+1);
            }
        }
    }
}
