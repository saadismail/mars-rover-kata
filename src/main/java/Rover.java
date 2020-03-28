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
        int newX, newY;
        newX = this.coordinate.getX();
        newY = this.coordinate.getY() + 1;
        if (direction == Direction.SOUTH){
            newX = this.coordinate.getX();
            newY = this.coordinate.getY() - 1;
        }
        else if (direction == Direction.WEST) {
            newX = this.coordinate.getX() - 1;
            newY = this.coordinate.getY();
        }
        else if (direction == Direction.EAST) {
            newX = this.coordinate.getX() + 1;
            newY = this.coordinate.getY();
        }

        this.coordinate = new Coordinate(newX, newY);
    }
}
