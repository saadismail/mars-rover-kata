import java.util.HashMap;
import java.util.Map;

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
        this.coordinate = coordinate;
        this.direction = direction;

    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void forward() {
        Coordinate delta = directionCoordinateMap.get(this.direction);
        int newX = this.coordinate.getX() + delta.getX();
        int newY = this.coordinate.getY() + delta.getY();
        this.coordinate = new Coordinate(newX, newY);
    }
}
