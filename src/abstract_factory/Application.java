package abstract_factory;


public class Application {
    public static void main(String[] args) {
        CakeFactory cakeFactory = new CakeFactory();
        DonutFactory donutFactory = new DonutFactory();
        Cake cake = cakeFactory.create();
        Donut donut = donutFactory.create();
        System.out.println(cake.bake());
        System.out.println(donut.bake());
    }
}
