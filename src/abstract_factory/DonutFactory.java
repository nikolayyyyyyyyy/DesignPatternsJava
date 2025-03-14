package abstract_factory;

public class DonutFactory {
    public Donut create(){
        return new Donut(TypesOfSweets.DONUT, FillingTypes.NUTELLA, GlazeTypes.LEMON,CreamType.CHOCOLATE);
    }
}
