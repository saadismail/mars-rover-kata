package rover;

public enum Move {

    FORWARD(1), BACKWARD(-1);
    int coefficient;

    Move(int coefficient) {
        this.coefficient = coefficient;
    }
}
