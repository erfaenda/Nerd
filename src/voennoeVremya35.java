/**
 * Created by alex on 24.02.2017.
 */
public class voennoeVremya35 {
    public static void main(String[] args) {
        voennoe35 time = new voennoe35();
        System.out.println(time.toMilitary());

        time.setTime(15,55,68);
        System.out.println(time.toMilitary());

        System.out.println(time.toNormal());
    }
}
