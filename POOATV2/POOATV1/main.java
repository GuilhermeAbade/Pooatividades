package Geometry;

public class Main {
    public static void main(String[] args) {
        displayCircleInfo();

        Triangle myValidTriangle = new Triangle();
        myValidTriangle.setSides(3, 4, 5);
        myValidTriangle.displayTriangleInfo();

        Triangle myInvalidTriangle = new Triangle();
        myInvalidTriangle.setSides(1, 4, 2);
        myInvalidTriangle.displayTriangleInfo();

        displaySquareInfo();

        Rectangle myRectangle = new Rectangle();
        myRectangle.setDimensions(3, 4);
        myRectangle.displayRectangleInfo();
    }

    private static void displayCircleInfo() {
        System.out.println("Círculo:");

        Circle myCircle = new Circle();
        myCircle.setRadius(3);
        myCircle.displayCircleInfo();
    }

    private static void displaySquareInfo() {
        System.out.println("Quadrado:");

        Square mySquare = new Square();
        mySquare.setSide(3);
        mySquare.displaySquareInfo();
    }
}
