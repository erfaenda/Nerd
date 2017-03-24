/**
 * Created by alex on 22.03.17.
 */
import java.util.EnumSet; //более гибкое перечисление
public class MainEnum {
    public static void main(String[] args) {
        for(Eenum heros : Eenum.values())
            System.out.printf("%s - %s и %s\n", heros, heros.getDESC1(), heros.getDESC2());
        System.out.println("\nА тут мы видим, как выглядит вывод диапазона перечислений!\n");

        for(Eenum heros : EnumSet.range(Eenum.Den, Eenum.Manya))
            System.out.printf("%s - %s и %s\n", heros, heros.getDESC1(), heros.getDESC2());
    }
}
