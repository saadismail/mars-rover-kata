import org.junit.Test;

public class RoverTest {

    @Test
    public void roverInitializationTest_ORIGIN() {
        int initialRoverX = 0;
        int initialRoverY = 0;
        Rover rover = new Rover(initialRoverX, initialRoverY);
        assert(rover.getX() == initialRoverX);
        assert(rover.getY() == initialRoverY);
    }

    @Test
    public void roverInitializationTest_NONORIGIN() {
        int initialRoverX = 123;
        int initialRoverY = 456;
        Rover rover = new Rover(initialRoverX, initialRoverY);
        assert(rover.getX() == initialRoverX);
        assert(rover.getY() == initialRoverY);
    }

}
