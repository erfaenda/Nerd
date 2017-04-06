package Constant_47;

/**
 * Created by alex on 06.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Constant finalObject = new Constant(7);

        for (int i = 0; i < 8; i++) {
            finalObject.add();
            System.out.printf("%s", finalObject);
        }
    }
}
