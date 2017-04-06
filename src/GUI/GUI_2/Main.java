package GUI.GUI_2;

import javax.swing.JFrame;

/**
 * Created by alex on 06.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Alex wnd = new Alex();//создали обьект класса с конструктором
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//присвоили значение по умолчанию для кнопки с крестиком
        wnd.setSize(400, 200);//установили размер окна!
        wnd.setVisible(true);//установили видимость окна
    }
}
