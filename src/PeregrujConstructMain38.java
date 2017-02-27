/**
 * Created by alex on 27.02.17.
 */
public class PeregrujConstructMain38 {
    public static void main(String[] args) {
        PeregrujConsruct38 Construct1 = new PeregrujConsruct38();
        PeregrujConsruct38 Construct2 = new PeregrujConsruct38(2017);
        PeregrujConsruct38 Construct3 = new PeregrujConsruct38(2007, 15);
        PeregrujConsruct38 Construct4 = new PeregrujConsruct38(2001, 17,28);

        System.out.printf("%s\n", Construct1.toDisplay());
        System.out.printf("%s\n", Construct2.toDisplay());
        System.out.printf("%s\n", Construct3.toDisplay());
        System.out.printf("%s\n", Construct4.toDisplay());

    }
}
