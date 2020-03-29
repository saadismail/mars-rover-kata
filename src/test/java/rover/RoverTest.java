package rover;

import exceptions.NullCoordinateException;
import exceptions.NullDirectionException;
import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test(expected = NullCoordinateException.class)
    public void roverInitializationTest_NULL_COORDINATE() {
        new Rover(null, Direction.NORTH);
    }

    @Test(expected = NullDirectionException.class)
    public void roverInitializationTest_NULL_DIRECTION() {
        new Rover(Coordinate.ORIGIN, null);
    }

    @Test
    public void roverInitializationTest_ORIGIN() {
        Coordinate initialCoordinate = Coordinate.ORIGIN;
        Rover rover = new Rover(initialCoordinate, Direction.NORTH);
        Assert.assertEquals(initialCoordinate, rover.getCoordinate());
    }

    @Test
    public void roverInitializationTest_NON_ORIGIN() {
        Coordinate initialCoordinate = new Coordinate(123, 456);
        Rover rover = new Rover(initialCoordinate, Direction.NORTH);
        Assert.assertEquals(initialCoordinate, rover.getCoordinate());
    }

    @Test
    public void roverInitializationTest_NORTH() {
        Direction direction = Direction.NORTH;
        Rover rover = new Rover(Coordinate.ORIGIN, direction);
        Assert.assertEquals(direction, rover.getDirection());
    }

    @Test
    public void roverInitializationTest_SOUTH() {
        Direction direction = Direction.SOUTH;
        Rover rover = new Rover(Coordinate.ORIGIN, direction);
        Assert.assertEquals(direction, rover.getDirection());
    }

    @Test
    public void roverInitializationTest_EAST() {
        Direction direction = Direction.EAST;
        Rover rover = new Rover(Coordinate.ORIGIN, direction);
        Assert.assertEquals(direction, rover.getDirection());
    }

    @Test
    public void roverInitializationTest_WEST() {
        Direction direction = Direction.WEST;
        Rover rover = new Rover(Coordinate.ORIGIN, direction);
        Assert.assertEquals(direction, rover.getDirection());
    }

}
