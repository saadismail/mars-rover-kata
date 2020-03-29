package rover;

import org.junit.Assert;
import org.junit.Test;

public class RoverTurnTest {

    @Test
    public void turnRightWhenFacingNorth() {
        Rover rover = new Rover(Coordinate.ORIGIN, Direction.NORTH);
        rover.turnRight();
        Assert.assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void turnRightWhenFacingEast() {
        Rover rover = new Rover(Coordinate.ORIGIN, Direction.EAST);
        rover.turnRight();
        Assert.assertEquals(Direction.SOUTH, rover.getDirection());
    }
}
