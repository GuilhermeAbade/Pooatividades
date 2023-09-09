package Geometry;

public class Rectangle {
    private double width;
    private double height;

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    private double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    private double getSurfaceArea() {
        return this.height * this.width;
    }

    public void displayRectangleInfo() {
 
        System.out.printf("Lados do retângulo: %.2f %.2f%n", this.width, this.height);
        System.out.printf("Perímetro do retângulo: %.2f%n", this.getPerimeter());
        System.out.printf("Área do retângulo: %.2f%n", this.getSurfaceArea());
     
    }
}
