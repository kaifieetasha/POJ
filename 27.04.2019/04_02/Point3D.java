import java.lang.reflect.Array;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D (float _x, float _y, float _z){
        super(_x,_y);
        z = _z;
    }
    public Point3D(){

    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float _x, float _y, float _z){
        this.setX(_x);
        this.setY(_y);
        this.setZ(_z);
    }
    public float[] getXYZ() {
        float[] tab = {getX(),getY(),getZ()};
        return tab;
    }
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }

}