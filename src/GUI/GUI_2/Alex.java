package GUI.GUI_2;

import java.awt.FlowLayout; //библиотека поможет сама расположить графические елементы в окнах
import javax.swing.JFrame; //полный выбор инструментов с окнами windows свернуть развернуть итд
import javax.swing.JLabel; //можно использовать текст и картинки в окне

/**
 * Created by alex on 06.04.17.
 */
public class Alex extends JFrame {
    private JLabel text1; //создали переменную

    public Alex() {
        super("Окно"); //заголовок окна
        setLayout(new FlowLayout());//установили верстку
        text1 = new JLabel("Загорелся Писькин дом!!!"); //присвоили переменной значение
        text1.setToolTipText("Ведь реально загорелся, это не шутка!");//присвоили подзказку при навелении на надпись
        add(text1);//добавили все это в наше окно
    }
}
