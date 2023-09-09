package Geometry;

public class Square {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }
    
    private double getPerimeter() {
        return 4 * this.side;
    }

    private double getSurfaceArea() {
        return Math.pow(this.side, 2);
    }

    public void displaySquareInfo() {
        
        System.out.printf("Lado do quadrado: %.2f%n", this.side);
        System.out.printf("Perímetro do quadrado: %.2f%n", this.getPerimeter());
        System.out.printf("Área do quadrado: %.2f%n", this.getSurfaceArea());
        
    }
}
