/**
 * Created by alex on 22.03.17.
 */
public class StaticValue {
    private String fname;
    private String lname;
    private static int count = 0;

    public StaticValue(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        count = getCount() + 1;
        System.out.printf("%s %s: в фильме 12 стульев - %d персонаж(а\\ей). \n", fname, lname, getCount());


    }

    public static int getCount() {
        return count;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
