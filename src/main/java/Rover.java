public class Rover {
    private Coordinate coordinate;
    private Direction direction;

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
        int newX = this.coordinate.getX();
        int newY = this.coordinate.getY() - 1;
        this.coordinate = new Coordinate(newX, newY);
    }
}
