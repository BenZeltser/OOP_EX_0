package ex0.algo;
import ex0.Building;
import ex0.Elevator;

import java.util.ArrayList;

public class BuildingUnit implements Building {
    private int minFloor;
    private int maxFloor;
    private int numberOfElevetors;
    private ArrayList<ElevatorUnit> Elevators;

    public int getMinFloor() {
        return minFloor;
    }

    public void setMinFloor(int minFloor) {
        this.minFloor = minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    public int getNumberOfElevetors() {
        return numberOfElevetors;
    }

    public void setNumberOfElevetors(int numberOfElevetors) {
        this.numberOfElevetors = numberOfElevetors;
    }

    public ArrayList<ElevatorUnit> getElevators() {
        return Elevators;
    }

    public void setElevators(ArrayList<ElevatorUnit> elevators) {
        Elevators = elevators;
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
}
