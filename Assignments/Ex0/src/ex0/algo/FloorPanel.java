package ex0.algo;
import ex0.Building;
import ex0.CallForElevator;
import ex0.Elevator;
import java.util.Scanner;

public class FloorPanel implements Building, ElevatorAlgo, CallForElevator {
    private int input;
    private PanelScreen screen;
    private int floor;

    public FloorPanel(int floor) {
        this.input = input;
        this.screen = screen;
        this.floor=floor;
        while (true) {
        Scanner in = new Scanner(System.in);
        screen.print("Enter a floor");
        this.input = in.nextInt();
        setInput(input);}
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        if (input > maxFloor() || input < minFloor() || input==floor) {
            screen.printError();
            return;}
        else {
            this.input = input;
            screen.print((String.valueOf(input)));
            ElevatorCall call = new ElevatorCall(floor,input);
            allocateAnElevator(call);}

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
}
