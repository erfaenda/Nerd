import java.util.LinkedList;
import java.util.List;

/**
 * Created by alex on 17.03.17.
 */
public class Collection3 {
    public static void main(String[] args) {
        String[] zveri1 = {"кот", "пингвин", "волк", "ежик", "дракон"}; //инициализировали первый текстовый массив инициализировали его и передали в него нектоторые элементы
        List<String> list1 = new LinkedList<String>(); //инициализировали список, а именно свящанный список ЛинкедЛист
        for(String x : zveri1) //передаем все елементы массива в первый список
            list1.add(x);
        String[] zveri2 = {"удав", "волк", "ЕЖиК", "ниблер"};
        List<String> list2 = new LinkedList<String>();
        for(String x : zveri2)
            list2.add(x);
        list1.addAll(list2); //метод аддАЛЛ добавит все элементы первого списка во второй список
        list2 = null; //обнуление второго списка

        /*printList(list1);
        removeFromList(list1, 1, 2);
        printList(list1);
        reverseList(list1); */


    }
}
