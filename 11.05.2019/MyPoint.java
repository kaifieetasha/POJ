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

    public void toString(int x, int y){
        System.out.println("x: "+x+" y:"+y);
    }

    double distance(int x, int y, int x2, int y2){
        double distance;
        distance=sqrt(pow((x-x2),2)+(pow((y-y2),2)));
        return distance;
    }

    double[] distance(double[] xy){
        return xy;
    }

    public static void main(String[] args) {

        int[] tabOfX = new int[11];
        int[] tabOfY = new int[11];

        MyPoint punkt = new MyPoint();

        for(int i=1;i<11;i++) {
            tabOfX[i]=i;
            tabOfY[i]=i;
            System.out.println("Odleglosc pomiedzy [x:0 , y:0] a "+"[x1:"+tabOfX[i]+" , y1:"+tabOfY[i]+"] wynosi: "
                    +punkt.distance(0, 0, tabOfX[i], tabOfY[i]));
        }
    }
}