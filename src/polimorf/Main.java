package polimorf;

/**
 * Created by alex on 25.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Cops cops = new Cops();
        Granta granta = new Granta();
        Amg amg = new Amg();
        PolyCar polyCar = new PolyCar();
        AbstractCar copss = new Cops();

        polyCar.morphing(cops);
        System.out.println();
        polyCar.morphing(granta);
        System.out.println();
        polyCar.morphing(amg);
        System.out.println();
        cops.rdrive();

    }
}
