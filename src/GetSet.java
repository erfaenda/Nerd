import instanse.Car;
import instanse.Doors;

public class GetSet {

    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Nissan");

        System.out.println(car.getName());

        Doors redCashDoor = new Doors();
        redCashDoor.setColor("RED");
        redCashDoor.setMaterial("STEEL");
        redCashDoor.setCost(21000);
        System.out.println(redCashDoor.getColor());
        System.out.println(redCashDoor.getMaterial());
        System.out.println(redCashDoor.getCost());

    }
}