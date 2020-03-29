package rover;

import exceptions.NullDirectionException;

import java.util.Arrays;
import java.util.List;

public enum Direction {

    NORTH, SOUTH, EAST, WEST;
    private static final List<Direction> TURN_DIRECTIONS =
            Arrays.asList(NORTH, EAST, SOUTH, WEST);

    static void assertNotNull(Direction direction) {
        if (direction == null) {
            throw new NullDirectionException();
        }
    }

    public static Direction getNewDirection(Direction direction, int indexDelta) {
        int originalIndex = TURN_DIRECTIONS.indexOf(direction);
        int newIndex = (originalIndex + TURN_DIRECTIONS.size()) + indexDelta;
        return TURN_DIRECTIONS.get(newIndex % TURN_DIRECTIONS.size());
    }
}
