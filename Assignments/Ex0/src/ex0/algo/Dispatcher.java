package ex0.algo;

import ex0.Building;
import ex0.CallForElevator;
import ex0.Elevator;
import ex0.ElevatorSystem;

public class Dispatcher implements ElevatorAlgo, CallForElevator, Building, Elevator {
    final ElevatorAlgo algo;
    public CallForElevator currentCall;
    ElevatorSystem ElevatorSystem;

    public Dispatcher(ElevatorAlgo algo, CallForElevator currentCall) {

        this.algo = algo;
        this.currentCall = currentCall;
    }

    public CallForElevator getCall(CallForElevator userInput) {
        currentCall = userInput;
        return userInput;
    }

    public void allocateAnElevator() {
        int src = currentCall.getSrc();
        int dst = currentCall.getDest();

        ElevatorUnit min = ElevatorSystem.ElevatorList.get(0);
        //*******GET DISTANCE FUNCTION NEEDED************
        for (int i = 0; i < ElevatorSystem.ElevatorList.size(); i++) {
            ElevatorUnit curr = ElevatorSystem.ElevatorList.get(i);
            /**if Distance(curr,dest)<Distance(curr,dest)
             *      min = curr
             *
             *      when the min found, check if it's available or on the way
             *
             *      if both conditions are met --> Send the Elevator to the caller
             *
             *     this will find the best elevator (min)
             */
        }
    }


    @Override
    public String getBuildingName() {
        return null;
    }

    @Override
    public int minFloor() {
        return 0;
    }

    @Override
    public int maxFloor() {
        return 0;
    }

    @Override
    public int numberOfElevetors() {
        return 0;
    }

    @Override
    public Elevator getElevetor(int i) {
        return null;
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
    public Building getBuilding() {
        return null;
    }

    @Override
    public String algoName() {
        return null;
    }

    @Override
    public int allocateAnElevator(CallForElevator c) {
        return 0;
    }

    @Override
    public void cmdElevator(int elev) {

    }
}

