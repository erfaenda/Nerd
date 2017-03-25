package polimorf;

/**
 * Created by alex on 25.03.2017.
 */
public class Cops extends AbstractCar {
    public void smoke(){
        System.out.println("Я гниющий копс! Я дымлю! Законом не запрещено");
    }

    public void rdrive() {
        super.drive();
    }

    @Override
    public void drive() {
        System.out.println("Еду как могу и вообще законом копс еще не запрещен!");
    }

    @Override
    public void light() {
        System.out.println("Одна фара светит и это уже законом запрещенно");
    }

    @Override
    public void bibBib() {
        System.out.println("Привет! Я бешенный копс! Мне лет больше чем моему водителю!");
    }
}
