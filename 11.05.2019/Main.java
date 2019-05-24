/*
Klasa Main Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/


class Main {

    public static void main(String[] args) {
        int[] tabOfX = new int[11];
        int[] tabOfY = new int[11];

        MyPoint point = new MyPoint(3,1);


        for (int i = 1; i < 11; i++) {
            tabOfX[i] = i;
            tabOfY[i] = i;
            System.out.println("Odleglosc pomiedzy [x:0 , y:0] a " + "[x1:" + tabOfX[i] + " , y1:" + tabOfY[i] + "] wynosi: "
                    + point.distance(0, 0, tabOfX[i], tabOfY[i]));
        }

            System.out.println("Hello World!");
            MyPoint p1 = new MyPoint(3, 4);
            MyCircle c1 = new MyCircle(p1, 4);
            MyRectangle r1 = new MyRectangle(point,p1);
            MyTriangle triangle = new MyTriangle(1,1,2,2,3,3);

            System.out.println(c1.toString() + " " + c1.getArea() + " " + c1.getCircumference() + " " + c1.getRadius());
            System.out.println(r1.toString());
    }
}
