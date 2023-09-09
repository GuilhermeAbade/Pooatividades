package Geometry;

public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    private double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    private double getSurfaceArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public void displayCircleInfo() {
    
        System.out.printf("Raio do círculo: %.2f%n", this.radius);
        System.out.printf("Circunferência do círculo: %.2f%n", this.getCircumference());
        System.out.printf("Área do círculo: %.2f%n", this.getSurfaceArea());
     
    }
}
