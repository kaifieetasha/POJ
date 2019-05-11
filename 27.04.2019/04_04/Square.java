public class Square extends Rectangle {
    public Square(){

    }
    public Square(double _side){
        super(_side,_side);
    }
    public Square(double _side, String _color, boolean _filled){
        super(_side, _side, _color, _filled);
    }
    public double getSide(){
        return getLenght();
    }
    public void setSide(double _side){
        setLenght(_side);
        setWidth(_side);
    }
    public void setWidth(double _side){
        super.setWidth(_side);
    }
    public void setLenght(double _side){
        super.setLenght(_side);
    }
    public String toString() {
        return "Square{ side= "+ getSide()+ ", color " + getColor() +", filled "+ isFilled() + "}";
    }
}
