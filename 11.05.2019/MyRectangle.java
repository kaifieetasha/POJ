/*
Zadanie nr4 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/



public class MyRectangle {
    private  MyPoint leftCorner;
    private  MyPoint rightCorner;

    public MyRectangle(){

    }
    public MyRectangle(MyPoint leftCorner, MyPoint rightCorner) {
        this.leftCorner = leftCorner;
        this.rightCorner = rightCorner;
    }
    public MyPoint getRightCorner() {
        return rightCorner ;
    }
    public void setRightCorner(MyPoint rightCorner) {
        this.rightCorner = rightCorner;
    }
    public MyPoint getLeftCorner() {
        return leftCorner;
    }
    public void setLeftCorner(MyPoint leftCorner) {
        this.leftCorner = leftCorner;
    }

    public int getRightCornerX(){
        return rightCorner.getX();
    }
    public void setRightCornerX(int rightCornerX){
        this.rightCorner.setX(rightCornerX);
    }
    public int getRightCornerY(){
        return rightCorner.getY();
    }
    public void setRightCornerY(int rightCornerY){
        this.rightCorner.setY(rightCornerY);
    }
    public int[] getRightCornerXY(){
        return rightCorner.getXY();
    }
    public void setRightCornerXY(int rightCornerXY[]){
        this.rightCorner.setXY(rightCornerXY[0],rightCornerXY[1]);
    }
    //////////////////////////////////////////////

    public int getLeftCornerX(){
        return leftCorner.getX();
    }
    public void setLeftCornerX(int leftCornerX){
        this.leftCorner.setX(leftCornerX);
    }
    public int getLeftCornerY(){
        return leftCorner.getY();
    }
    public void setLeftCornerY(int leftCornerY){
        this.leftCorner.setY(leftCornerY);
    }
    public int[] getLeftCornerXY(){
        return leftCorner.getXY();
    }
    public void setLeftCornerXY(int leftCornerXY[]){
        this.leftCorner.setXY(leftCornerXY[0],leftCornerXY[1]);
    }

    public String toString() {
        return "MyRectangle{" +
                "leftCorner=" + leftCorner +
                ", rightCorner=" + rightCorner +
                '}';
    }
}
