public class Rover {
    private int xPosition, yPosition;

    public Rover(int initialRoverX, int initialRoverY) {
        this.xPosition = initialRoverX;
        this.yPosition = initialRoverY;
    }

    public int getX() {
        return xPosition;
    }

    public int getY() {
        return yPosition;
    }
}
