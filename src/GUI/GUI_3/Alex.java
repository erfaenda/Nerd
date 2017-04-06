package GUI.GUI_3;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;//отслеживает действия
import java.awt.event.ActionEvent;//реагирует на события которые отслеживались
import javax.swing.JFrame;
import javax.swing.JTextField;//тестовое поле
import javax.swing.JPasswordField;//поле с паролем
import javax.swing.JOptionPane;//всплывающее окно с информацией

/**
 * Created by alex on 06.04.17.
 */
public class Alex extends JFrame {
    private JTextField pole1;
    private JTextField pole2;
    private JTextField pole3;

    private JPasswordField pass;

    public Alex() {
        super("main window");
        setLayout(new FlowLayout());
        pole1 = new JTextField(10);
        add(pole1);
        pole2 = new JTextField("Input your text here!");
        add(pole2);
        pole3 = new JTextField("disable", 20);
        pole3.setEditable(false); //говорим что после не редактируемое
        add(pole3);
        pass = new JPasswordField("My passwd");
        add(pass);
        Obrabotchik obrabotka = new Obrabotchik(); //добавили обработчик
        pole1.addActionListener(obrabotka);//каждому полю присвоили этот обработчик
        pole2.addActionListener(obrabotka);
        pole3.addActionListener(obrabotka);
        pass.addActionListener(obrabotka);

    }
    private class Obrabotchik implements ActionListener { //унаследовались от интерфейса
        public void actionPerformed(ActionEvent event) { //реализовали его единственный метод который слушает
            String string = "";//создали пустую строковую переменную
            if(event.getSource()==pole1)//слушает: что было в поле когда на него нажали Enter
                string = String.format("Pole 1: %s", event.getActionCommand());
            else if (event.getSource()==pole2)
                string = String.format("Pole 2: %s", event.getActionCommand());
            else if (event.getSource()==pole3)
                string = String.format("Pole 3: %s", event.getActionCommand());
            else if (event.getSource()==pass)
                string = String.format("Pole password: %s", event.getActionCommand());
            JOptionPane.showMessageDialog(null, string);//выведено по центру экрана выведет то что в переменной string
        }

    }
}
