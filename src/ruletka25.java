/**
 * Created by alex on 21.02.17.
 */
import java.util.Random;

public class ruletka25 {
    public static void main(String[] args) {
        Random ruletka = new Random();

        for (int i = 1; i < 11; i++) {
            System.out.println(ruletka.nextInt(32));
        }
    }
}
