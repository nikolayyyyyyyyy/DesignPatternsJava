package abstract_factory;

public class Sweet implements Dessert{
    private TypesOfSweets typesOfSweets;
    protected FillingTypes fillingTypes;
    protected GlazeTypes glazeTypes;
    protected CreamType creamType;

    @Override
    public String bake() {
        return "Baking ..." + this ;
    }

    public Sweet(TypesOfSweets typesOfSweets, FillingTypes fillingTypes, GlazeTypes glazeTypes, CreamType creamType) {
        this.typesOfSweets = typesOfSweets;
        this.fillingTypes = fillingTypes;
        this.glazeTypes = glazeTypes;
        this.creamType = creamType;
    }


}
