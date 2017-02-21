/**
 * Created by alex on 21.02.17.
 */
public class MassiveVmetode31 {
    public static void main(String[] args) {
        String massive[] = {"Akane", "Rioka", "Ranma", "Arnika"};
        title(massive);

        for (String i:massive){
            System.out.println(i);
        }


    }
    public static void title(String t[]) {
        for (int i = 0; i < t.length; i++ ){
            t[i] += " - та еще штучка!";
        }
    }
}
