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
        int deltaX = 0, deltaY = 0;
        if (direction == Direction.NORTH) {
            deltaY = 1;
        } else if (direction == Direction.SOUTH) {
            deltaY = -1;
        } else if (direction == Direction.WEST) {
           deltaX = -1;
        } else if (direction == Direction.EAST) {
            deltaX = 1;
        } else {
            throw new RuntimeException("Direction is Null");
        }
        int newX = this.coordinate.getX() + deltaX;
        int newY = this.coordinate.getY() + deltaY;
        this.coordinate = new Coordinate(newX, newY);
    }
}
