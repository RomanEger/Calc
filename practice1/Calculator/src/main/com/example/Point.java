package main.com.example;

public class Point {
    private double x;

    private double y;

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double value) {
        x = value;
    }

    public void setY(double value){
        y = value;
    }

    public Point(){}

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ("x="+x+"\ny="+y);
    }
}
