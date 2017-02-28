/**
 * Created by alex on 17.02.17.
 */

import java.util.Scanner;

public class Kira12 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        L12 LDetective = new L12();
        System.out.println("Скажи имя:");

        String name = enter.nextLine();
        LDetective.LSay(name);


    }
}
