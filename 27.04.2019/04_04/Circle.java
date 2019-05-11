public class Circle extends Shape {

    private double radius = 1.0;

    public Circle(){}
    public Circle(double _radius){
        this.radius = _radius;
    }
    public Circle(double _radius, String _color, boolean _filled){
        super(_color,_filled);
        this.radius = _radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }
    public double getPerimeter(){
        return 2*Math.PI * getRadius();
    }
    public String toString() {
        return "Circle{" + "radius= " + radius + "area: " + getArea() +", perimeter: " + getPerimeter() + ", color: " + getColor() + ", filled: " + isFilled() +'}';
    }
}
