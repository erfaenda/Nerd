/**
 * Created by alex on 22.03.17.
 */
public class StaticValueMain {
    public static void main(String[] args) {
        StaticValue pers1 = new StaticValue("Astap", "Bender");
        StaticValue pers2 = new StaticValue("Kisa", "Vorobyanin");
        StaticValue pers3 = new StaticValue("Otec", "Fedor");

        System.out.println();

        System.out.println(pers2.getFname());
        System.out.println(pers2.getLname());
        System.out.println(StaticValue.getCount());
    }


}
