import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test
    public void roverInitializationTest_ORIGIN() {
        int initialRoverX = 0;
        int initialRoverY = 0;
        Rover rover = new Rover(initialRoverX, initialRoverY);
        Assert.assertEquals(initialRoverX, rover.getX());
        Assert.assertEquals(initialRoverY, rover.getY());
    }

    @Test
    public void roverInitializationTest_NONORIGIN() {
        int initialRoverX = 123;
        int initialRoverY = 456;
        Rover rover = new Rover(initialRoverX, initialRoverY);
        Assert.assertEquals(initialRoverX, rover.getX());
        Assert.assertEquals(initialRoverY, rover.getY());
    }

}
