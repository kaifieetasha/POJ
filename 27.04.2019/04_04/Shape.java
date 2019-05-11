public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(){

    }
    public Shape(String _color, boolean _filled){
        this.color = _color;
        this.filled = _filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape (Color: "+color+", filled: "+filled+")";
    }
}
