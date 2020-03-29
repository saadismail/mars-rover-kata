package rover;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RoverMovementTest {

    public static final Coordinate INITIAL_COORDINATE = new Coordinate(123, 456);

    @Parameter(0)
    public Step step;
    @Parameter(1)
    public Direction direction;
    @Parameter(2)
    public Coordinate expected;

    @Parameters(name = "Step {0} facing {1} should end at {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Step.FORWARD, Direction.NORTH, new Coordinate(123, 457)},
                {Step.FORWARD, Direction.SOUTH, new Coordinate(123, 455)},
                {Step.FORWARD, Direction.EAST, new Coordinate(124, 456)},
                {Step.FORWARD, Direction.WEST, new Coordinate(122, 456)},
                {Step.BACKWARD, Direction.NORTH, new Coordinate(123, 455)},
                {Step.BACKWARD, Direction.SOUTH, new Coordinate(123, 457)},
                {Step.BACKWARD, Direction.EAST, new Coordinate(122, 456)},
                {Step.BACKWARD, Direction.WEST, new Coordinate(124, 456)}
        });
    }

    @Test
    public void roverTest() {
        Rover rover = new Rover(INITIAL_COORDINATE, direction);
        rover.move(step);
        Assert.assertEquals(expected, rover.getCoordinate());
    }
}
