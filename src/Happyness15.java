/**
 * Created by alex on 17.02.17.
 */
import java.util.Random;
import java.util.Scanner;

public class Happyness15 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner enter = new Scanner(System.in);

        int Happy, Luck, Rich, Inta, Health, Age;
        Happy = 0;
        Luck = 0;
        Rich = 0;
        Inta = 0;
        Health = 0;

        System.out.println("Скажи сколько тебе лет сейчас: ");
        Age = enter.nextInt();

        while (Age < 100) {
            Happy += random.nextInt(100);
            Luck += random.nextInt(100);
            Rich += random.nextInt(100);
            Inta += random.nextInt(100);
            Health += random.nextInt(100);
            Age++;

        }
        System.out.println("В ваши " + Age + " лет вы круто перец");
        System.out.println("Уровень счастья равен " + Happy);
        System.out.println("Уровень удачи равен " + Luck);
        System.out.println("Уровень счастья равен " + Rich);
        System.out.println("Уровень счастья равен " + Inta);
        System.out.println("Уровень счастья равен " + Health);
    }
}
