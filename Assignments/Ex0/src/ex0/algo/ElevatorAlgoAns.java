package ex0.algo;
import ex0.Building;
import ex0.CallForElevator;
import ex0.Elevator;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;

import java.util.Iterator;

public class ElevatorAlgoAns implements ElevatorAlgo {
    public static final int UP = 1, DOWN = -1, LEVEL = 0,ERROR=2;
    public static final int GOING2SRC=1, GOING2DST=2, DONE=3;
    private int _direction = UP;
    private Building _building;
    private ArrayList<CallForElevator> callForElevatorList=new ArrayList<>();

    private ElevatorAlgoAns(Building b) {
        _building = b;
    }

    @Override
    public Building getBuilding() {
        return _building;
    }

    @Override
    public String algoName() {
        return "Ex0_OOP_Smart_Elevator_ALgo";
    }

    @Override
    public int allocateAnElevator(@NotNull CallForElevator c) {
        removeCalls();
        int index=-1,elevetorIndex=0;
        int src=c.getSrc();
        double distance=-1;

        Elevator elevator= _building.getElevetor(elevetorIndex);
        while (elevator!=null)
        {
            if(elevator.getState()==ERROR)
            {
                elevetorIndex++;
                continue;
            }
            int pos=elevator.getPos();
            if (isValid(elevator.getState(),src,pos))
            {
                double tempDist=dist(src,elevetorIndex);
                if(tempDist!=-1) {
                    if (tempDist == 0) {
                        addCall(c);
                        return elevetorIndex;
                    } else if (distance == -1) {
                        distance = tempDist;
                        index = elevetorIndex;
                    } else if (tempDist < distance) {
                        distance = tempDist;
                        index = elevetorIndex;
                    }
                }
            }
            elevetorIndex++;
            elevator= _building.getElevetor(elevetorIndex);

        }
        if (index==-1) {
            int distance1 = -1;
            elevetorIndex = 0;

            {
                while (elevetorIndex > -1 && elevetorIndex <= callForElevatorList.size()) {
                    CallForElevator CFE=callForElevatorList.get(elevetorIndex);
                    int eIndex =CFE.allocatedTo();
                    Elevator ele = _building.getElevetor(eIndex);
                    if(ele.getState()==ERROR)
                    {
                        continue;
                    }
                    if(ele.getState()!=ERROR) {
                        int pos = ele.getPos();
                        int tempdistance1 = desDist(src, CFE.getDest());
                        if (tempdistance1 == 0) {
                            addCall(c);
                            return CFE.allocatedTo();
                        }
                        if (distance1 == -1) {
                            distance1 = tempdistance1;
                            index = CFE.allocatedTo();
                        } else if (tempdistance1 < distance1) {
                            distance1 = tempdistance1;
                            index = CFE.allocatedTo();
                        }
                    }
                    elevetorIndex++;
                }
            }
        }
        addCall(c);
        return index;
    }

    @Override
    public void cmdElevator(int elev) {
        removeCalls();
        Elevator elevator= _building.getElevetor(elev);
        ArrayList<Integer> floors=new ArrayList<>();
        for (int i=0; i<callForElevatorList.size(); i++)
        {
           CallForElevator c=callForElevatorList.get(i);
           if(elev==c.allocatedTo())
           {
               floors.add(c.getDest());
               floors.add(c.getSrc());
           }

        }
        Collections.sort(floors);
        int state=elevator.getState();
        if(state==LEVEL)
        {
            int nextFloor=floors.get(0);
            if(nextFloor>elevator.getPos()){
                state=UP;
            }
            else {
                state=DOWN;
            }

        }
        if(state==UP)
        {
            int index=floors.size()-1;
            elevator.goTo(floors.get(index));
                    index--;
            while(index>=0){
                elevator.stop(floors.get(index));
                index--;
            }
        }
        else if(state==DOWN)
        {
            int index=0;
            elevator.goTo(floors.get(index));
            index++;
            while(index<floors.size())
            {
                elevator.stop(floors.get(index));
                index++;
            }
        }
    }

    private void removeCalls()
    {
        int index=0;
        while(index<callForElevatorList.size())
        {
            if (callForElevatorList.get(index).getState()==DONE) {
                callForElevatorList.remove(index);
            }
            else {
                index++;
            }
        }
    }

    //this function adds a new elevator call to the elevatorcall list
    private void addCall(CallForElevator c)
    {
        callForElevatorList.add(c);
    }

    //this function calculates the distance in floors between two positions
    private int desDist (int src, int pos)
    {
        if (src>pos)
            return src-pos;
        else
            return pos-src;
    }

    //this function checks if an elevator can take a call
    private boolean isValid(int direction,int floorCall,int elePos) {
        if (direction == UP)
            if (elePos > floorCall) {
                return false;
            } else if (direction == DOWN)
                if ((elePos < floorCall)) {
                    return false;
                }
        return true;
    }
    //this function calculates the time it takes an elevator to reach the destination
    private double dist(int src, int elev) {
        double ans = -1;
        Elevator thisElev = this._building.getElevetor(elev);
        int pos = thisElev.getPos();
        double speed = thisElev.getSpeed();
        double startNstop = thisElev.getStartTime() + thisElev.getStopTime();
        double stopTime = thisElev.getStopTime();
        int state = thisElev.getState();
        if (src == pos)
            return 0;
        if (state == LEVEL) {
            if (src > pos)
                ans = (src - pos) * speed + startNstop;
            else
                ans = (pos - src) * speed + startNstop;
        } else if (state == UP) {
            ans = (src - pos) * speed + stopTime;
        } else if (state == DOWN) {
            ans = (pos - src) * speed + stopTime;
        }
        return ans;
    }
}
