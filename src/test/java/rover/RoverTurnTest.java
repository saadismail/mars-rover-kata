package rover;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static rover.Coordinate.ORIGIN;
import static rover.Direction.EAST;
import static rover.Direction.NORTH;
import static rover.Direction.SOUTH;
import static rover.Direction.WEST;

@RunWith(Parameterized.class)
public class RoverTurnTest {

    @Parameter
    public Direction initial;

    @Parameter(1)
    public Direction expected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {NORTH, EAST},
                {EAST, SOUTH}
        });
    }

    @Test
    public void turnRightTest() {
        Rover rover = new Rover(ORIGIN, initial);
        rover.turnRight();
        Assert.assertEquals(expected, rover.getDirection());
    }
}
