/**
 * Created by alex on 14.03.2017.
 */
import java.util.*;
public class Collection1 {

    public static void main(String[] args) {
        String[] antiHeroes = {"Joker", "Grinch", "Plank", "Mistic"}; // создали массив и сразу инициализировали его с 4мя героями
        List<String> list1 = new ArrayList<String>(); // создали список list1 с сразу инициализировали его с типом ArrayList
        //Добавление элементов массива в список
        for (String x:antiHeroes) //расширенный цикл for добавили всех героев из массива в наш список
            list1.add(x);
        String[] moreAntiHeroes = {"Joker", "Mistic"}; //создали еше один массив с двуся героями
        List<String> list2 = new ArrayList<String>();//создали список 2
        for (String x:moreAntiHeroes)//заполнили список 2 из второго массива
            list2.add(x);
        for (String x:moreAntiHeroes)//дополнили в первый список еще героев из второго массива
            list1.add(x);
        for (int i = 0; i<list2.size(); i++)//пробегаем по всему списку 2
            System.out.printf(" Список 2 - %s \n", list2.get(i));//вывод в консоль содержимое второго списка с помощью форматного вывода
        for (int i = 0; i<list1.size(); i++)
            System.out.printf(" Список 1 - %s \n", list1.get(i));

    }

}
