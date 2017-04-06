/**
 * Created by alex on 17.02.17.
 */
import java.util.Scanner;

public class if_else9 {
    public static void main(String[] args) {
        System.out.println("Сколько лет Мише?");
        Scanner enterM = new Scanner(System.in);
        int Misha = enterM.nextInt();

        System.out.println("Сколько лет Леше?");
        Scanner enterA = new Scanner(System.in);
        int Alesha = enterA.nextInt();



        if (Misha > Alesha) {
            System.out.println("Мише " + Misha + " лет, он старше Алеши");
        }
        else if (Misha == Alesha){
            System.out.println("Алеше и Мише по " + Alesha + " лет");
        }
        else {
            System.out.println("Алеша старше Миши ");
        }
    }
}
