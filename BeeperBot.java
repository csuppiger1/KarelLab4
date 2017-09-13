
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void runRace() {
        while(frontIsClear()) {
            collectBeeperSteeple();
        }
    } public void findBeeper() {
        faceEast();
        while(!nextToABeeper() && frontIsClear()) {
            move();
        } while (nextToABeeper() && frontIsClear()) {
            pickBeeper();
            move();
        }
    } public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    } public void collectBeeperSteeple() {
        findBeeper();
    } public void turn() {
        while(!frontIsClear()) {
            faceNorth();
            move();
        }
    } public void faceNorth() {
        while(!facingNorth()){
            
        }
    }
}