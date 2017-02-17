import java.util.Scanner;

/**
 * Created by alex on 17.02.17.
 */
public class DopContructor16 {
    private String movieName;

    public DopContructor16(String name) {
        movieName = name;
    }
    public void setName(String name){
        movieName = name;
    }
    public String getName(){
        return movieName;
    }
    public void output(){
        System.out.printf("Твой любимый фильм - %s", getName());

    }
}
