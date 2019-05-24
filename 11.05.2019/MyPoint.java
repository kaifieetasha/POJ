/*
Zadanie nr1 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/


import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;
public class MyPoint {

    private int x = 0;
    private int y = 0;

    public MyPoint() {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = {getX(), getY()};
        return xy;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    double distance(int x, int y, int x2, int y2){
        double distance;
        distance=sqrt(pow((x-x2),2)+(pow((y-y2),2)));
        return distance;
    }

    double[] distance(double[] xy){
        return xy;
    }


}