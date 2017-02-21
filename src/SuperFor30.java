/**
 * Created by alex on 21.02.17.
 */
public class SuperFor30 {
    public static void main(String[] args) {
        int Beer[] = {1, 2, 3, 8, 6};
        int sum = 0;

        for (int i:Beer){ //Продвинутый цикл ФОР ему нужно только два парамета. при первом прогоне первый элемент массива и далее он увеличиваеться на 1
            sum += i;
        }
        System.out.println("Было выпито " + sum + " кружек пива.");
    }
}
