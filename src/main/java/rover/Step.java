package rover;

public enum Step {

    FORWARD(1), BACKWARD(-1);
    int coefficient;

    Step(int coefficient) {
        this.coefficient = coefficient;
    }
}
