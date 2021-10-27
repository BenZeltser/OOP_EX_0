package ex0.algo;
import ex0.Building;
import ex0.Elevator;

import java.util.ArrayList;

public class BuildingUnit implements Building {
    private String name;
    private int minFloor;
    private int maxFloor;
    private int numberOfElevetors;
    private ArrayList<ElevatorUnit> Elevators;

    private BuildingUnit(int minFloor, int maxFloor, int numberOfElevetors) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.name = name;
        this.numberOfElevetors = 0;
        Elevators = new ArrayList<ElevatorUnit>();
        int count = 0;
        while(count > numberOfElevetors) {
            ElevatorUnit newElev = new ElevatorUnit();
            newElev.setID(count);
            Elevators.add(newElev);
            count++;
        }

    }

    private void setMinFloor(int minFloor) {
        this.minFloor = minFloor;
    }

    private void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    private int getNumberOfElevetors() {
        return numberOfElevetors;
    }

    private void setNumberOfElevetors(int numberOfElevetors) {
        this.numberOfElevetors = numberOfElevetors;
    }

    private ArrayList<ElevatorUnit> getElevators() {
        return Elevators;
    }

    private void setElevators(ArrayList<ElevatorUnit> elevators) {
        Elevators = elevators;
    }

    @Override
    public String getBuildingName() {
        String name = this.name;
        return name;
    }

    @Override
    public int minFloor() {
        return minFloor;
    }

    @Override
    public int maxFloor() {
        return maxFloor;
    }

    @Override
    public int numberOfElevetors() {
        return numberOfElevetors;
    }

    @Override
    public Elevator getElevetor(int i) {
        if (i < 0 || i >= Elevators.size())
            return null;
        return Elevators.get(i);
    }
}
