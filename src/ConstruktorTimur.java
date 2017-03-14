import instanse.Car;
import instanse.Phone;

/**
 * Created by alex on 01.03.2017.
 */

public class ConstruktorTimur {
    public static void main(String[] args) {
        Phone phone = new Phone(1024, "Nokia", "GSM");

        System.out.println("phone.getType() = " + phone.getType());

        Car car1 = new Car("Lada 2110", "Grey", 180);

        System.out.println("Машина " + car1.getName() + car1.getColor() + car1.getMaxSpeed());
    }

}
