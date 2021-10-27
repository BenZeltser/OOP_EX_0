package ex0.algo;

import ex0.Elevator;


public class Doors implements Elevator {
    private static int status;
    private boolean sensorOn = false;

    private static int getStatus() {
        return status;
    }

    private static void setStatus(int status) {
        Doors.status = status;
    }

    private boolean isSensorOn() {
        return sensorOn;
    }

    private void setSensorOn(boolean sensorOn) {
        this.sensorOn = sensorOn;
    }

    private Doors() {
    this.status=status;
    }

    private void open() {
        status=1;
    }

    private boolean isClosed() {
        if (status==1) return false;
        else if (status==-1) return false;
        else if (status==0) return true;
        else return false;
    }

    private void close(){
        if (sensorOn==false)
            status=0;
        else
            System.out.println("Interrupted Door");
            return;
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
