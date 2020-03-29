package rover;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RoverMovementTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Move.FORWARD, Direction.NORTH, new Coordinate(123, 457)},
                {Move.FORWARD, Direction.SOUTH, new Coordinate(123, 455)},
                {Move.FORWARD, Direction.EAST, new Coordinate(124, 456)},
                {Move.FORWARD, Direction.WEST, new Coordinate(122, 456)},
                {Move.BACKWARD, Direction.NORTH, new Coordinate(123, 455)},
                {Move.BACKWARD, Direction.SOUTH, new Coordinate(123, 457)},
                {Move.BACKWARD, Direction.EAST, new Coordinate(122, 456)},
                {Move.BACKWARD, Direction.WEST, new Coordinate(124, 456)}
        });
    }
    private Move move;
    private Direction direction;
    private Coordinate expected;

    public RoverMovementTest(Move move, Direction direction, Coordinate expected) {
        this.move = move;
        this.direction = direction;
        this.expected = expected;
    }

    @Test
    public void roverTest() {
        Coordinate initialCoordinate = new Coordinate(123, 456);
        Rover rover = new Rover(initialCoordinate, direction);
        rover.move(move);
        Assert.assertEquals(expected, rover.getCoordinate());
    }

}
