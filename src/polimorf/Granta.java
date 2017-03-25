package polimorf;

/**
 * Created by alex on 25.03.2017.
 */
public class Granta extends AbstractCar {
    @Override
    public void drive() {
        System.out.println("Едеем Еддеем в соседнее село на дискотЭку");
    }

    @Override
    public void light() {
        System.out.println("Фары отрегулированы и готовы светить");
    }

    @Override
    public void bibBib() {
        System.out.println("Привет я Лада Гранта детище российского автопрома!");
    }
}
