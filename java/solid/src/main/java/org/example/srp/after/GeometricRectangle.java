package org.example.srp.after;

public class GeometricRectangle {
    private final Rectangle rectangle;

    public GeometricRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public int calculateArea() {
        return rectangle.getWidth() * rectangle.getLength();
    }

    public int calculatePerimeter() {
        return 2 * (rectangle.getWidth() + rectangle.getLength());
    }

    public double calculateDiagonal() {
        double widthSquare = Math.pow(rectangle.getWidth(), 2);
        double lengthSquare = Math.pow(rectangle.getLength(), 2);

        return Math.sqrt(widthSquare + lengthSquare);
    }
}
