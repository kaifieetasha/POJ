//Autorzy: Iwona Rymanowska (nr indeksu 19330) oraz Jakub Janduła (nr indeksu 6343)
public class Triangle {
    private int sideA;
    private int arm1;
    private int arm2;

    public int getSideA() {
        return sideA;
    }
    public int getArm1() {
        return arm1;
    }
    public int getArm2() {
        return arm2;
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public void setArm1(int arm1) {
        this.arm1 = arm1;
    }
    public void setArm2(int arm2) { this.arm2 = arm2; }
    public double areaOfTriangle(){
        double p=((double) sideA+arm1+arm2)/2;
        return Math.sqrt((p-sideA)*(p-arm1)*(p-arm2));
    }
    public int circuit(){ //obwodd
        return sideA+arm2+arm1;
    }
    public void isEquilateral(){
        if (sideA==arm1){
            System.out.println("Trójkąt równoboczny");
        } if (sideA==arm2){
            System.out.println("Trójkąt równoboczny");
        } if (arm1==arm2){
            System.out.println("Trójkąt równoboczny");
        }
    }
    public void isIsosceles(){
        if (arm1==arm2&&arm2==sideA){
            System.out.println("Trójkąt równoboczny");
        }
    }
    public void isScalene(){
        if (sideA!=arm2&&arm2!=arm1){
            System.out.println("Trójkąt różnoboczny");
        }
    }
}
