/**
 * Created by alex on 27.02.17.
 */
public class TableUmojenya40 {
    public static void main(String[] args) {
        int[][] TabUm = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TabUm[i][j] = (i+1) * (j+1);
                System.out.printf("%4d", TabUm[i][j]);
            }
            System.out.println();
        }
    }
}
