
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        while(frontIsClear()) {
            move();
        }
        while(!frontIsClear()) {
            turnRight();
            move();
            while(!frontIsClear()) {
                turnRight();
                move();
            }
            turnLeft();
        } while (frontIsClear()) {
            move();
        }
    } public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

