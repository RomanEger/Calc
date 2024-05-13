package main.com.example;

public class Segment {
    private Point firstPoint;
    private Point secondPoint;

    public Point getFirstPoint(){
        return firstPoint;
    }

    public void setFirstPoint(Point value){
        firstPoint = value;
    }

    public Point getSecondPoint(){
        return secondPoint;
    }

    public void setSecondPoint(Point value){
        secondPoint = value;
    }

    public Segment(){}

    public Segment(Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public double Calculate(){
        return Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(),2) + Math.pow((firstPoint.getY() - secondPoint.getY()), 2));
    }
}
