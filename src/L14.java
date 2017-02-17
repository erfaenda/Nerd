/**
 * Created by alex on 17.02.17.
 */
public class L14 {
    private String movieName;
    public void setName(String name) {
        movieName = name;
    }
    public String getName(){
        return movieName;
    }
    public void output(){
        System.out.printf("Твой любимый фильм - %s", getName());
    }
}
