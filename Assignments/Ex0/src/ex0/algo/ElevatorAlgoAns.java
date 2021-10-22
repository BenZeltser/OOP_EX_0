package ex0.algo;
import ex0.Building;
import ex0.CallForElevator;
import ex0.Elevator;

import java.util.Iterator;

public class ElevatorAlgoAns implements ElevatorAlgo, Elevator, CallForElevator {
        public static final int UP=1, DOWN=-1, LEVEL=0 ;
        private int _direction = UP;
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
        double up2down = (max - min) * speed;
        if (elev % 2 == 1) { // up
            if (pos <= src) {
                ans = (src - pos);
            } else {
                ans = ((max - pos) + (pos - min)) + up2down;
            }
        } else {
            if (pos >= src) {
                ans = (pos - src);
            } else {
                ans = ((max - pos) + (pos - min));
            }
        }
        return ans;
    }
};
/**
    @Override
    public double getTime(int state) {
        return 0;
    }

    @Override
    public int getSrc() {
        return 0;
    }

    @Override
    public int getDest() {
        return 0;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public int allocatedTo() {
        return 0;
    }

    @Override
    public int getMinFloor() {
        return 0;
    }

    @Override
    public int getMaxFloor() {
        return 0;
    }

    @Override
    public double getTimeForOpen() {
        return 0;
    }

    @Override
    public double getTimeForClose() {
        return 0;
    }

    @Override
    public int getState() {
        return 0;
    }

    @Override
    public int getPos() {
        return 0;
    }

    @Override
    public boolean goTo(int floor) {
        return false;
    }

    @Override
    public boolean stop(int floor) {
        return false;
    }

    @Override
    public double getSpeed() {
        return 0;
    }

    @Override
    public double getStartTime() {
        return 0;
    }

    @Override
    public double getStopTime() {
        return 0;
    }

    @Override
    public int getID() {
        return 0;
    }
}
