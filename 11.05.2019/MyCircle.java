public class MyCircle {
    private  MyPoint center =new MyPoint(0,0);
    private int radius =1;
    private int centerX;
    private int centerY;
    private int centerXY[] = new int[2];
    ;

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
        return centerX;
    }
    public void setCenterX(int centerX){
        this.centerX=centerX;
    }
    public int getCenterY(){
        return centerY;
    }
    public void setCenterY(int centerY){
        this.centerY = centerY;
    }
    public int[] getCenterXY(){
        return centerXY;
    }
    public void setCenterXY(int centerXY[]){
        this.centerXY = centerXY;
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
