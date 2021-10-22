package ex0.algo;

public class Doors {
    private static int status;
    private boolean sensorOn = false;

    public static int getStatus() {
        return status;
    }

    public static void setStatus(int status) {
        Doors.status = status;
    }

    public boolean isSensorOn() {
        return sensorOn;
    }

    public void setSensorOn(boolean sensorOn) {
        this.sensorOn = sensorOn;
    }

    public Doors() {
    this.status=status;
    }

    public void open() {
        status=1;
    }

    public boolean isClosed() {
        if (status==1) return false;
        else if (status==-1) return false;
        else if (status==0) return true;
        else return false;
    }

    public void close(){
        if (sensorOn==false)
            status=0;
        else
            System.out.println("Interrupted Door");
            return;
    }

}
