package Facade;

public class Line implements Element{
    private Point firstPoint;
    private Point secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }


    @Override
    public void add() {
        System.out.println("Add line between pont "+firstPoint+" and "+secondPoint);
    }
}
