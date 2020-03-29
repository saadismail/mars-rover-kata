package rover;

import java.util.HashMap;
import java.util.Map;

import static rover.Command.TURN_RIGHT;
import static rover.Coordinate.assertNotNull;
import static rover.Direction.assertNotNull;

public class Rover {

    // TODO: refactor to vector
    private Coordinate coordinate;
    private Direction direction;

    private Map<Direction, Coordinate> directionCoordinateMap = new HashMap<Direction, Coordinate>() {
        {
            put(Direction.NORTH, new Coordinate(0, 1));
            put(Direction.SOUTH, new Coordinate(0, -1));
            put(Direction.EAST, new Coordinate(1, 0));
            put(Direction.WEST, new Coordinate(-1, 0));
        }
    };

    public Rover(Coordinate coordinate, Direction direction) {
        assertNotNull(coordinate);
        assertNotNull(direction);

        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void process(Command command) {
        if (command == TURN_RIGHT) {
            this.direction = Direction.getNewRightDirection(this.direction);
        } else {
            Coordinate delta = directionCoordinateMap.get(this.direction);
            int newX = this.coordinate.getX() + (delta.getX() * command.coefficient);
            int newY = this.coordinate.getY() + (delta.getY() * command.coefficient);
            this.coordinate = new Coordinate(newX, newY);
        }
    }
}
