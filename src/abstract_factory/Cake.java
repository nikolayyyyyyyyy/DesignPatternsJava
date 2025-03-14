package abstract_factory;

public class Cake extends Sweet{
    private int layers;


    public Cake(TypesOfSweets typesOfSweets, FillingTypes fillingTypes, GlazeTypes glazeTypes, CreamType creamType, int layers) {
        super(typesOfSweets, fillingTypes, glazeTypes, creamType);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return "cake. \nLayers count= " + layers + ", filling type is = " + fillingTypes +
                ", glaze type is = " + glazeTypes +
                " and cream is = " + creamType;
    }

}
