package Lab1.ex4.models;

import Lab1.ex4.exceptions.WaterBodyException;

public class River extends WaterBody{
    private final double speed;

    public River(String name,
                 double depth,
                 Fish[] fish,
                 double speed) throws WaterBodyException {
        super(name, depth, fish);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean isFloaty() {
        return this.getDepth() >= 3 && this.speed <= 30;
    }
}
