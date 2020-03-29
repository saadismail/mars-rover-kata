package rover;

import exceptions.NullDirectionException;

public enum Direction {

    NORTH, SOUTH, EAST, WEST;

    static void assertNotNull(Direction direction) {
        if (direction == null) {
            throw new NullDirectionException();
        }
    }
}
