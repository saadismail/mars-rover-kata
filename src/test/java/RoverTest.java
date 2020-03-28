import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test
    public void roverInitializationTest_ORIGIN() {
        Direction direction = Direction.NORTH;
        Coordinate initialCoordinate = Coordinate.ORIGIN;
        Rover rover = new Rover(initialCoordinate, direction);
        Assert.assertEquals(initialCoordinate, rover.getCoordinate());
    }

    @Test
    public void roverInitializationTest_NONORIGIN() {
        Direction direction = Direction.NORTH;
        Coordinate initialCoordinate = new Coordinate(123, 456);
        Rover rover = new Rover(initialCoordinate, direction);
        Assert.assertEquals(initialCoordinate, rover.getCoordinate());
    }

}
