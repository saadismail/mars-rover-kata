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

    static Direction getNewRightDirection(Direction direction) {
        int originalIndex = TURN_DIRECTIONS.indexOf(direction);
        int newIndex = originalIndex + 1;
        if (newIndex >= TURN_DIRECTIONS.size()) {
            newIndex = 0;
        }
        return TURN_DIRECTIONS.get(newIndex);
    }

    static Direction getNewLeftDirection(Direction direction) {
        int originalIndex = TURN_DIRECTIONS.indexOf(direction);
        int newIndex = originalIndex - 1;
        if (newIndex < 0) {
            newIndex = TURN_DIRECTIONS.size() - 1;
        }
        return TURN_DIRECTIONS.get(newIndex);
    }
}
