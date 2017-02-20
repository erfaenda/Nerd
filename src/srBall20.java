/**
 * Created by alex on 20.02.17.
 */
import java.util.Scanner;

public class srBall20 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int kolvo, counter;
        counter = 0;
        int ocenka;
        double summa = 0;

        System.out.println("Введи колличество учащихся");
        kolvo = enter.nextInt();
        if (kolvo <= 0){
            System.out.println("Введи корректное колличество учащихся!");
            kolvo = enter.nextInt();

        }
        while (counter < kolvo) {
            counter++;
            System.out.println("Введи оценку " + counter + " ученика:");
            ocenka = enter.nextInt();
            if (ocenka <= 5 && ocenka > 0) {
                summa += ocenka;
            }
            else {
                System.out.println("Введи корректную оценку");
                ocenka = enter.nextInt();
            }
        }
        System.out.println("Средний балл класса равен: " + summa/kolvo);
    }
}
