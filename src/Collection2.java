/**
 * Created by alex on 14.03.2017.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collection2 {

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

        editList(list1, list2); //вызываю метод с параметрами в виде параметров выступают список 1 и список 2

        System.out.println(); // оступаю 1 строку

        for (int i = 0; i<list1.size(); i++)
            System.out.printf(" Список 1 - %s \n", list1.get(i)); //вновь пробегаю по списку 1 и вывожу его на экран

    }
    public static void editList(Collection<String> lst1, Collection<String> lst2){ //создали какуюто фигню которую будем сравнивать
        Iterator<String> iterator = lst1.iterator(); //создали итератор хз что это
        while (iterator.hasNext()){ //цикл идет до конца всего что есть в итераторе
            if(lst2.contains(iterator.next())) //если в итераторе есть какойто елемент из фигне из списка 2
                iterator.remove(); // то удалять этот элемент из итератора :(
        }
    }

}
