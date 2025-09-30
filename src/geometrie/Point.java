package geometrie;

import java.util.Random;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void randomizePoint(double minX, double maxX, double minY, double maxY){
        //Safety
        if (minX > maxX){
            double temp = minX;
            minX = maxX;
            maxX = temp;
        }
        if (minY > maxY){
            double temp = minY;
            minY = maxY;
            maxY = temp;
        }
        Random r = new Random();
        this.setX(r.nextDouble(minX, maxX));
        this.setY(r.nextDouble(minY, maxY));
    }

    @Override
    public String toString(){
        return new String("Point (" + this.getX() + ", " + this.getY() + ")");
    }
}
