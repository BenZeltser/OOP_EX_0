package ex0.algo;

import ex0.CallForElevator;
import ex0.Elevator;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class ElevatorUnit implements Elevator {

    private long ID;
    private int MinFloor;
    private int MaxFloor;
    private double TimeForOpen;
    private double TimeForClose;
    private int state;
    private int Pos;
    private int Speed;

    public void setID(long ID) {
        this.ID = ID;
    }

    public Doors getDoors() {
        return doors;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public ArrayList<Integer>[] getUpcalls() {
        return upcalls;
    }

    public void setUpcalls(ArrayList<Integer>[] upcalls) {
        this.upcalls = upcalls;
    }

    public ArrayList<Integer>[] getDowncalls() {
        return downcalls;
    }

    public void setDowncalls(ArrayList<Integer>[] downcalls) {
        this.downcalls = downcalls;
    }

    private int StartTime;
    private int StopTime;
    private Doors doors;
    private ArrayList<Integer>[] upcalls;
    private ArrayList<Integer>[] downcalls;


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMinFloor(int minFloor) {
        MinFloor = minFloor;
    }

    public void setMaxFloor(int maxFloor) {
        MaxFloor = maxFloor;
    }

    public void setTimeForOpen(double timeForOpen) {
        TimeForOpen = timeForOpen;
    }

    public void setTimeForClose(double timeForClose) {
        TimeForClose = timeForClose;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setPos(int pos) {
        Pos = pos;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public void setStartTime(int startTime) {
        StartTime = startTime;
    }

    public void setStopTime(int stopTime) {
        StopTime = stopTime;
    }

    @Override
    public int getMinFloor() {
        return MinFloor;
    }

    @Override
    public int getMaxFloor() {
        return MaxFloor;
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

