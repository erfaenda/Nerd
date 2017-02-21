/**
 * Created by alex on 21.02.17.
 */
public class SumElementsMassive28 {
    public static void main(String[] args) {
        int Massive[] = {22, 3, 11, 33, 2, 19};

        int sum = 0;

        for (int i = 0; i < Massive.length; i++) {
            sum += Massive[i];

        }
        System.out.println("Сумма всех элементов массива равна: " + sum);
    }

}
