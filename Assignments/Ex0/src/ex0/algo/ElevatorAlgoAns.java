package ex0.algo;
import ex0.Building;
import ex0.CallForElevator;
import ex0.Elevator;

import java.util.Iterator;

public class ElevatorAlgoAns implements ElevatorAlgo {
        public static final int UP=1, DOWN=-1, LEVEL=0 ;
        private int _direction;
        private Building _building;
        public ElevatorAlgoAns(Building b) {
            _building = b;
            _direction = UP;
        }

    @Override
    public Building getBuilding() {
        return _building;
    }

    @Override
    public String algoName() {
        return"Ex0_OOP_Smart_Elevator_ALgo";
    }

    @Override
    public int allocateAnElevator(CallForElevator c) {

    }

    @Override
    public void cmdElevator(int elev) {

    }
    private int get_direction(Elevator elevator)
    { return 
    }
}

    private double dist(int src, int elev) {
        double ans = -1;
        Elevator thisElev = this._building.getElevetor(elev);
        int pos = thisElev.getPos();
        double speed = thisElev.getSpeed();
        int min = this._building.minFloor(), max = this._building.maxFloor();
        double up2down = (max-min)*speed;
        if(elev%2==1) { // up
            if(pos<=src) {ans = (src-pos);}
            else {
                ans = ((max-pos) + (pos-min))+ up2down;
            }
        }
        else {
            if(pos>=src) {ans = (pos-src);}
            else {
                ans = ((max-pos) + (pos-min));
            }
        }
        return ans;


}
