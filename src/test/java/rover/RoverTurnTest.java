package rover;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static rover.Command.TURN_LEFT;
import static rover.Command.TURN_RIGHT;
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
    public Command command;

    @Parameter(2)
    public Direction expected;

    @Parameters(name = "While facing {0}, process {1}, should face {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {NORTH, TURN_RIGHT, EAST},
                {EAST, TURN_RIGHT, SOUTH},
                {SOUTH, TURN_RIGHT, WEST},
                {WEST, TURN_RIGHT, NORTH},
                {NORTH, TURN_LEFT, WEST},
                {EAST, TURN_LEFT, NORTH},
                {SOUTH, TURN_LEFT, EAST},
                {WEST, TURN_LEFT, SOUTH}
        });
    }

    @Test
    public void turnTest() {
        Rover rover = new Rover(ORIGIN, initial);
        rover.process(command);
        Assert.assertEquals(expected, rover.getDirection());
    }
}
