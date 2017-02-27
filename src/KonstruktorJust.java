/**
 * Created by alex on 27.02.17.

public class KonstruktorJust { //просто класс с неопределенными параментами
        int age;//поле
        String firstName;//поле
        String lastName;//поле
        User() {//вот так выглядит конструктор по умолчанию, его как бы нет, но он есть, джава создает его дефолту
            //пусто
        }
    }
}
*/

public class KonstruktorJust {
    int age;//поле
    String firstName;//поле
    String lastName;//поле
    public KonstruktorJust(int age, String firstName, String lastName) {//конструктор с тремя параметрами
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        KonstruktorJust human = new KonstruktorJust(30, "Alex", "Silushka");
        System.out.println(human.age);
    }

}