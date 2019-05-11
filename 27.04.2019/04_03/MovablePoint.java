public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint (float _x, float _y, float _xSpeed, float _ySpeed) {
        super(_x, _y);
        xSpeed = _xSpeed;
        ySpeed = _ySpeed;
    }
    public MovablePoint () {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed () {
        float[] tab = {xSpeed, ySpeed};
        return tab;
    }

    public String toString() {
        return "("+this.getX()+","+this.getY()+")"+", speed=("+xSpeed+", "+ySpeed+")";
    }

    public MovablePoint move () {
        this.getX();
        this.getY();

        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);

        return this;
    }
}

