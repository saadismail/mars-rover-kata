package rover;

public enum Command {

    MOVE_FORWARD(1), MOVE_BACKWARD(-1), TURN_RIGHT(0);
    int coefficient;

    Command(int coefficient) {
        this.coefficient = coefficient;
    }
}
