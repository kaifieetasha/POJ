//Autorzy: Iwona Rymanowska (nr indeksu 19330) oraz Jakub Janduła (nr indeksu 6343)
public class Rectangle {
    private int sideA;
    private int sideB;
    private double diagonal;

    public int getSideA(){
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    public int areaOfARectangle(){
        return sideA*sideB;
    }
    public double diag(){
        diagonal= Math.pow(sideA,2)+Math.pow(sideB,2);
        diagonal=Math.sqrt(diagonal);
        return diagonal;
    }
}