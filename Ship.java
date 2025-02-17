import java.awt.Point; // Use java.awt.Point explicitly
public class Ship {
    private Point currentLocation; // Keep it private for encapsulation

    public Ship() {
        this.currentLocation = new Point(4, 7); // Correct Point initialization
    }
    public Point getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }
    public void goEast() {
        if (currentLocation.x + 1 < 10)
            currentLocation.x += 1; // Correct way to update x
    }
    public void goWest() {
        if (currentLocation.x - 1 >= 0)
            currentLocation.x -= 1;
    }
    public void goNorth() {
        if (currentLocation.y - 1 >= 0)
            currentLocation.y -= 1;
    }
    public void goSouth() {
        if (currentLocation.y + 1 < 10)
            currentLocation.y += 1;
    }
}
