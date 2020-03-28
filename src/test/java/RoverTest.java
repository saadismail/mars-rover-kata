import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test
    public void roverInitializationTest_ORIGIN() {
        Coordinate initialCoordinate = new Coordinate(0, 0);
        Rover rover = new Rover(initialCoordinate);
        Assert.assertEquals(initialCoordinate, rover.getCoordinate());
    }

    @Test
    public void roverInitializationTest_NONORIGIN() {
        Coordinate initialCoordinate = new Coordinate(123, 456);
        Rover rover = new Rover(initialCoordinate);
        Assert.assertEquals(initialCoordinate, rover.getCoordinate());
    }

}
