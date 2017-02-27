/**
 * Created by alex on 27.02.17.
 */
public class PeregrujConsruct38 {
    private int year;
    private int month;
    private int date;

    public PeregrujConsruct38() {
        this(0,0,0);
    }
    public PeregrujConsruct38(int y) {
        this(y,0,0);
    }
    public PeregrujConsruct38(int y, int m) {
        this(y, m, 0);
    }

    public PeregrujConsruct38(int y, int m, int d) {
        setDate(y,m,d);
    }
    public void setDate(int y, int m, int d) {
        setYear(y);
        setMonth(m);
        setDay(d);
    }
    public void setYear(int y) {
        year = ((y >= 1900 && y <= 2017) ? y:2017);
    }
    public void setMonth(int m) {
        month = ((m >= 1 && m <= 12) ? m:1);
    }
    public void setDay(int d) {
        date = ((d >= 1 && d <= 31) ? d:1);
    }

    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public  int getDate() {
        return date;
    }
    public String toDisplay() {
        return String.format("%04d-%02d-%02d", getYear(), getMonth(), getDate());
    }


}
