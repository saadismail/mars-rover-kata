package rover;

import java.util.HashMap;
import java.util.Map;

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

    public void move(Move move) {
        Coordinate delta = directionCoordinateMap.get(this.direction);
        int newX = this.coordinate.getX() + (delta.getX() * move.coefficient);
        int newY = this.coordinate.getY() + (delta.getY() * move.coefficient);
        this.coordinate = new Coordinate(newX, newY);
    }

    public void forward() {
        move(Move.FORWARD);
    }


    public void backward() {
        move(Move.BACKWARD);
    }
}
