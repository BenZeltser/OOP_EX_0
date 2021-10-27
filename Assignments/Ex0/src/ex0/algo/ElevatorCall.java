package ex0.algo;

import ex0.CallForElevator;
import org.jetbrains.annotations.NotNull;

public class ElevatorCall implements CallForElevator, Comparable<ElevatorCall> {
    private int callType;
    private int Src;
    private int Dest;
    private int state;
    private int Type;
    private int allocatedTo;

    public void setCallType(int callType) {
        this.callType = callType;
    }

    public void setSrc(int src) {
        Src = src;
    }

    public void setDest(int dest) {
        Dest = dest;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setType(int type) {
        Type = type;
    }

    public ElevatorCall(int src, int dest) {
        Src = src;
        Dest = dest;
    }

    public void setAllocatedTo(int allocatedTo) {
        this.allocatedTo = allocatedTo;
    }
//An elevator call constructor. gets 3 arguments: call type, source and destination of the call

    public ElevatorCall(int callType, int SRC, int DEST) {
        this.callType = callType;
        this.Src = Src;
        this.Dest = DEST;

    }

    @Override
    public int getState() {
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
    public int compareTo(@NotNull ElevatorCall o) {
        return 0;
    }
}
