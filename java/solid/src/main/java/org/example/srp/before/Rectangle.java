package org.example.srp.before;

public class Rectangle {
    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void draw() {
        System.out.println("Pretend a rectangle is being drawn with dimensions of " + width + "x" + length);
    }

    public int calculateArea() {
        return width * length;
    }
}
