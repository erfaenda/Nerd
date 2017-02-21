/**
 * Created by alex on 21.02.17.
 */
import java.util.Random; //импортировали рандом

public class StatistikaRuletki29 {
    public static void main(String[] args) {
        Random ruletka = new Random(); //инициализировали рандом

        int massive[] = new int[33]; //создали массив из 33 позиций

        for (int i = 0; i < 1000; i++) { //Прокрутили рулетку 1000 раз
            ++massive[ruletka.nextInt(33)]; //каждый добавляя 1 к выпавшему числу
        }
        System.out.println("Номер\tЧисло"); //шапка

        for (int i = 0; i < massive.length; i++) { //выводим на экран длинну массива
            System.out.println(i + "\t" + massive[i]);
        }

    }
}
