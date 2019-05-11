public class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;

    public Rectangle(){

    }
    public Rectangle(double _width, double _lenght){
        this.width = _width;
        this.lenght = _lenght;
    }
    public Rectangle(double _witdth, double _lenght, String _color, boolean _filled){
        super(_color,_filled);
        this.width = _witdth;
        this.lenght = _lenght;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return getWidth()*getLenght();
    }
    public double getPerimeter(){
        return 2*getWidth()+2*getLenght();
    }
    public String toString() {
        return "Rectangle{" + "width=" + width + ", lenght=" + lenght  + ", perimeter: " + getPerimeter() +", area: " + getArea() + ", color= " + getColor() + ", filled: " + isFilled() +'}';
    }
}
