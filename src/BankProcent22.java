/**
 * Created by alex on 20.02.2017.
 */
public class BankProcent22 {
    public static void main(String[] args) {
        double vklad = 816000;
        double procent = 0.05;
        double itog = 0;

        for (int year = 1; year <= 30; year++) {
            vklad += vklad*procent;
            System.out.println("За " + year + " год, на ваша переплата по счету составит " + (vklad - 816000) + " рублей!" );
        }
        itog = vklad - 816000;
        System.out.println("Общая переплата по кредиту равна: " + itog + " рублей");
    }
}
