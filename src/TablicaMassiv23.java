/**
 * Created by alex on 21.02.17.
 */
public class TablicaMassiv23 {
    public static void main(String[] args) {
        System.out.println("Поз\tЗнач"); //что то типо пробела в середине этого слова, разделитель \t -это знак табуляции
        String massive[] = {"еж", "лис", "пес", "уж" };

        for (int i = 0; i < massive.length; i++){ //возвращает число элементов в массиве
            System.out.println(i + "\t" + massive[i]); // аналогично записи в самом верху разделитель
        }
    }
}
