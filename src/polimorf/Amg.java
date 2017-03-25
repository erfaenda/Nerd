package polimorf;

/**
 * Created by alex on 25.03.2017.
 */
public class Amg extends AbstractCar {
    @Override
    public void drive() {
        System.out.println("Еду разгоняясь до 100 за 3 секунды!");
    }

    @Override
    public void light() {
        System.out.println("Я сияю ярко! Я сияю ЯРКО!");
    }

    @Override
    public void bibBib() {
        System.out.println("Я мерседес АМГ и просто красавец!");
    }
}
