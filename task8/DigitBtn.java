package task8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitBtn implements ActionListener {

    private final JTextField inputField;

    public DigitBtn(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        StringBuilder sb = new StringBuilder(this.inputField.getText());
        sb.append(btn.getText());

        this.inputField.setText(sb.toString());
    }
}
