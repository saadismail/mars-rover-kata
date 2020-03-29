import exceptions.NullDirectionException;

public enum Direction {

    NORTH, SOUTH, EAST, WEST;

    static void assertNull(Direction direction) {
        if (direction == null) {
            throw new NullDirectionException();
        }
    }
}
