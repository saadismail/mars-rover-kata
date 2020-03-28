import org.junit.Test;

public class RoverTest {

    @Test
    public void roverTest() {
        int initialRoverX = 0;
        int initialRoverY = 0;
        Rover rover = new Rover(initialRoverX, initialRoverY);
        assert(rover.getX() == initialRoverX);
        assert(rover.getY() == initialRoverY);
    }

}
