/**
 * Created by alex on 20.02.2017.
 */
public class BankProcent22 {
    public static void main(String[] args) {
        double vklad = 816000;
        double procent = 0.05;

        for (int year = 1; year <= 30; year++) {
            vklad += vklad*procent;
            System.out.println("За " + year + " год, на Вашем счету появилось " + vklad + " сумма долларов!" );
        }
    }
}
