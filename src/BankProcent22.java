/**
 * Created by alex on 20.02.2017.
 */
public class BankProcent22 {
    public static void main(String[] args) {
        double vklad = 264000;
        double procent = 0.14;
        double itog = 0;

        for (int year = 1; year <= 5; year++) {
            vklad += vklad*procent;
            System.out.println("За " + year + " год, на ваша переплата по счету составит " + (vklad - 264000) + " рублей!" );
        }
        itog = vklad - 264000;
        System.out.println("Общая переплата по кредиту равна: " + itog + " рублей");
    }
}
