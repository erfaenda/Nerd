/**
 * Created by alex on 22.03.17.
 */
public enum Eenum {
    Amy("Китайянка", "не секси"),
    Fry("туп", "ленив"),
    Rick("алк", "гений"),
    Alex("Easy", "cool"),
    Den("тупой", "ленивый хуй"),
    Manya("безотвецтвенная", "зашоренная");

    private final String DESC1;
    private final String DESC2;

    Eenum(String DESC1, String DESC2) {
        this.DESC1 = DESC1;
        this.DESC2 = DESC2;
    }

    public String getDESC1() {
        return DESC1;
    }

    public String getDESC2() {
        return DESC2;
    }

}
