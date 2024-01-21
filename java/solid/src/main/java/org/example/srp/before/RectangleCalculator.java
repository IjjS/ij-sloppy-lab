package org.example.srp.before;

import java.util.List;

public class RectangleCalculator {
    private final List<Rectangle> rectangles;

    public RectangleCalculator(List<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public int calculateAreaSum() {
        int areaSum = rectangles.stream()
                .map(Rectangle::calculateArea)
                .reduce(Integer::sum)
                .get();

        return areaSum;
    }
}
