package ex0.algo;

import ex0.Elevator;

public class ElevatorUnit implements Elevator {

    private long ID;
    private int MinFloor;
    private int MaxFloor;
    private double TimeForOpen;
    private double TimeForClose;
    private int state;
    private int Pos;
    private int Speed;
    private int StartTime;
    private int StopTime;
    private Doors doors;



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

