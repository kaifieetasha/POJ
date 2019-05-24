/*
Zadanie nr2 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/

public class MyCircle {
    private  MyPoint center =new MyPoint(0,0);
    private int radius =1;

    public MyCircle(){

    }
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int centerX){
        this.center.setX(centerX);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int centerY){
        this.center.setY(centerY);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int centerXY[]){
        this.center.setXY(centerXY[0],centerXY[1]);
    }
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);

    }
    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }

}
