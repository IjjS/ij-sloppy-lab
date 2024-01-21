package org.example.srp.after;

import java.util.List;
import org.example.srp.before.Rectangle;

public class RectangleCalculator {
    private final List<GeometricRectangle> rectangles;

    public RectangleCalculator(List<GeometricRectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public int calculateAreaSum() {
        int areaSum = rectangles.stream()
                .map(GeometricRectangle::calculateArea)
                .reduce(Integer::sum)
                .get();

        return areaSum;
    }
}
