// 25.05.2019 r, Lab6. Zad3.
// Adrian Szostak, s19777
// Iwona Rymanowska s19330

public abstract class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }



    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    @Override
    public void moveUp()
    {
        y -= ySpeed;
    }

    @Override
    public void moveDown()
    {
        y += ySpeed;
    }

    @Override
    public void moveLeft()
    {
        x -= xSpeed;
    }

    @Override
    public void moveRight()
    {
        x += xSpeed;
    }
}
