package rover;

import org.junit.Test;

public class RoverTurnTest {

    @Test
    public void test() {
        Rover rover = new Rover(Coordinate.ORIGIN, Direction.NORTH);
        rover.turnRight();
    }
}
