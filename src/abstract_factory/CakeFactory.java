package abstract_factory;

public class CakeFactory {
        public Cake create() {
            return new Cake(TypesOfSweets.CAKE, FillingTypes.CARAMEL,
                    GlazeTypes.FONDANT, CreamType.VANILLA,3);
        }
}

