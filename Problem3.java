 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }public void closeAllWindows() {
        while(!nextToABeeper()) {
            checkForWindows();
        }
    }
    public void checkForWindows() {
        while(!frontIsClear()) {
            turnRight();
            while(frontIsClear()) {
                move();
                turnLeft();
                if(nextToABeeper()){
                    turnOff();
                }
                if(frontIsClear()) {
                    putBeeper();
                    turnRight();
                }
            }
        }
    }public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

