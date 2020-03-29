package rover;

import exceptions.NullCoordinateException;

public class Coordinate {
    private int x, y;
    public final static Coordinate ORIGIN = new Coordinate(0, 0);

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static void assertNotNull(Coordinate coordinate) {
        if (coordinate == null) {
            throw new NullCoordinateException();
        }
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (x != that.x) return false;
        return y == that.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}