/**
 * Created by alex on 22.03.17.
 */
public class MainEnum {
    public static void main(String[] args) {
        for(Eenum heros : Eenum.values())
            System.out.printf("%s - %s и %s\n", heros, heros.getDESC1(), heros.getDESC2());
    }
}
