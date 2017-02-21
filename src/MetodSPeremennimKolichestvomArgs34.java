/**
 * Created by alex on 21.02.17.
 */
public class MetodSPeremennimKolichestvomArgs34 {
    public static void main(String[] args) {
        System.out.println(av(12,12,12,12,12,12,12));
    }
    public static int av(int...num){ //создан метод av с заранее неизвестным кол-вом аргументов num
        int sum = 0;

        for (int i:num){ //идет перебор всех аргументов переданных в метод
            sum += i;//все аргументы складываються в переменную sum
        }
        return sum/num.length; // метод возвращает сумму всех аргументов деленных на кол-во переданных аргументов т.е узнаем среднее число всех аргументов
    }
}
