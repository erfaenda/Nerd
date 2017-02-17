/**
 * Created by alex on 17.02.17.
 */
import java.util.Scanner;

public class Kira14 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        L14 film = new L14();

        System.out.println("Введи название своего любимого фильма: ");
        String movie = enter.nextLine();
        film.setName(movie);
        film.output();

    }


}
