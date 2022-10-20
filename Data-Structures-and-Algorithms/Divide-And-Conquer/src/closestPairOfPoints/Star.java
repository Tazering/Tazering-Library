package closestPairOfPoints;

public class Star {

    private double x_coordinate;
    private double y_coordinate;

    public Star(double x_coordinate, double y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    //getters
    public double getX_coordinate() {
        return this.x_coordinate;
    }

    public double getY_coordinate() {
        return this.y_coordinate;
    }

    //setters
    public void setX_coordinate(double x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public void setY_coordinate(double y_coordinate){
        this.y_coordinate = y_coordinate;
    }

    public void printStar() {
        System.out.println("x: " + this.x_coordinate);
        System.out.println("y: " + this.y_coordinate);
    }

}
