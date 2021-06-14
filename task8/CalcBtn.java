package task8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcBtn implements ActionListener {

    private final JTextField textField;

    public CalcBtn(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        String[] parts = text.split("\\+");

        int summ = 0;
        for (int i = 0; i < parts.length; i++) {
            summ += Integer.parseInt(parts[i]);
        }

        textField.setText(String.valueOf(summ));
    }
}
