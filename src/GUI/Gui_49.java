package GUI;

import javax.swing.JOptionPane;

/**
 * Created by alex on 06.04.17.
 */
public class Gui_49 {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Введи первое число: "); //метод отвечает за всплывающие окно ждущее ввод
        String sn = JOptionPane.showInputDialog("Введи второе число: ");

        int num1 = Integer.parseInt(fn); // парсим число в интегер
        int num2 = Integer.parseInt(sn);

        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "сумма равна " + sum, "Кулькуль", JOptionPane.PLAIN_MESSAGE);//метод отвечает за всплывающее окно с информацией
    }
}
