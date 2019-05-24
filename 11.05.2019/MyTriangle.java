/*
Zadanie nr3 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/

import static java.lang.Math.pow;
        import static java.lang.StrictMath.sqrt;

public class MyTriangle extends  MyPoint {

    int x1,x2,x3,y1,y2,y3;
    String type;
    double bokA=sqrt(pow((x1-x2),2)+(pow((y1-y2),2)));
    double bokB=sqrt(pow((x2-x3),2)+(pow((y2-y3),2)));
    double bokC=sqrt(pow((x3-x1),2)+(pow((y3-y1),2)));

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }

    public void v1(int x1, int y1){
        this.x1=x1;
        this.y1=y1;
        System.out.println("x1: "+x1+" y1:"+y1);
    }

    public void v2(int x2, int y2){
        this.x2=x2;
        this.y2=y2;
        System.out.println("x2: "+x2+" y2:"+y2);
    }

    public void v3(int x3, int y3){
        this.x3=x3;
        this.y3=y3;
        System.out.println("x3: "+x3+" y3:"+y3);
    }

    public String toString(){
        return "[v1="+x1+" , "+y1+"v2="+x2+" , "+y2+",v3= "+x3+" , "+y3+" ]";
    }

    double getPerimeter(int x, int y, int x2, int y2){
        double distance;
        distance=sqrt(pow((x-x2),2)+(pow((y-y2),2)));
        return distance;
    }

    String getType(String type){
        if(bokA==bokB&&bokA==bokC&&bokB==bokC){
            type="Equilateral"; // Rownoboczny
        }
        if(bokA==bokB||bokA==bokC||bokB==bokC){
            type="Isosceles"; // Rownoramienny
        }
        if(bokA!=bokB&&bokA!=bokC&&bokB!=bokC){
            type="Scalene"; // Różnoboczny
        }
        return " ";
    }

}
