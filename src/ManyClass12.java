/**
 * Created by alex on 17.02.17.
 */
import java.util.Scanner;

public class ManyClass12 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        DopClass12 Kira = new DopClass12();
        System.out.println("Скажи имя:");

        String name = enter.nextLine();
        Kira.KiraSay(name);

    }
}
