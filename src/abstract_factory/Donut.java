package abstract_factory;

public class Donut extends Sweet{

    public Donut(TypesOfSweets typesOfSweets, FillingTypes fillingTypes, GlazeTypes glazeTypes, CreamType creamType) {
        super(typesOfSweets, fillingTypes, glazeTypes, creamType);
    }

    @Override
    public String toString() {
        return "donut.\n" +
                "with glaze - " + glazeTypes +
                ", filled with " + fillingTypes +
                ", cream type is" + creamType;
    }
}
