package abstract_factory;

public class Eclair extends Sweet{
    public Eclair(TypesOfSweets typesOfSweets, FillingTypes fillingTypes, GlazeTypes glazeTypes, CreamType creamType) {
        super(typesOfSweets, fillingTypes, glazeTypes, creamType);
    }

    @Override
    public String toString() {
        return "Eclair " +
                "with filling - " + fillingTypes +
                ", glaze - " + glazeTypes +
                ", and cream " + creamType;
    }
}
