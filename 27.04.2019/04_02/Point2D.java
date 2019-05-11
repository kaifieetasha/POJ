import java.lang.reflect.Array;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D (float _x, float _y) {
        x = _x;
        y = _y;
    }

    public Point2D () {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] tab = {x,y};
        return tab;
    }

    public String toString() {
        return "("+x+","+y+")";
    }
}

