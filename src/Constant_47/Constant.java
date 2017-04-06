package Constant_47;

/**
 * Created by alex on 06.04.17.
 */
public class Constant {
    private int sum;
    private final int num;

    public Constant(int num) {
        this.num = num;
    }
    public void add() {
        sum += num;
    }
    public String toString() {
        return String.format("Сумма чисел равна = %s\n", sum);
    }
}
