package Lab1.ex4.models;

import Lab1.ex4.exceptions.WaterBodyException;

public class Lake extends WaterBody{
    private final double width;
    private final double length;

    public Lake(String name,
                double depth,
                Fish[] fish,
                double width,
                double length) throws WaterBodyException {
        super(name, depth, fish);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean isFloaty() {
        return this.getDepth() >= 5 && width >= 1000 && length >= 1000;
    }
}
