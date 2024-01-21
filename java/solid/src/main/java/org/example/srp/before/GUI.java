package org.example.srp.before;

import java.util.List;

public class GUI {
    private final List<Rectangle> rectangles;

    public GUI(List<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public void drawRectangles() {
        rectangles.forEach(Rectangle::draw);
    }
}
